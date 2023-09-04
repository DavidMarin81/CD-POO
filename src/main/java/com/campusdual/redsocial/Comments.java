package com.campusdual.redsocial;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Comments {
    private String comment;
    Date date;
    User owner;

    public Comments(String comment, Date date, User owner){
        this.comment = comment;
        this.date = date;
        this.owner = owner;
    }

    public void addComment(String comment){

    }
}
