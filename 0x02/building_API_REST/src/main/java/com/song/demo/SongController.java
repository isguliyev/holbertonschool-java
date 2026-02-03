package com.song.demo;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;

import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/songs")
public class SongController {
    private final SongRepository songRepository;
    private final SongModelAssembler songModelAssembler;

    public SongController(SongRepository songRepository, SongModelAssembler songModelAssembler) {
        this.songRepository = songRepository;
        this.songModelAssembler = songModelAssembler;
    }

    @GetMapping
    public CollectionModel<EntityModel<Song>> getAllSongs() {
        return CollectionModel.of(
            this.songModelAssembler.toCollectionModel(this.songRepository.findAll()),
            linkTo(methodOn(SongController.class).getAllSongs()).withSelfRel()
        );
    }

    @GetMapping(path = "/{id}")
    public EntityModel<Song> findSongById(@PathVariable Long id) {
        Song song = songRepository.findById(id).orElseThrow(
            () -> new SongNotFoundException(id)
        );

        return this.songModelAssembler.toModel(song);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public EntityModel<Song> addSong(@RequestBody Song song) {
        Song savedSong = this.songRepository.save(song);

        return this.songModelAssembler.toModel(savedSong);
    }

    @PutMapping(path = "/{id}")
    public EntityModel<Song> updateSong(
        @RequestBody Song song,
        @PathVariable Long id
    ) {
        Song songToUpdate = songRepository.findById(id).orElseThrow(
            () -> new SongNotFoundException(id)
        );

        songToUpdate.setName(song.getName());
        songToUpdate.setArtist(song.getArtist());
        songToUpdate.setAlbum(song.getAlbum());
        songToUpdate.setReleaseYear(song.getReleaseYear());

        Song updatedSong = this.songRepository.save(songToUpdate);
        return this.songModelAssembler.toModel(updatedSong);
    }

    @DeleteMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteSongById(@PathVariable Long id) {
        if (!this.songRepository.existsById(id)) {
            throw new SongNotFoundException(id);
        }

        this.songRepository.deleteById(id);
    }
}