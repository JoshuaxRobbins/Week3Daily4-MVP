package com.example.josh.week3daily4_mvp.view.main;

import android.app.NotificationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.josh.week3daily4_mvp.R;

public class MainActivity extends AppCompatActivity implements MainView{

    MainPresenter mainPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mainPresenter = new MainPresenter();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void createNotificationChannel() {
        NotificationManager notificationManager = getSystemService(NotificationManager.class);
        mainPresenter.createNotificationChannel(notificationManager);
    }

    @Override
    public void openRecyclerView(View view) {

    }

    @Override
    public void bindRecyclerView(Object person) {

    }
}
