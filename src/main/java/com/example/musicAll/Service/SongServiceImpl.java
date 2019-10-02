package com.example.musicAll.Service;

import com.example.musicAll.Model.Song;
import com.example.musicAll.Repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Time;

@Service
public class SongServiceImpl implements SongService {
    @Autowired
    SongRepository songRepository;

    @Autowired
    SongService songService;

    @Override
    public Song addSong(Song newSong) {
        return songRepository.save(newSong);
    }

    @Override
    public Iterable<Song> listAllSongs(){
        return songRepository.findAll();
    }
}
