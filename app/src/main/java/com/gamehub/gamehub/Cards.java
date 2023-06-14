package com.gamehub.gamehub;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class Cards extends AppCompatActivity {

    RelativeLayout crd1, crd2, crd3, crd4;
    String crd1loader, crd2loader, crd3loader, crd4loader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cards);

        //item declaration
        crd1 = (RelativeLayout) findViewById(R.id.crd_item1);
        crd2 = (RelativeLayout) findViewById(R.id.crd_item2);
        crd3 = (RelativeLayout) findViewById(R.id.crd_item3);
        crd4 = (RelativeLayout) findViewById(R.id.crd_item4);


        //loading urls
        crd1loader = "https://games.cdn.famobi.com/html5games/d/duo-cards/v230/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=a049631f-a44c-4486-8042-0a1170b154d5&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=532&original_ref=https%3A%2F%2Fgames.famobi.com%2F";
        crd2loader = "https://games.cdn.famobi.com/html5games/g/gin-rummy-plus/v270/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=4f0b6ea7-7801-41a2-9117-53aae9295173&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=533&original_ref=https%3A%2F%2Fgames.famobi.com%2F";
        crd3loader = "https://games.cdn.famobi.com/html5games/c/crossover-21/v080/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=569b9d43-61ca-454c-af87-f6cc6f935c44&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=552&original_ref=https%3A%2F%2Fgames.famobi.com%2F";
        crd4loader = "https://games.cdn.famobi.com/html5games/s/solitaire-classic-easter/v260/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=e8017ad4-a36f-4a13-83d7-11071c69cb6c&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=534&original_ref=https%3A%2F%2Fgames.famobi.com%2F";


        //onclick - passing url to Gameloader activity
        crd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Cards.this, GameLoader.class);
                intent.putExtra("WEB_PASSING", crd1loader);
                startActivity(intent);
            }
        });
        crd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Cards.this, GameLoader.class);
                intent.putExtra("WEB_PASSING", crd2loader);
                startActivity(intent);
            }
        });
        crd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Cards.this, GameLoader.class);
                intent.putExtra("WEB_PASSING", crd3loader);
                startActivity(intent);
            }
        });
        crd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Cards.this, GameLoader.class);
                intent.putExtra("WEB_PASSING", crd4loader);
                startActivity(intent);
            }
        });

    }
}