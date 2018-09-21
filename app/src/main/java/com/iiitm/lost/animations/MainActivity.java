package com.iiitm.lost.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void Fade (View view){

        ImageView lost = findViewById(R.id.lost);

        lost.animate().alpha(0f).setDuration(2000);

        ImageView abv = findViewById(R.id.abv);

        abv.animate().alpha(1f).setDuration(2000);

        abv.bringToFront();


    }

    public void Fade1 (View view) {

        ImageView lost1 = findViewById(R.id.lost1);

        ImageView abv = findViewById(R.id.abv);

        abv.animate().translationXBy(-1500f).setDuration(2000);

        lost1.animate().translationXBy(-1500f).setDuration(2500);

        lost1.bringToFront();

    }

    public void Fade2 (View view) {

        ImageView lost1 = findViewById(R.id.lost1);

        ImageView lost = findViewById(R.id.lost);

        lost1.animate().translationXBy(-1500f).setDuration(2000);

        lost.animate().alpha(1f).setDuration(2000);

        //lost.animate().translationXBy(-3000).setDuration(2000);

        //lost.animate().rotation(1800).setDuration(2000);

        lost.bringToFront();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView lost1 = findViewById(R.id.lost1);

        lost1.setTranslationX(1500f);

    }
}
