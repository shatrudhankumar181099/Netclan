package com.example.netclan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class mainscreen extends AppCompatActivity {

    ImageView individuals, profeshnal, marchant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainscreen);

        individuals = findViewById(R.id.individuals);
        profeshnal = findViewById(R.id.profeshnal);
        marchant = findViewById(R.id.marchant);

        individuals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(mainscreen.this,mainscreen2.class);
                startActivity(i);
                finish();

            }
        });

        profeshnal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(mainscreen.this,mainscreen2.class);
                startActivity(i);
                finish();

            }
        });

        marchant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(mainscreen.this,mainscreen2.class);
                startActivity(i);
                finish();

            }
        });
    }
}