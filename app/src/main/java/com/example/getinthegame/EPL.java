package com.example.getinthegame;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

public class EPL extends AppCompatActivity {
    private TextView textepl;
    private RequestQueue queueepl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standing);
        textepl = findViewById(R.id.insideEPL);
        queueepl = Volley.newRequestQueue(this);

        jsonParse();
    }

    private void jsonParse() {
        String url = "api.football-data.org/v2/competitions/PL/standings?standingType=TOTAL";
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            JSONArray jsonArray = response.getJSONArray("standings");
                            JSONObject table = jsonArray.getJSONObject(3);

                            JSONObject team = table.getJSONObject("team");
                            String string = team.getString("name");
                            textepl.append(string);

                       } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });
        queueepl.add(request);
    }

}


