package com.example.musicAll.Model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "artists")
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true, nullable = true, length = 50)
    private String name;

    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "artist", orphanRemoval = true)
    private List<Song> songs;

    public Artist(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
