package com.example.josh.week3daily4_mvp.model;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.example.josh.week3daily4_mvp.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PersonGenerator implements IPersonGenerator{


    @Override
    public Person generate(Context context) {
        List<Person> personList = new ArrayList<>();

        Person person = new Person(getRandomName(),getRandomAge(),getRandomGender(),getRandomPicture(context));


        return person;
    }

    @Override
    public Bitmap getRandomPicture(Context context) {
        List<Bitmap> pictures = new ArrayList<>();
        pictures.add(BitmapFactory.decodeResource(context.getResources(),R.drawable.emoji1));
        pictures.add(BitmapFactory.decodeResource(context.getResources(),R.drawable.emoji2));
        pictures.add(BitmapFactory.decodeResource(context.getResources(),R.drawable.emoji3));

        return pictures.get(new Random().nextInt(pictures.size()));
    }

    @Override
    public String getRandomName() {
        List<String> names = new ArrayList<>();
        names.add("Josh");
//        names.add("Assem"); RIP
        names.add("Nathan");
        names.add("Keenen");
        names.add("Tim");
        names.add("Michael");
        names.add("Bernardo");

        return names.get(new Random().nextInt(names.size()));
    }

    @Override
    public String getRandomAge() {
        return String.valueOf((new Random().nextInt(40)));
    }

    @Override
    public String getRandomGender() {
        List<String> genders = new ArrayList<>();
        genders.add("Male");
        genders.add("Female");
        return genders.get(new Random().nextInt(2));
    }
}
