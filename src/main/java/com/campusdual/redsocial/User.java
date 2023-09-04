package com.campusdual.redsocial;

import java.util.ArrayList;

public class User {
    private String userName;
    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<String> usersLists = new ArrayList<>();

    private ArrayList<String> postLists = new ArrayList<>();

    public User(String userName){
        this.userName = userName;
    }

    public void addUser(String userName){
        User user = new User(userName);
    }
}
