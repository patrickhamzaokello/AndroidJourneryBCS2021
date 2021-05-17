package com.pkasemer.broadcastsender;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String messagesending = "Hello, Goodmorning";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public  void sendMessage(View view){
        TextView sendtext = findViewById(R.id.textsentshow);
        Intent intent = new Intent();
        intent.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
        intent.setAction("android.intent.action.MY_ACTION");
        intent.putExtra("MyMessage", messagesending);
//        sendBroadcast(intent);
        getApplicationContext().sendBroadcast(intent);
        sendtext.setText(messagesending);

    }
}