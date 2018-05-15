package com.twu.biblioteca.Entity;

import java.util.ArrayList;

public class User {
    private static ArrayList<User> users = new ArrayList<User>();

    private String  username;
    private String password;

    public static User anthenticate(String username,String password){
        for (User user:users) {
            if(user.getUsername().equals(user.username)&&
                    user.getPassword().equals(user.password));
            return user;
        }
        return null;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static void setUsers(ArrayList<User> users) {
        User.users = users;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
