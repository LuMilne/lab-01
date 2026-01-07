package com.example.petshop;

import java.util.Date;

public class Happy extends Mood {
    public Happy(Date date) {
        super(date);
    }

    public Happy() {
    }

    @Override
    public String howAreYou() {
        return "I'm great, thanks!";
    }
}
