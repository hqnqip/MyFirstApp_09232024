package com.example.myfirstapp09232024;

import android.content.Intent;
import android.os.Bundle;

import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.myfirstapp09232024.R;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button oneBtn = findViewById(R.id.oneBtn);
        oneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myInt = new Intent(getApplicationContext(), ScreenTwo.class);
                Log.e("Navigate", "User has entered the next page.");
                Toast.makeText(MainActivity.this, "You are entering the next page...", Toast.LENGTH_LONG).show();
                startActivity(myInt);
            }
        });
        /*
          This is odd. Changing images with a button works here.
          But not the second screen?

          ImageView titleImg = findViewById((R.id.titleImg));
          Button titleBtn = findViewById(R.id.titleBtn);

          titleBtn.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  titleImg.setImageResource(R.drawable.dog);
              }
          });
        */
    }

    /*
      Supposed to be an OnEvent kind of thing.
      Did NOT work.

      public void naviHandler(View v)
      {
          Toast.makeText(this, "You are entering the next page...", Toast.LENGTH_LONG).show();
          Log.e("Move", "The user has moved to the next page.");
          setContentView(R.layout.activity_screen_two);
      }
    */

}

//Frog Image: https://live.staticflickr.com/89/232636845_5ca3c4fe51_b.jpg