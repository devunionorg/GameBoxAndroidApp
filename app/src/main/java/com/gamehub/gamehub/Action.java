package com.gamehub.gamehub;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class Action extends AppCompatActivity {

    RelativeLayout a1, a2, a3, a4, a5, a6;
    String a1loader, a2loader, a3loader, a4loader, a5loader, a6loader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action);

        //item declaration
        a1 = (RelativeLayout) findViewById(R.id.a_item1);
        a2 = (RelativeLayout) findViewById(R.id.a_item2);
        a3 = (RelativeLayout) findViewById(R.id.a_item3);
        a4 = (RelativeLayout) findViewById(R.id.a_item4);
        a5 = (RelativeLayout) findViewById(R.id.a_item5);
        a6 = (RelativeLayout) findViewById(R.id.a_item6);


        //loading url
        a1loader = "https://www.topgames.com/play/Jail-Breaker";
        a2loader = "https://www.topgames.com/play/Shortcut-Run";
        a3loader = "https://www.topgames.com/play/Epic-Race-3d";
        a4loader = "https://www.topgames.com/play/Halloween-Magic-Tiles";
        a5loader = "https://www.topgames.com/play/Light-It-Up-Online";
        a6loader = "https://www.topgames.com/play/Block-City-Wars";

        //onclick - passing url to Gameloader activity
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Action.this, GameLoader.class);
                intent.putExtra("WEB_PASSING", a1loader);
                startActivity(intent);
            }
        });
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Action.this, GameLoader.class);
                intent.putExtra("WEB_PASSING", a2loader);
                startActivity(intent);
            }
        });
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Action.this, GameLoader.class);
                intent.putExtra("WEB_PASSING", a3loader);
                startActivity(intent);
            }
        });
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Action.this, GameLoader.class);
                intent.putExtra("WEB_PASSING", a4loader);
                startActivity(intent);
            }
        });
        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Action.this, GameLoader.class);
                intent.putExtra("WEB_PASSING", a5loader);
                startActivity(intent);
            }
        });
        a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Action.this, GameLoader.class);
                intent.putExtra("WEB_PASSING", a6loader);
                startActivity(intent);
            }
        });


    }
}