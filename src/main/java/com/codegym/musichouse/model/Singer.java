package com.codegym.musichouse.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Singer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nameSinger;

    private String information;

    private String singerAvatar;

    @ManyToMany
    @JoinTable(name = "singers_songs",
            joinColumns = @JoinColumn(name = "singer_id"),
            inverseJoinColumns = @JoinColumn(name = "song_id"))
    private List<Song> songs;

    @OneToOne
    @JoinColumn
    private User user;

    private Date dateUpload;

    public Singer(){}

    public Singer(String singerAvatar,String nameSinger, String information, List<Song> songs, User user, Date dateUpload) {
        this.nameSinger = nameSinger;
        this.information = information;
        this.songs = songs;
        this.user = user;
        this.dateUpload = dateUpload;
        this.singerAvatar = singerAvatar;
    }

    public Long getId() {
        return id;
    }

    public String getSingerAvatar() {
        return singerAvatar;
    }

    public void setSingerAvatar(String singerAvatar) {
        this.singerAvatar = singerAvatar;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameSinger() {
        return nameSinger;
    }

    public void setNameSinger(String nameSinger) {
        this.nameSinger = nameSinger;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDateUpload() {
        return dateUpload;
    }

    public void setDateUpload(Date dateUpload) {
        this.dateUpload = dateUpload;
    }
}
