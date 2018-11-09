package com.example.josh.week3daily4_mvp.view.main;

import android.view.View;

public interface MainView  {

     void createNotificationChannel();
     void openRecyclerView(View view);
     void bindRecyclerView(Object person);

}
