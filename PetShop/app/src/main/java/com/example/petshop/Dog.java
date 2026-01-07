package com.example.petshop;

import java.util.Date;

public class Dog extends Pet implements Pettable {
    public Dog(String name) {
        super(name);
    }

    public Dog(String name, Date birthDate) {
        super(name, birthDate);
    }

    @Override
    public String Speak() {
        return "woof";
    }


    @Override
    public void pet() {

    }
}
