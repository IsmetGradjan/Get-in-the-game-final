package com.example.getinthegame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;
public class MainActivity extends AppCompatActivity {
    private Button scheduleButton;
    private Button standingsbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        standingsbutton = (Button) findViewById(R.id.StandingButton);
        standingsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStanding();
            }
        });
        scheduleButton = (Button) findViewById(R.id.ScheduleButton);
        scheduleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSchedule();
            }
        });

    }
    public void openStanding() {
        Intent intent = new Intent(this,Standing_WhichLeague.class);
        startActivity(intent);
    }

    public void openSchedule() {
        Intent i = new Intent(this, Schedule.class);
        startActivity(i);
    }
}
