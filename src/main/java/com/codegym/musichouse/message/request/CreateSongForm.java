package com.codegym.musichouse.message.request;

public class CreateSongForm {

    private String nameSong;
    private String singer;
    private String category;
    private String lyrics;
    private String avatarUrl;
    private String mp3Url;
    private int likeSong;
    private int listenSong;
    private String describes;


    public CreateSongForm() {
    }

    

//    public CreateSongForm(String describes,String nameSong, String singer, String category, String lyrics, String avatarUrl, String mp3Url, int likeSong, int listenSong) {
//        this.nameSong = nameSong;
//        this.singer = singer;
//        this.category = category;
//        this.lyrics = lyrics;
//        this.avatarUrl = avatarUrl;
//        this.mp3Url = mp3Url;
//        this.likeSong = likeSong;
//        this.listenSong = listenSong;
//        this.describes = describes;
//    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getMp3Url() {
        return mp3Url;
    }

    public void setMp3Url(String mp3Url) {
        this.mp3Url = mp3Url;
    }

    public int getLikeSong() {
        return likeSong;
    }

    public void setLikeSong(int likeSong) {
        this.likeSong = likeSong;
    }

    public int getListenSong() {
        return listenSong;
    }

    public void setListenSong(int listenSong) {
        this.listenSong = listenSong;
    }

    public String getDescribes() {
        return describes;
    }

    public void setDescribes(String describes) {
        this.describes = describes;
    }
}
