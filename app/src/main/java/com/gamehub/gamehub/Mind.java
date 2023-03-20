package com.gamehub.gamehub;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class Mind extends AppCompatActivity {

    RelativeLayout m1, m2, m3, m4, m5, m6;
    String m1loader, m2loader, m3loader, m4loader, m5loader, m6loader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mind);

        //item declaration
        m1 = (RelativeLayout) findViewById(R.id.m_item1);
        m2 = (RelativeLayout) findViewById(R.id.m_item2);
        m3 = (RelativeLayout) findViewById(R.id.m_item3);
        m4 = (RelativeLayout) findViewById(R.id.m_item4);
        m5 = (RelativeLayout) findViewById(R.id.m_item5);
        m6 = (RelativeLayout) findViewById(R.id.m_item6);


        //loading url
        m1loader = "https://games.cdn.famobi.com/html5games/b/brain-trainer/v430/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=d267b353-ff18-4745-89f6-c390716a4f25&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=541&original_ref=https%3A%2F%2Fgames.famobi.com%2F";
        m2loader = "https://games.cdn.famobi.com/html5games/f/find-in-mind/v070/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=8820fb9b-f0da-4277-b989-2f47810a1462&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=541&original_ref=https%3A%2F%2Fgames.famobi.com%2F";
        m3loader = "https://games.cdn.famobi.com/html5games/w/word-detector/v390/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=fa994966-a4d2-4aa5-98b1-5b9f138b1edd&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=542&original_ref=https%3A%2F%2Fgames.famobi.com%2F";
        m4loader = "https://games.cdn.famobi.com/html5games/w/word-search-classic/v320/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=b47a1c8a-8f40-4d93-825f-e96652354ded&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=541&original_ref=https%3A%2F%2Fgames.famobi.com%2F";
        m5loader = "https://games.cdn.famobi.com/html5games/j/jigsaw-puzzle-deluxe/v300/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=50bb00b6-7151-4279-90c9-5b202e6ba691&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=548&original_ref=https%3A%2F%2Fgames.famobi.com%2F";
        m6loader = "https://games.cdn.famobi.com/html5games/0/123-puzzle/v030/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=859e7036-2740-47b3-9e9d-2aeb90853a4c&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=542&original_ref=https%3A%2F%2Fgames.famobi.com%2F";


        //onclick - passing url to Gameloader activity
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Mind.this, GameLoader.class);
                intent.putExtra("WEB_PASSING", m1loader);
                startActivity(intent);
            }
        });
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Mind.this, GameLoader.class);
                intent.putExtra("WEB_PASSING", m2loader);
                startActivity(intent);
            }
        });
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Mind.this, GameLoader.class);
                intent.putExtra("WEB_PASSING", m3loader);
                startActivity(intent);
            }
        });
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Mind.this, GameLoader.class);
                intent.putExtra("WEB_PASSING", m4loader);
                startActivity(intent);
            }
        });
        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Mind.this, GameLoader.class);
                intent.putExtra("WEB_PASSING", m5loader);
                startActivity(intent);
            }
        });
        m6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Mind.this, GameLoader.class);
                intent.putExtra("WEB_PASSING", m6loader);
                startActivity(intent);
            }
        });

    }
}