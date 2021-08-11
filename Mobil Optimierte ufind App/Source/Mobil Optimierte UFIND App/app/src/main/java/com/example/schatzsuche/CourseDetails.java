package com.example.schatzsuche;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.schatzsuche.databinding.ActivityCourseDetailsBinding;
import com.google.gson.Gson;

import java.util.Vector;

public class CourseDetails extends AppCompatActivity {

    ActivityCourseDetailsBinding binding;
    Gson gson;
    Veranstaltung course;
    DataAdapter lectureAdapter;
    DataAdapter terminesAdapter;
    Vector<String> lecture = new Vector<>();
    Vector<String> termines = new Vector<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_course_details);

        getDataFromIntent();
        setUpUi();
    }

    private void setUpUi() {
        binding.nameCourse.setText(course.getName());
        binding.assessmentText.setText(course.getAssessment());
        binding.motivationText.setText(course.getMotivation());
        binding.minimumText.setText(course.getMinimum());

        lectureAdapter = new DataAdapter(lecture, this);
        binding.listOfLecturers.setAdapter(lectureAdapter);
        binding.listOfLecturers.setLayoutManager(new LinearLayoutManager(this));

        terminesAdapter = new DataAdapter(termines, this);
        binding.listOfTermines.setAdapter(terminesAdapter);
        binding.listOfTermines.setLayoutManager(new LinearLayoutManager(this));

    }

    private void getDataFromIntent() {
        gson = new Gson();
        Intent intent = getIntent();
        if (intent != null) {
            course = gson.fromJson(intent.getStringExtra("course"), Veranstaltung.class);
            termines.addAll(course.getTermine());
            lecture.addAll(course.getProgramme());
        }


    }
}