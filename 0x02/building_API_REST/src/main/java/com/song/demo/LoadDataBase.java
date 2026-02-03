package com.song.demo;

import org.springframework.boot.CommandLineRunner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDataBase {
    @Bean
    CommandLineRunner initDataBase1(SongRepository songRepository) {
        return args -> {
            songRepository.save(
                new Song(
                    "name-data-1",
                    "artist-data-1",
                    "album-data-1",
                    "releaseYear-data-1"
                )
            );

            songRepository.save(
                new Song(
                    "name-data-2",
                    "artist-data-2",
                    "album-data-2",
                    "releaseYear-data-2"
                )
            );

            songRepository.save(
                new Song(
                    "name-data-3",
                    "artist-data-3",
                    "album-data-3",
                    "releaseYear-data-3"
                )
            );

            songRepository.save(
                new Song(
                    "name-data-4",
                    "artist-data-4",
                    "album-data-4",
                    "releaseYear-data-4"
                )
            );
        };
    }
}