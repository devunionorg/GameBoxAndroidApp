package com.gamehub.gamehub.firsttime;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.gamehub.gamehub.R;

public class Screen_two extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_two);

        ImageView next = (ImageView) findViewById(R.id.btnscreentwo);

        //screen two to screen three
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Screen_two.this, Screen_three.class);
                startActivity(i);
            }
        });


    }
}

