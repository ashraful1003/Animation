package com.examples.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button down, up, fadein, fadeout, zoomin, zoomout, clockwise, antiClockwise;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        down = findViewById(R.id.down_anim);
        up = findViewById(R.id.up_anim);
        fadein = findViewById(R.id.fadein_anim);
        fadeout = findViewById(R.id.fadeout_anim);
        zoomin = findViewById(R.id.zoomin_anim);
        zoomout = findViewById(R.id.zoomout_anim);
        clockwise = findViewById(R.id.clockwise_anim);
        antiClockwise = findViewById(R.id.anti_clockwise_anim);

        /// for down animation
        down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation downAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_down);
                imageView.startAnimation(downAnim);
            }
        });

        /// for up animation
        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation upAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_up);
                imageView.startAnimation(upAnim);
            }
        });

        /// for fide in animation
        fadein.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation fadeinAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_fadein);
                imageView.startAnimation(fadeinAnim);
            }
        });

        /// for fide out animation
        fadeout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation fadeoutAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_fadeout);
                imageView.startAnimation(fadeoutAnim);
            }
        });

        /// for zoom in animation
        zoomin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation zoominAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_zoomin);
                imageView.startAnimation(zoominAnim);
            }
        });

        /// for zoom out animation
        zoomout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation zoomoutAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_zoomout);
                imageView.startAnimation(zoomoutAnim);
            }
        });

        /// for clockwise animation
        clockwise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation clockwiseAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_clockwise);
                imageView.startAnimation(clockwiseAnim);
            }
        });

        /// for anti clockwise animation
        antiClockwise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation antiClockwiseAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_anti_clockwise);
                imageView.startAnimation(antiClockwiseAnim);
            }
        });
    }
}