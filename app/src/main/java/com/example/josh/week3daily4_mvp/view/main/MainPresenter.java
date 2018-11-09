package com.example.josh.week3daily4_mvp.view.main;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.view.View;

public class MainPresenter {

    private View view;

    public MainPresenter() {

    }

    public void createNotificationChannel(NotificationManager notificationManager){

        String name = "Music";
        String description = "Description and stuff";
        int importance = NotificationManager.IMPORTANCE_HIGH;
        NotificationChannel channel = new NotificationChannel(com.example.josh.week3daily3_service.services.MusicService.CHANNEL_ID,name,importance);
        channel.setDescription(description);
        notificationManager.createNotificationChannel(channel);
    }

}
