package com.example.hp.helloandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
        ImageButton im1;
        Button b1;
        Button b2;
        Button b3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        im1 = (ImageButton) findViewById(R.id.homebutton);
        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(MainActivity.this,MainActivity.class);
                startActivity(it);
            }
        });
        b1 = (Button) findViewById(R.id.coursebutton);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it1=new Intent(MainActivity.this,courses.class);
                startActivity(it1);
            }
        });
        b2 = (Button) findViewById(R.id.scholarshipbutton);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it2=new Intent(MainActivity.this,scholarship.class);
                startActivity(it2);
            }
        });
        b3 = (Button) findViewById(R.id.gethiredbutton);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it3=new Intent(MainActivity.this,gethired.class);
                startActivity(it3);
            }
        });





    }



}
