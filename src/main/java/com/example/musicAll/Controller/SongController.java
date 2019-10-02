package com.example.musicAll.Controller;

import com.example.musicAll.Model.Song;
import com.example.musicAll.Service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SongController {
    @Autowired
    SongService songService;

    @GetMapping("/listAllSongs")
    public Iterable<Song> listAllSongs(){
        return songService.listAllSongs();
    }

    //sidenote: when adding artist to artist name, use underscore for spaces (ex: maroon 5 should be maroon_5) to avoid error
//    "could not execute statement; SQL [n/a]; constraint [uk_1qepqpuuwdr47nk7j6rdbvom6]; nested exception is org.hibernate.exception.ConstraintViolationException: could not execute statement",
//            "trace": "org.springframework.dao.DataIntegrityViolationException: could not execute statement; SQL [n/a]; constraint [uk_1qepqpuuwdr47nk7j6rdbvom6]; nested exception is org.hibernate.exception.ConstraintViolationException: could not execute statement\n\tat org.springframework.orm.jpa.vendor.HibernateJpaDialect.convertHibernateAccessException(HibernateJpaDialect.java:296)\n\tat
    @PostMapping("/addSongToDB")
    public Song addSong(@RequestBody Song newSong) {
        return songService.addSong(newSong);
    }

}
