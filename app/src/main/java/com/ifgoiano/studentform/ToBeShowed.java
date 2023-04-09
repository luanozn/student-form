package com.ifgoiano.studentform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.gson.Gson;
import com.ifgoiano.studentform.entities.Student;

public class ToBeShowed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_be_showed);

        TextView view = findViewById(R.id.textView3);

        Bundle extras = getIntent().getExtras();
        String json = "It is null Bruh!!!!";

        if(extras != null) {
            json = extras.getString("studentInfo");
        }

        System.out.println(json);

        Student student = new Gson().fromJson(json, Student.class);

        view.setText("Name: " + student.getName() + "\n" +
                "CPF: " + student.getCpf() + "\n" +
                "RG: " + student.getRg() + "\n" +
                "University: " + student.getUniversity().getName() + "\n" +
                "Course: " + student.getCourse().getName() + "\n");


    }
}