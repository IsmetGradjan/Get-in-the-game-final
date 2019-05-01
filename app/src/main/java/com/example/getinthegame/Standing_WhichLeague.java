package com.example.getinthegame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;

public class Standing_WhichLeague extends AppCompatActivity {
    private Button budesliga;
    private Button LigUN;
    private Button SeriaA;
    private Button laLiga;
    private Button EPL;
    private TextView textepl;
    private RequestQueue queueepl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standing__which_league);

        budesliga = (Button) findViewById(R.id.budesliga);
        budesliga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b();
            }

        });
        LigUN = (Button) findViewById(R.id.France);
        LigUN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l();
            }
        });
        SeriaA = (Button) findViewById(R.id.SeriaA);
        SeriaA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s();
            }
        });
        laLiga = (Button) findViewById(R.id.LaLiga);
        laLiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spain();
            }
        });
        EPL = (Button) findViewById(R.id.EnglishPremierLeague);
        EPL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                epl();
            }
        });

    }

    public void b() {
        Intent intent = new Intent(this, Bundesliga.class);
        startActivity(intent);
    }

    public void l() {
        Intent france = new Intent(this, Ligue1france.class);
        startActivity(france);
    }

    public void s() {
        Intent italy = new Intent(this, SeriaA.class);
        startActivity(italy);
    }

    public void spain() {
        Intent spain = new Intent(this, Laliga.class);
        startActivity(spain);
    }

    public void epl() {
        Intent epl = new Intent(this, EPL.class);
        startActivity(epl);
    }
}


