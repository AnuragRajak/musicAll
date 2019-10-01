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
@Table(name="songs_artists")
public class Songs_Artists {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    //fk from artist id - many songs by an artist belong to one artist

    //fk from song id - one song by an artist belongs to one song


    public Songs_Artists(){}
}
