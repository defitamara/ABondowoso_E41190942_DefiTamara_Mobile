package com.def.minggu6intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnToImplicit, btnToExplicit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnToImplicit = (Button) findViewById(R.id.btnToImplicit);
        btnToExplicit = (Button) findViewById(R.id.btnToExplicit);

        btnToImplicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, IntentImplicit.class);
                startActivity(intent);
            }
        });

        btnToExplicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, IntentExplicit.class);
                startActivity(intent);
            }
        });
    }
}