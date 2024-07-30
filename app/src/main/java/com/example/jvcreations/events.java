package com.example.jvcreations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class events extends AppCompatActivity {

    Button getTgt, wedding, reunion, birthday, pooja;
    TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
        getTgt=findViewById(R.id.getTgt);
        wedding=findViewById(R.id.wedding);
        reunion=findViewById(R.id.reunion);
        birthday=findViewById(R.id.birthday);
        pooja=findViewById(R.id.pooja);
        name=findViewById(R.id.name);
        Intent i = getIntent();
        String n = i.getStringExtra("name");
        name.setText("Welcome "+n);

        getTgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(events.this,getTgt.class);
                startActivity(i);
            }
        });

        wedding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(events.this,wedding.class);
                startActivity(i);
            }
        });

        reunion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(events.this,Reunion.class);
                startActivity(i);
            }
        });

        birthday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(events.this,birthday.class);
                startActivity(i);
            }
        });

        pooja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(events.this,pooja.class);
                startActivity(i);
            }
        });
    }
}