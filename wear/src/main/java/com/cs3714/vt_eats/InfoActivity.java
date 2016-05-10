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
import java.util.Locale;

public class InfoActivity extends WearableActivity implements View.OnClickListener {

    private static final SimpleDateFormat AMBIENT_DATE_FORMAT =
            new SimpleDateFormat("HH:mm", Locale.US);

    private BoxInsetLayout mContainerView;

    Button back;
    TextView tv;
    DiningHall halls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dining);
        setAmbientEnabled();

        Intent intent = getIntent();

        back = (Button) findViewById(R.id.button8);
        tv = (TextView) findViewById(R.id.textView);

        tv.setText(intent.getStringExtra("text"));

        back.setOnClickListener(this);
    }

    public void onClick(View view) {

        if(view.getId() == back.getId()) {

            System.out.print("YAS\n");
            finish();
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
