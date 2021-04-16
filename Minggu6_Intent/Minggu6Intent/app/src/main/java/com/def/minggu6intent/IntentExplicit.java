package com.def.minggu6intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class IntentExplicit extends AppCompatActivity {

    EditText name;
    Button btnSend;
    private String KEY_NAME = "NAMA";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_explicit);

        name = (EditText) findViewById(R.id.editNama);
        btnSend = (Button) findViewById(R.id.btnSend);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String nama = name.getText().toString();
                    // Code if else sedikit berbeda dengan BKPM, karena yang di BKPM tidak berfungsi. 
                    if(nama.isEmpty()) {
                        Toast.makeText(IntentExplicit.this, "YOU NEED TO FILL YOUR NAME", Toast.LENGTH_SHORT).show();
                    } else {
                        Intent i = new Intent(IntentExplicit.this, ActivitySecond.class);
                        i.putExtra(KEY_NAME, nama);
                        startActivity(i);
                    }
                } catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(getApplication(), "ERROR, TRY AGAIN!",Toast.LENGTH_SHORT);
                }
            }
        });
    }
}

                    // Ini code percabangan pada BKPM
//                    if (nama != ""){
//                        Intent i = new Intent(IntentExplicit.this, ActivitySecond.class);
//                        i.putExtra(KEY_NAME, nama);
//                        startActivity(i);
//                    } else {
//                        Toast.makeText(getApplication(), "YOU NEED TO FILL YOUR NAME",Toast.LENGTH_SHORT);
//                    }
