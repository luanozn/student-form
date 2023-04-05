package com.ifgoiano.studentform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.ifgoiano.studentform.adapter.UniversityAdapter;
import com.ifgoiano.studentform.entities.University;
import com.ifgoiano.studentform.repository.UniversityRepository;
import com.ifgoiano.studentform.service.UniversityService;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner universitySpinner = findViewById(R.id.universityName);
        Spinner courseSpinner = findViewById(R.id.courseSpinner);

        courseSpinner.setEnabled(false);
        courseSpinner.setClickable(false);

        UniversityService service = new UniversityService(new UniversityRepository());

        UniversityAdapter adapter = new UniversityAdapter(service.getUniversities(), this);

        universitySpinner.setAdapter(adapter);

    }
}