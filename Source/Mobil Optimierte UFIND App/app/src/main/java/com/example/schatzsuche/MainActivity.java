package com.example.schatzsuche;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {
    Button searchButton;
    EditText coursePerson;
    Button bachelorStudies;
    Button masterStudies;
    RadioGroup personCourseType;


    PseudoDatabase pseudoDatabase;
    boolean isCourse;
    String nameError = "Person";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpUi();
    }

    private void setUpUi() {
        pseudoDatabase = new PseudoDatabase();
        searchButton = findViewById(R.id.searchButton);
        coursePerson = findViewById(R.id.coursePersonView);
        bachelorStudies = findViewById(R.id.bachelorButton);
        masterStudies = findViewById(R.id.masterButton);
        personCourseType = findViewById(R.id.person_course_type);

        setUpButtonsActions();

    }

    private void setUpButtonsActions() {
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!TextUtils.isEmpty(coursePerson.getText().toString()))
                    getDataFromDatabase(coursePerson.getText().toString().trim());
                else
                    Toast.makeText(MainActivity.this, nameError + " name is required!", Toast.LENGTH_SHORT).show();
            }
        });
        personCourseType.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.person_rb) {
                    nameError = "Person";
                    isCourse = false;
                } else {
                    isCourse = true;
                    nameError = "Course";
                }
            }
        });

        bachelorStudies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pseudoDatabase = new PseudoDatabase();
                pseudoDatabase.createBachelorStudium();
                Intent intent = new Intent(MainActivity.this, Studiums.class);
                startActivity(intent);
            }
        });

        masterStudies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pseudoDatabase = new PseudoDatabase();
                pseudoDatabase.createMasterStudium();
                Intent intent = new Intent(MainActivity.this, StudiumMaster.class);
                startActivity(intent);
            }
        });
    }

    private void getDataFromDatabase(String searchValue) {
        Gson gson = new Gson();
        try {
            if (isCourse) {
                Log.e("course", pseudoDatabase.getVeranstaltung(searchValue).get(0).getName());
                startActivity(new Intent(this, CourseDetails.class).putExtra("course", gson.toJson(pseudoDatabase.getVeranstaltung(searchValue).get(0))));
            } else {
                Log.e("person", pseudoDatabase.getPerson(searchValue).get(0).getName());
                startActivity(new Intent(this, PersonProfile.class).putExtra("person", gson.toJson(pseudoDatabase.getPerson(searchValue).get(0))));
            }
        } catch (Exception e) {
            Toast.makeText(this, "This name not found!", Toast.LENGTH_SHORT).show();
        }


    }
}