package com.pkasemer.mycourselistkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    val course_outline = "1. Mobile Programming \n2. Automata & Complexity \n3. Data Communication and Security \n4. Network Security and Information\n5. Artificial Intelligence\n6. Entrepreneurship";

    fun viewCourses(view: View) {
        val setcourses: TextView = findViewById(R.id.setcourses) as TextView
        setcourses.text = course_outline
    }
}