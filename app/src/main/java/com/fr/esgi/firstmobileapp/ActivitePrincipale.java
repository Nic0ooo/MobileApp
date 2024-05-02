package com.fr.esgi.firstmobileapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivitePrincipale extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button btnDay = (Button) findViewById(R.id.btnDay);
        //btnDay.setText("Texte modifié par Java");
        Button btnNight = (Button) findViewById(R.id.btnNight);
        TextView textView = (TextView) findViewById(R.id.textView);
        ImageView image = (ImageView) findViewById(R.id.image);
        ConstraintLayout main = (ConstraintLayout) findViewById(R.id.main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btnDay.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                textView.setText("Il fait Jour !");
                //image.getDrawable();
                image.setImageResource(R.drawable.sun);
                main.setBackgroundColor(R.color.blue);
            }
        });

        btnNight.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                textView.setText("Il fait Nuit !");
                image.setImageResource(R.drawable.moon);
                main.setBackgroundColor(R.color.white);
            }
        });
    }

}