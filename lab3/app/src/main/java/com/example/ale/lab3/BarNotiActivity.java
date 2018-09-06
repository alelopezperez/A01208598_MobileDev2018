package com.example.ale.lab3;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;

public class BarNotiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_noti);

        NotificationCompat.Builder NotifBuilder = new
                NotificationCompat.Builder(this);

        NotifBuilder.setSmallIcon(R.mipmap.ic_launcher);
        NotifBuilder.setContentTitle("This is my shiny notification!");
        NotifBuilder.setContentText("This is the detail of the notification");

        NotificationManager MyNotification = (NotificationManager)
                getSystemService(Context.NOTIFICATION_SERVICE);
        MyNotification.notify(2, NotifBuilder.build());

    }

}
