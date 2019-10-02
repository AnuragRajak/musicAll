package com.example.musicAll.Service;

import com.example.musicAll.Model.Song;

import java.sql.Time;

public interface SongService {
    public Song addSong(Song newSong);

    public Iterable<Song> listAllSongs();
}
