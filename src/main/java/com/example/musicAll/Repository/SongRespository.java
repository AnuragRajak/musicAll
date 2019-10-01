package com.example.musicAll.Repository;

import com.example.musicAll.Model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRespository extends JpaRepository<Song, Long> {
}
