package com.song.demo;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
import java.util.NoSuchElementException;

public class SongRepository {
    private int count;

    private List<Song> songs;

    public SongRepository() {
        this.songs = new ArrayList<Song>();
        this.count = 1;
    }

    public List<Song> getSongs() {
        return new ArrayList<Song>(this.songs);
    }

    public Optional<Song> getSongById(Integer id) {
        if (id == null || id < 1) {
            throw new IllegalArgumentException("Cannot get song: invalid song id");
        }

        return songs.stream().filter(song -> song.getId().equals(id)).findFirst();
    }

    public void addSong(Song song) {
        if (song == null) {
            throw new IllegalArgumentException("Cannot add song: song is null");
        }

        song.setId(count++);
        this.songs.add(song);
    }

    public void updateSong(Song song) {
        if (song == null) {
            throw new IllegalArgumentException("Cannot update song: song is null");
        }

        if (song.getId() == null || song.getId() < 1) {
            throw new IllegalArgumentException("Cannot update song: invalid song id");
        }

        for (int i = 0; i < this.songs.size(); i++) {
            if (this.songs.get(i).getId().equals(song.getId())) {
                this.songs.set(i, song);
                return;
            }
        }

        throw new NoSuchElementException(
            String.format("Cannot update song: no song found with id=%d", song.getId())
        );
    }

    public void removeSongById(Integer id) {
        if (id == null || id < 1) {
            throw new IllegalArgumentException("Cannot remove song: invalid song id");
        }

        for (int i = 0; i < this.songs.size(); i++) {
            if (this.songs.get(i).getId().equals(id)) {
                this.songs.remove(i);
                return;
            }
        }

        throw new NoSuchElementException(
            String.format("Cannot remove song: no song found with id=%d", id)
        );
    }
}