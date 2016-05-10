package com.cs3714.vt_eats;

import android.content.Intent;
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
import java.util.HashMap;
import java.util.Locale;

public class SecondActivity extends WearableActivity implements View.OnClickListener {

    private static final SimpleDateFormat AMBIENT_DATE_FORMAT =
            new SimpleDateFormat("HH:mm", Locale.US);

    private BoxInsetLayout mContainerView;
    ImageView iv;
    Button back;
    Button options;
    Button next;
    TextView tv;
    DiningHallManager manager;

    int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        setAmbientEnabled();

        iv = (ImageView) findViewById(R.id.imageView);
        back = (Button) findViewById(R.id.button6);
        options = (Button) findViewById(R.id.button5);
        next = (Button) findViewById(R.id.button7);
        tv = (TextView) findViewById(R.id.textView3);

        back.setOnClickListener(this);
        options.setOnClickListener(this);
        next.setOnClickListener(this);
        //iv.setImageResource(R.drawable.d2);

        index = 0;

        manager = new DiningHallManager();

        double dist = manager.distances[index];
        DiningHall loc = manager.key.get(dist);
        int distance = (int) (dist * 3.28084);

        iv.setImageResource(loc.pic);
        tv.setText(loc.name+" "+distance+" ft.");
    }

    public void onClick(View view) {

        if(view.getId() == back.getId()) {

            if(index == 0) {

                finish();

            } else {

                index--;
                double dist = manager.distances[index];
                DiningHall loc = manager.key.get(dist);
                int distance = (int) (dist * 3.28084);

                iv.setImageResource(loc.pic);
                tv.setText(loc.name+" "+distance+" ft.");
            }

        } else if(view.getId() == options.getId()){

            Intent intent = new Intent(this, InfoActivity.class);
            String info;

            intent.putExtra("text", manager.getInfo(index));

            startActivity(intent);

        } else if(view.getId() == next.getId()){

            if(index == 6) {

                index = 0;

            } else {

                index++;
            }

            double dist = manager.distances[index];
            DiningHall loc = manager.key.get(dist);
            int distance = (int) (dist * 3.28084);

            iv.setImageResource(loc.pic);
            tv.setText(loc.name+" "+distance+" ft.");
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
