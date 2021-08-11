package com.example.schatzsuche;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.schatzsuche.databinding.ActivityPersonProfileBinding;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

import java.util.Vector;

public class PersonProfile extends AppCompatActivity {

    ActivityPersonProfileBinding binding;
    Gson gson;
    Person person;
    DataAdapter dataAdapter;
    Vector<String> listOfCourses = new Vector<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_person_profile);

        getDataFromIntent();
        setUpUi();
    }

    private void setUpUi() {
        if (person != null) {
            binding.namePerson.setText(person.getName());
            binding.mailPerson.setText(person.getMail());
            binding.faxPerson.setText(person.getFax());
            binding.officeHours.setText(person.getOfficehours());
            loadPersonImage();
            dataAdapter = new DataAdapter(listOfCourses, this);
            binding.listOfCourses.setAdapter(dataAdapter);
            binding.listOfCourses.setLayoutManager(new LinearLayoutManager(this));
        }
    }

    private void loadPersonImage() {
        Log.e("image", person.getImage());
        Picasso.get().load(Uri.parse(person.getImage())).placeholder(R.drawable.avatar).into(binding.personImage);
    }

    private void getDataFromIntent() {
        gson = new Gson();
        Intent intent = getIntent();
        if (intent != null) {
            person = gson.fromJson(intent.getStringExtra("person"), Person.class);
            if (person.getLehrveranstaltungen() != null)
                listOfCourses.addAll(person.getLehrveranstaltungen());
        }
    }


}