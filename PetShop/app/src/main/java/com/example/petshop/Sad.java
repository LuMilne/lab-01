package com.example.petshop;

import java.util.Date;

public class Sad extends Mood {
    public Sad(Date date) {
        super(date);
    }

    public Sad() {
    }

    @Override
    public String howAreYou() {
        return "I'm just realy tired...";
    }
}
