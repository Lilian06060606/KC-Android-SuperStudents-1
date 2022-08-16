package com.example.rps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText nameEdt = findViewById(R.id.editTextTextPersonName);
        Button next = findViewById(R.id.button3);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    if (nameEdt.getText().toString().equals("")) {
                        Toast.makeText(MainActivity.this, "املأ الفراغ", Toast.LENGTH_SHORT).show();}
                String name = nameEdt.getText().toString();
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("name",name);
                startActivity(intent);}
        });

    }
    }