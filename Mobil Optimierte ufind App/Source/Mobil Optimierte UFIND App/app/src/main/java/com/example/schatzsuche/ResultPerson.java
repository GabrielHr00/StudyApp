package com.example.schatzsuche;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultPerson extends AppCompatActivity {
    Button zuruck;
    TextView name;
    TextView mail;
    TextView telefon;
    TextView bCard;
    TextView publication;
    TextView officeHour;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.persons_result);
        zuruck = findViewById(R.id.zuruck);
        name = findViewById(R.id.nameOfPerson);
        mail = findViewById(R.id.mailOfPerson);
        telefon = findViewById(R.id.phoneOfPerson);
        bCard = findViewById(R.id.bCard);
        publication = findViewById(R.id.publications);
        officeHour = findViewById(R.id.officeHours);

        zuruck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent zurück = new Intent(ResultPerson.this, MainActivity.class);
            }
        });
    }
}
