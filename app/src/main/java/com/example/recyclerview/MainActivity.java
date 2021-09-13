package com.example.recyclerview;

import android.os.Bundle;

import com.example.recyclerview.adapter.CardviewAdapter;
import com.example.recyclerview.adapter.CardviewData;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

RecyclerView recycler;
RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycler=(RecyclerView) findViewById(R.id.recyclerviewers);
        card();



    }

    public void card() {
        recycler.setHasFixedSize(true);
        recycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));
        ArrayList<CardviewData> card=new ArrayList<CardviewData>();
        card.add(new CardviewData("Mohamad Anwar",R.drawable.ic_launcher_background));
        card.add(new CardviewData("Mohamad Aiman",R.drawable.ic_launcher_background));
        adapter=new CardviewAdapter(card);
        recycler.setAdapter(adapter);
    }



}