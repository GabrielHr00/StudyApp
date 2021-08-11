package com.example.schatzsuche;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class StudiumMaster extends AppCompatActivity {
    Button informatik;
    Button wirtschaftsWissenschaft;
    Button rechtWissenschaft;
    Button geschichte;
    Button romanist;
    Button philosophi;
    TextView title;
    PseudoDatabase pb;
    List<String> lvs;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studium_master);

        title = findViewById(R.id.textView);

        Intent i = getIntent();
        informatik = findViewById(R.id.bt1);
        informatik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StudiumMaster.this, StudiumDetails.class);
                String name = "Master Informatik";
                intent.putExtra("name", name);
                startActivity(intent);

            }
        });
        wirtschaftsWissenschaft = findViewById(R.id.bt2);
        wirtschaftsWissenschaft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StudiumMaster.this, StudiumDetails.class);
                String name = "Master Wirtschaftswissenschaft";
                intent.putExtra("name", name);
                startActivity(intent);
            }
        });

        rechtWissenschaft = findViewById(R.id.bt3);
        rechtWissenschaft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StudiumMaster.this, StudiumDetails.class);
                String name = "Master Rechtwissenschaft";
                intent.putExtra("name", name);
                startActivity(intent);
            }
        });
        geschichte = findViewById(R.id.bt4);
        geschichte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StudiumMaster.this, StudiumDetails.class);
                String name = "Master Geschichte";
                intent.putExtra("name", name);
                startActivity(intent);
            }
        });

        romanist = findViewById(R.id.bt5);
        romanist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StudiumMaster.this, StudiumDetails.class);
                String name = "Master Romanistik";
                intent.putExtra("name", name);
                startActivity(intent);
            }
        });

        philosophi = findViewById(R.id.bt6);
        philosophi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StudiumMaster.this, StudiumDetails.class);
                String name = "Master Philosophie";
                intent.putExtra("name", name);
                startActivity(intent);
            }
        });
    }
}