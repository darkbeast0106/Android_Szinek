package com.darkbeast0106.szinek;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout layout;
    private TextView textSzin;
    private Random rnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int red = rnd.nextInt(256);
                int green = rnd.nextInt(256);
                int blue = rnd.nextInt(256);
                layout.setBackgroundColor(Color.rgb(red, green, blue));
                String szinSzoveges = String.format("(%d, %d, %d)", red, green, blue);
                textSzin.setText(szinSzoveges);
                if ((red + green + blue) > 450){
                    textSzin.setTextColor(Color.BLACK);
                } else {
                    textSzin.setTextColor(Color.WHITE);
                }
            }
        });
    }

    private void init() {
        layout = findViewById(R.id.layout);
        textSzin = findViewById(R.id.textSzin);
        rnd = new Random();
    }
}