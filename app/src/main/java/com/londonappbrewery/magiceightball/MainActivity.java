package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button spinButton = (Button) findViewById(R.id.spin);

        final ImageView ballImage = (ImageView) findViewById(R.id.ball_image);

        final int img[] = {R.drawable.ball1,R.drawable.ball2,
                R.drawable.ball3,R.drawable.ball4,
                R.drawable.ball5};

        spinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand = new Random();
                int n1 = rand.nextInt(5);

                ballImage.setImageResource(img[n1]);
            }
        });

    }
}
