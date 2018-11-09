package com.example.josh.week3daily4_mvp.model;

import android.graphics.Bitmap;

public class Person implements IPerson {

    String name;
    String age;
    String gender;
    Bitmap picture;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public Person(String name, String age, String gender, Bitmap picture) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.picture = picture;
    }


    @Override
    public Bitmap getPicture() {

        return picture;
    }

    public void setPicture(Bitmap picture) {
        this.picture = picture;
    }

    @Override
    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
