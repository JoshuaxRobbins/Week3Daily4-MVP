package com.example.josh.week3daily4_mvp.model;

import android.content.Context;
import android.graphics.Bitmap;

public interface IPersonGenerator {

    IPerson generate(Context context);
    Bitmap getRandomPicture(Context context);
    String getRandomName();
    String getRandomAge();
    String getRandomGender();
}
