package com.def.minggu3layouting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLinier();
            }
        });

        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View r) {
                openRelative();
            }
        });

        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View r) {
                openConstraint();
            }
        });

        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View r) {
                openFrame();
            }
        });

        button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View r) {
                openTabel();
            }
        });

        button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View r) {
                openMaterial();
            }
        });

        button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View r) {
                openScrollV();
            }
        });

        button8 = findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View r) {
                openScrollH();
            }
        });
    }

//    Fungsi tiap tombol
    public void openLinier(){
        Intent intent = new Intent(this, LinierLayout.class);
        startActivity(intent);
    }
    public void openRelative(){
        Intent intent2 = new Intent(this, RelativeLayout.class);
        startActivity(intent2);
    }
    public void openConstraint(){
        Intent intent3 = new Intent(this, ConstraintLayout.class);
        startActivity(intent3);
    }
    public void openFrame(){
        Intent intent4 = new Intent(this, FrameLayout.class);
        startActivity(intent4);
    }
    public void openTabel(){
        Intent intent5 = new Intent(this, TabelLayout.class);
        startActivity(intent5);
    }
    public void openMaterial(){
        Intent intent6 = new Intent(this, MaterialDesign.class);
        startActivity(intent6);
    }
    public void openScrollV(){
        Intent intent7 = new Intent(this, ScrollView.class);
        startActivity(intent7);
    }
    public void openScrollH(){
        Intent intent8 = new Intent(this, ScrollViewHorizontal.class);
        startActivity(intent8);
    }
}