package com.example.petshop;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Ein");
        Cat cat = new Cat("Garfield");
        Scorpion scorpion = new Scorpion("Leonardo da Pinchy");

        ArrayList<Pet> petList = new ArrayList<Pet>();
        petList.add(dog);
        petList.add(cat);
        petList.add(scorpion);

        ArrayList<Pettable> pettablePets = new ArrayList<Pettable>();
        pettablePets.add(cat);
        pettablePets.add(dog);
//        pettablePets.add(scorpion);

        Happy smiley = new Happy();
        Sad frowny = new Sad();

        System.out.println(smiley.howAreYou());
        System.out.println(frowny.howAreYou());
    }
}