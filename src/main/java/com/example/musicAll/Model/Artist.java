package com.example.musicAll.Model;

import javax.persistence.*;

@Entity
@Table(name = "artists")
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "artistId")
    private long artistId;

    @Column(unique = true, nullable = false, length = 50)
    private String name;

    public Artist(){}

    public long getArtistId() {
        return artistId;
    }

    public void setArtist_id(long artistId) {
        this.artistId = artistId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
