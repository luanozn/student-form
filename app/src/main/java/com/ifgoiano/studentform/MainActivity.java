package com.ifgoiano.studentform;

import static com.ifgoiano.studentform.entities.enums.Shift.EVENING_NIGHT;
import static com.ifgoiano.studentform.entities.enums.Shift.MORNING;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.gson.Gson;
import com.ifgoiano.studentform.adapter.UniversityAdapter;
import com.ifgoiano.studentform.entities.Course;
import com.ifgoiano.studentform.entities.Student;
import com.ifgoiano.studentform.entities.University;
import com.ifgoiano.studentform.repository.UniversityRepository;
import com.ifgoiano.studentform.service.UniversityService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

    @Override
    protected void onStart() {
        super.onStart();

        UniversityService service = new UniversityService(new UniversityRepository());

        EditText nameField = findViewById(R.id.nameField);
        EditText cpfField = findViewById(R.id.cpfField);
        EditText rgField = findViewById(R.id.rgField);
        EditText phoneField = findViewById(R.id.phoneEditText);
        EditText addressField = findViewById(R.id.addressField);
        Spinner universitySpinner = findViewById(R.id.universityName);
        Button submitButton = findViewById(R.id.submitButton);


        submitButton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ToBeShowed.class);

            TextView universityText = universitySpinner.findViewById(R.id.itemId);

            University university = service.findAll().get(universityText.getText().toString());
            Student student = new Student(
                    nameField.getText().toString(),
                    cpfField.getText().toString(),
                    rgField.getText().toString(),
                    phoneField.getText().toString(),
                    addressField.getText().toString(),
                    university,
                    new Course(
                            "Bacharelado em Sistemas de Informação",
                            3600,
                            List.of(MORNING, EVENING_NIGHT)
                    ),
                    MORNING
            );

            intent.putExtra("studentInfo", new Gson().toJson(student));
            startActivity(intent);
        });

    }
}