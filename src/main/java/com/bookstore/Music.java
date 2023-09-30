package com.bookstore;

import java.text.DecimalFormat;

public class Music extends MediaItem {
    private String album;
    private String artist;
    private String genre;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Music(String album, String artist, String genre, double price) {
        this.album = album;
        this.artist = artist;
        this.genre = genre;
        this.price = price;
    }

    public Music() {
    }

    @Override
    public String toString() {
        DecimalFormat money = new DecimalFormat("$0.00");
        return album + ' ' +
                "by " + artist + ' ' +
                "(" + genre + ") " +
                "| " + money.format(price);
    }
}
