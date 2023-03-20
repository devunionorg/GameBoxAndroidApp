package com.gamehub.gamehub;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class Racing extends AppCompatActivity {

    RelativeLayout r1, r2, r3, r4, r5, r6;
    String r1loader, r2loader, r3loader, r4loader, r5loader, r6loader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_racing);

        //item declaration
        r1 = (RelativeLayout) findViewById(R.id.r_item1);
        r2 = (RelativeLayout) findViewById(R.id.r_item2);
        r3 = (RelativeLayout) findViewById(R.id.r_item3);
        r4 = (RelativeLayout) findViewById(R.id.r_item4);
        r5 = (RelativeLayout) findViewById(R.id.r_item5);
        r6 = (RelativeLayout) findViewById(R.id.r_item6);


        //loading url
        r1loader = "https://games.cdn.famobi.com/html5games/m/moto-x3m/v100/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=442157bb-0a48-4e9b-9fa6-e1503f16e8e3&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=743&original_ref=https%3A%2F%2Fwww.google.com%2F";
        r2loader = "https://games.cdn.famobi.com/html5games/h/highway-rider-extreme/v060/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=83175bfa-1c89-46d9-91da-7ea5fc7a642f&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=747&original_ref=https%3A%2F%2Fgames.famobi.com%2F";
        r3loader = "https://games.cdn.famobi.com/html5games/d/dont-crash/v030/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=9320bd31-c1fa-4dda-9a89-6e3946399a84&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=552&original_ref=https%3A%2F%2Fgames.famobi.com%2F";
        r4loader = "https://games.cdn.famobi.com/html5games/r/racing-cars/v670/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=ba418425-068d-4b12-9a35-21d9db2572f4&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=747&original_ref=https%3A%2F%2Fgames.famobi.com%2F";
        r5loader = "https://games.cdn.famobi.com/html5games/t/truck-trials/v500/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=e56b8aaa-86e9-4d9f-9ea1-3822a3021716&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=746&original_ref=https%3A%2F%2Fgames.famobi.com%2F";
        r6loader = "https://games.cdn.famobi.com/html5games/r/race-right/v230/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=2c1acec8-38bc-4c30-86f2-843c0d1f6dca&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=747&original_ref=https%3A%2F%2Fgames.famobi.com%2F"; //


        //onclick - passing url to Gameloader activity
        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Racing.this, GameLoader.class);
                intent.putExtra("WEB_PASSING", r1loader);
                startActivity(intent);
            }
        });
        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Racing.this, GameLoader.class);
                intent.putExtra("WEB_PASSING", r2loader);
                startActivity(intent);
            }
        });
        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Racing.this, GameLoader.class);
                intent.putExtra("WEB_PASSING", r3loader);
                startActivity(intent);
            }
        });
        r4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Racing.this, GameLoader.class);
                intent.putExtra("WEB_PASSING", r4loader);
                startActivity(intent);
            }
        });
        r5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Racing.this, GameLoader.class);
                intent.putExtra("WEB_PASSING", r5loader);
                startActivity(intent);
            }
        });
        r6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Racing.this, GameLoader.class);
                intent.putExtra("WEB_PASSING", r6loader);
                startActivity(intent);
            }
        });

    }
}