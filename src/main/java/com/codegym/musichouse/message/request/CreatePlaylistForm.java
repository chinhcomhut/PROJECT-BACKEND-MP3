package com.codegym.musichouse.message.request;

import com.codegym.musichouse.model.Song;
import com.codegym.musichouse.model.User;

import java.util.List;

public class CreatePlaylistForm {

    private String namePlaylist;

    private List<Song> songs;

    private User user;

    public CreatePlaylistForm() {
    }


//    public CreatePlaylistForm(String namePlaylist, List<Song> songs, User user) {
//        this.namePlaylist = namePlaylist;
//        this.songs = songs;
//        this.user = user;
//    }

    public String getNamePlaylist() {
        return namePlaylist;
    }

    public void setNamePlaylist(String namePlaylist) {
        this.namePlaylist = namePlaylist;
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
}
