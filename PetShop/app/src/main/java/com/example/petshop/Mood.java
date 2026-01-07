package com.example.petshop;

import java.util.Date;

public abstract class Mood {
    Date date;

    public Mood(Date date) {
        this.date = date;
    }

    public Mood() {
        this.date = new Date();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String howAreYou() {
        return "";
    }
}

