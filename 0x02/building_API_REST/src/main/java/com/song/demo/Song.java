package com.song.demo;

import java.util.Objects;

public class Song {
    private Integer id;
    private String name;
    private String artist;
    private String album;
    private String releaseYear;

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }

        if (!(object instanceof Song)) {
            return false;
        }

        Song song = (Song) object;

        return Objects.equals(song.id, this.id)
        && Objects.equals(song.name, this.name)
        && Objects.equals(song.artist, this.artist)
        && Objects.equals(song.album, this.album)
        && Objects.equals(song.releaseYear, this.releaseYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.artist, this.album, this.releaseYear);
    }

    @Override
    public String toString() {
        return String.format(
            "%s[id=%d, name=%s, artist=%s, album=%s, releaseYear=%s]",
            this.getClass().getSimpleName(),
            this.id,
            this.name,
            this.artist,
            this.album,
            this.releaseYear
        );
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getArtist() {
        return this.artist;
    }

    public String getAlbum() {
        return this.album;
    }

    public String getReleaseYear() {
        return this.releaseYear;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }
}