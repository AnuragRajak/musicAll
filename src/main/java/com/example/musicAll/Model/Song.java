package com.example.musicAll.Model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

//@JsonIdentityInfo(
//        generator = ObjectIdGenerators.PropertyGenerator.class,
//        property = "id")

@Entity
@Table(name="songs")
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    @Column(unique = true, nullable = false, length = 50)
    private String title;

    @Column(unique = true, nullable = false, length = 50)
    private String genre;

    private Time length;

    @ManyToOne()
    @JoinColumn(name = "artist_id")
    private Artist artist;
//
//    @ManyToOne(cascade = {CascadeType.DETACH,
//            CascadeType.MERGE, CascadeType.REFRESH})
//    @JoinColumn(name = "playlist_id", nullable = false)
//    private Playlist playlist;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "song")
    private List<Playlist> playlists;


    public Song() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Time getLength() {
        return length;
    }

    public void setLength(Time length) {
        this.length = length;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

}
