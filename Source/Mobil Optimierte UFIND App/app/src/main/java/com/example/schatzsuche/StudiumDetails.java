package com.example.schatzsuche;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class StudiumDetails extends AppCompatActivity {
    private PseudoDatabase pseudoDatabase;
    private Studium studium;
    private RecyclerView recyclerView;
    private StudiumDetailsRecylerAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.studium_course_result);

        Intent i = getIntent();


        pseudoDatabase = new PseudoDatabase();
        studium = pseudoDatabase.createBachelorStudium();

        String DepAmount = i.getStringExtra("name");
        TextView textview = findViewById(R.id.tv);
        textview.setText(DepAmount);

        setAdapter();
    }

    private void setAdapter(){
        //System.out.println("size of lv :" + bachelorStudium.getLVS().size());
        ArrayList<Veranstaltung>ver = new ArrayList<>(studium.getLVS());
        recyclerView = findViewById(R.id.rc);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        recyclerView.setHasFixedSize(true);
        adapter = new StudiumDetailsRecylerAdapter(ver);
        recyclerView.setAdapter(adapter);
    }
}



