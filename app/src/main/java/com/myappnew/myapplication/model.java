package com.myappnew.myapplication;

public class model {

    String image, song, title;
//
//    //constructor
    public model(){}
    public model(String song, String image, String title) {

        this.song = song;
        this.image = image;
        this.title = title;

    }
    //getter and setters press Alt+Insert
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }




}