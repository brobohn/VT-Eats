package com.cs3714.vt_eats;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.support.wearable.view.BoxInsetLayout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ThirdActivity extends WearableActivity implements View.OnClickListener {

    private static final SimpleDateFormat AMBIENT_DATE_FORMAT =
            new SimpleDateFormat("HH:mm", Locale.US);

    private BoxInsetLayout mContainerView;
    Button back;
    TextView tv;
    ImageView iv;

    AnimationDrawable animation;
    DiningHallManager manager;
    DiningHall loc;
    int distance;
    boolean randomClicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);
        setAmbientEnabled();

        Intent intent = getIntent();
        int index = intent.getIntExtra("index", 0);

        randomClicked = false;

        back = (Button) findViewById(R.id.button);
        tv = (TextView) findViewById(R.id.textView4);
        iv = (ImageView) findViewById(R.id.imageView2);

        back.setOnClickListener(this);

        manager = new DiningHallManager();

        double dist = manager.distances[index];
        loc = manager.key.get(dist);
        distance = (int) (dist * 3.28084);

        animation = new AnimationDrawable();
        animation.addFrame(getDrawable(R.drawable.hokiefeet1), 200);
        animation.addFrame(getDrawable(R.drawable.hokiefeet2), 200);
        animation.addFrame(getDrawable(R.drawable.hokiefeet3), 200);
        animation.addFrame(getDrawable(R.drawable.hokiefeet4), 200);
        animation.setOneShot(false);

        iv.setBackground(animation);
        tv.setText("Click to randomly select!");

        // start the animation!
        animation.start();
    }

    public void onClick(View view) {

        if(view.getId() == back.getId()) {

            if(randomClicked) {

                finish();

            } else {

                animation.stop();
                ColorDrawable color = new ColorDrawable(Color.WHITE);
                iv.setBackground(color);
                iv.setImageResource(loc.pic);
                tv.setText(loc.name+" "+distance+" ft.");

                back.setText("BACK");
                randomClicked = true;
            }
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

            //mContainerView.setBackgroundColor(getResources().getColor(android.R.color.black));

        } else {

            //mContainerView.setBackground(null);
        }
    }
}
