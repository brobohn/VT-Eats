package com.cs3714.vt_eats;

import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.support.wearable.view.BoxInsetLayout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class MainActivity extends WearableActivity implements View.OnClickListener {

    private BoxInsetLayout mContainerView;

    Button nearestDH;
    Button random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setAmbientEnabled();

        mContainerView = (BoxInsetLayout) findViewById(R.id.container);

        nearestDH = (Button) findViewById(R.id.button2);
        random = (Button) findViewById(R.id.button4);

        nearestDH.setOnClickListener(this);
        random.setOnClickListener(this);
    }

    public void onClick(View view) {

        if(view.getId() == nearestDH.getId()) {

            Intent intent = new Intent(this, SecondActivity.class);

            startActivity(intent);

        } else if(view.getId() == random.getId()) {

            Intent intent = new Intent(this, ThirdActivity.class);

            Random rand = new Random();
            int n = rand.nextInt(7);

            intent.putExtra("index", n);

            startActivity(intent);
        }
    }

    @Override
    public void onEnterAmbient(Bundle ambientDetails) {
        super.onEnterAmbient(ambientDetails);
        updateDisplay();
    }

    @Override
    public void onUpdateAmbient() {
        super.onUpdateAmbient();
        updateDisplay();
    }

    @Override
    public void onExitAmbient() {
        updateDisplay();
        super.onExitAmbient();
    }

    private void updateDisplay() {

        if (isAmbient()) {
            mContainerView.setBackgroundColor(getResources().getColor(android.R.color.black));

        } else {
            mContainerView.setBackground(null);

        }
    }
}
