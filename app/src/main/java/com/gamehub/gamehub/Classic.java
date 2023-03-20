package com.gamehub.gamehub;

/* Github : @abdelillahbel
IG : abdelillahbel */

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class Classic extends AppCompatActivity {

    RelativeLayout c1, c2, c3, c4, c5, c6;
    String c1loader, c2loader, c3loader, c4loader, c5loader, c6loader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classic);

        //item declaration
        c1 = (RelativeLayout) findViewById(R.id.c_item1);
        c2 = (RelativeLayout) findViewById(R.id.c_item2);
        c3 = (RelativeLayout) findViewById(R.id.c_item3);
        c4 = (RelativeLayout) findViewById(R.id.c_item4);
        c5 = (RelativeLayout) findViewById(R.id.c_item5);
        c6 = (RelativeLayout) findViewById(R.id.c_item6);


        //loading url
        c1loader = "https://www.google.com/logos/2010/pacman10-i.html";
        c2loader = "https://games.cdn.famobi.com/html5games/b/bubble-woods/v290/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=53159388-d515-45e5-b65a-56d21c595405&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=690&original_ref=https%3A%2F%2Fhtml5games.com%2F";
        c3loader = "https://games.cdn.famobi.com/html5games/c/cannon-balls-3d/v150/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=3ffa11c2-61da-4974-892b-473582253371&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=685&original_ref=https%3A%2F%2Fhtml5games.com%2F";
        c4loader = "https://games.cdn.famobi.com/html5games/c/color-shape/v080/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=f7ee9f85-5427-408c-9c29-1f997f129b81&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=692&original_ref=https%3A%2F%2Fgames.famobi.com%2F";
        c5loader = "https://games.cdn.famobi.com/html5games/k/knife-rain/v820/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=acf1dae7-f647-4107-b381-8817a18a6e4d&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=690&original_ref=https%3A%2F%2Fgames.famobi.com%2F";
        c6loader = "https://games.cdn.famobi.com/html5games/0/3d-chess/v180/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=8e9306bb-99cc-4762-9708-a34d8afa6ae1&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=692&original_ref=https%3A%2F%2Fgames.famobi.com%2F";


        //onclick - passing url to Gameloader activity
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Classic.this, GameLoader.class);
                intent.putExtra("WEB_PASSING", c1loader);
                startActivity(intent);
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Classic.this, GameLoader.class);
                intent.putExtra("WEB_PASSING", c2loader);
                startActivity(intent);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Classic.this, GameLoader.class);
                intent.putExtra("WEB_PASSING", c3loader);
                startActivity(intent);
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Classic.this, GameLoader.class);
                intent.putExtra("WEB_PASSING", c4loader);
                startActivity(intent);
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Classic.this, GameLoader.class);
                intent.putExtra("WEB_PASSING", c5loader);
                startActivity(intent);
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Classic.this, GameLoader.class);
                intent.putExtra("WEB_PASSING", c6loader);
                startActivity(intent);
            }
        });
    }
}