package com.campusdual.redsocial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Post {
    private Date date = new Date();
    private ArrayList<String> commentsList = new ArrayList<>();
    private String content, image, title, quality;
    private double X, Y, seconds;

    public Post(String content){
        this.content = content;

    }

    public Post(String title, double X, double Y){
        this.title = title;
        this.X = X;
        this.Y = Y;
    }

    public Post(String title, String quality, double seconds){
        this.title = title;
        this.quality = quality;
        this.seconds = seconds;
    }

    public void addPost(String content){
        Post post = new Post(content);
    }

}
