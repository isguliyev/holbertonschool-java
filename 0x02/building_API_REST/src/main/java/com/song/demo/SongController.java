package com.song.demo;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class SongController {
    private SongRepository songRepository;

    public SongController() {
        this.songRepository = new SongRepository();
    }

    @GetMapping(path = "/songs")
    public List<Song> getAllSongs() {
        return songRepository.getSongs();
    }

    @GetMapping(path = "/songs/{id}")
    public Song findSongById(@PathVariable Integer id) {
        return songRepository.getSongById(id).orElseThrow(
            () -> new NoSuchElementException(
                String.format("Cannot find song: no song found with id=%d", id)
            )
        );
    }

    @PostMapping(path = "/songs")
    public Song addSong(@RequestBody Song song) {
        this.songRepository.addSong(song);

        return song;
    }

    @PutMapping(path = "/songs/{id}")
    public Song updateSong(@RequestBody Song song, @PathVariable Integer id) {
        song.setId(id);
        this.songRepository.updateSong(song);

        return song;
    }

    @DeleteMapping(path = "/songs/{id}")
    public void deleteSongById(@PathVariable Integer id) {
        this.songRepository.removeSongById(id);
    }
}