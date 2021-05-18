package com.pkasemer.mycourseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void viewCourses(View view){
        String mycourselist = "1. Mobile Programming \n2. Artitificial Intelligence \n3. Network Security and Information \n4. Data communication and Security \n5.Automata and Complexity \n6.Entrepreneurship";
        TextView coursetext = findViewById(R.id.setcourses);
        coursetext.setText(mycourselist);
    }
}