package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;

import com.example.assignment3.Adapter.FoodAdapter;
import com.example.assignment3.model.GrideFood;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

   Button png1, png2, png3, png4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        png1 = findViewById(R.id.btn1);
        png2 = findViewById(R.id.btn2);
        png3 = findViewById(R.id.btn3);
        png4 = findViewById(R.id.btn4);

        png1.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity.this, PNG1Activity.class);
            startActivity(i);
        });

        png2.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity.this, PNG2Activity.class);
            startActivity(i);
        });

        png3.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity.this, PNG3Activity.class);
            startActivity(i);
        });

        png4.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity.this, PNG4Activity.class);
            startActivity(i);
        });

    }
}