package com.example.musicAll.Repository;

import com.example.musicAll.Model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepository extends JpaRepository<Song, Long> {

    Song findByTitle(String title);

    Song findById(long songId);
}
