package com.gamehub.gamehub;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Category extends AppCompatActivity {

    RelativeLayout home, category, contact;
    ImageView action, racing, mind, card, classic;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        //category declaration
        action = (ImageView) findViewById(R.id.action);
        classic = (ImageView) findViewById(R.id.classic);
        racing = (ImageView) findViewById(R.id.racing);
        mind = (ImageView) findViewById(R.id.mind);
        card = (ImageView) findViewById(R.id.cards);


        //category onclick
        action.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Category.this, Action.class);
                startActivity(intent);

            }
        });
        classic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Category.this, Classic.class);
                startActivity(intent);
            }
        });
        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Category.this, Cards.class);
                startActivity(intent);
            }
        });
        racing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Category.this, Racing.class);
                startActivity(intent);
            }
        });
        mind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Category.this, Mind.class);
                startActivity(intent);
            }
        });


        //bottom navigation setup

        home = (RelativeLayout) findViewById(R.id.home);
        category = (RelativeLayout) findViewById(R.id.category);
        contact = (RelativeLayout) findViewById(R.id.contact);


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent h = new Intent(Category.this, MainActivity.class);
                startActivity(h);
            }
        });
        category.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Category.this, "Category", Toast.LENGTH_SHORT).show();
            }
        });
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(Category.this, Contact.class);
                startActivity(c);
            }
        });


    }

    @Override
    public void onBackPressed() {
        finishAffinity();
    }
}