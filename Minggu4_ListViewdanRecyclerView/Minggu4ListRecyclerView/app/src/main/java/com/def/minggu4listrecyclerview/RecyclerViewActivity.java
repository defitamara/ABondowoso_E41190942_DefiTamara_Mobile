package com.def.minggu4listrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        addData();

        recyclerView = findViewById(R.id.recycler_view);

        adapter = new MahasiswaAdapter(mahasiswaArrayList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Defi", "E41190942", "082123345567"));
        mahasiswaArrayList.add(new Mahasiswa("Shinta", "E41144444", "082123345567"));
        mahasiswaArrayList.add(new Mahasiswa("Putri", "E41155555", "082123345567"));
        mahasiswaArrayList.add(new Mahasiswa("Nidha", "E41166666", "082123345567"));
        mahasiswaArrayList.add(new Mahasiswa("Anisa", "E41177777", "082123345567"));
        mahasiswaArrayList.add(new Mahasiswa("Dewi", "E41188888", "082123345567"));
        mahasiswaArrayList.add(new Mahasiswa("Wike", "E41199999", "082123345567"));
    }
}