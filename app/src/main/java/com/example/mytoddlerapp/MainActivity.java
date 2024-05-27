package com.example.mytoddlerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton imageButton;
    private ImageButton imageButton2;
    private ImageButton imageButton3;
    private ImageButton imageButton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButton = (ImageButton) findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openActivity2();
            }

        });

        imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openActivity3();
            }

        });

        imageButton3 = (ImageButton) findViewById(R.id.imageButton3);
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openActivity4();
            }

        });

        imageButton4 = (ImageButton) findViewById(R.id.imageButton4);
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openActivity5();
            }

        });



    }
    public void openActivity2(){
        Intent intent = new Intent(this,Food.class);
        startActivity(intent);
    }
    public void openActivity3(){
        Intent intent = new Intent(this,Animal.class);
        startActivity(intent);
    }
    public void openActivity4(){
        Intent intent = new Intent(this,Color.class);
        startActivity(intent);
    }

    public void openActivity5(){
        Intent intent = new Intent(this,Letter.class);
        startActivity(intent);
    }
}