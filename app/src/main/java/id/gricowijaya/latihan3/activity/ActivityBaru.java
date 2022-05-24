package id.gricowijaya.latihan3.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.LinkedList;

import id.gricowijaya.latihan3.R;
import id.gricowijaya.latihan3.adapter.NamaMahasiswaAdapter;

public class ActivityBaru extends AppCompatActivity {

    private final LinkedList<String> namaMahasiswaList = new LinkedList<>();
    private RecyclerView mRecyclerView;
    private NamaMahasiswaAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_baru);
        namaMahasiswaList.addLast("Gede Rico Wijaya");
        namaMahasiswaList.addLast("Abel Jollando");
        namaMahasiswaList.addLast("Utari Dyani");
        namaMahasiswaList.addLast("Tejakusuma");
        namaMahasiswaList.addLast("Hrida");
        namaMahasiswaList.addLast("Ayulia Setiawati");
        namaMahasiswaList.addLast("Desak");
        namaMahasiswaList.addLast("Dedens");
        namaMahasiswaList.addLast("Bouchra Ferhati");
        namaMahasiswaList.addLast("Herry Daniel");
        namaMahasiswaList.addLast("Rheya");
        namaMahasiswaList.addLast("Intan Ratna");

        mRecyclerView = findViewById(R.id.recyclerview);
        mAdapter = new NamaMahasiswaAdapter(this, namaMahasiswaList);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}