package com.example.td_planete;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements MyRecyclerViewAdapter.ItemClickListener{

    MyRecyclerViewAdapter adapter;

    private String nm;
    private String sup;
    private String rot;
    private String grav;
    private String temp;

    private int pos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ArrayList<String> PlaneteNames = new ArrayList<>();
        PlaneteNames.add("Mercure");
        PlaneteNames.add("Venus");
        PlaneteNames.add("Terre");
        PlaneteNames.add("Mars");
        PlaneteNames.add("Jupiter");

        // set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.rvPlanete);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MyRecyclerViewAdapter(this, PlaneteNames);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "You clicked " + adapter.getItem(position) + " on row number " + position, Toast.LENGTH_SHORT).show();

        switch (position){
            case 0:
                Sailor_Mercury();
                break;

            case 1:
                Sailor_Venus();
                break;

            case 2:
                Sailor_Terra();
                break;

            case 3:
                Sailor_Mars();
                break;

            case 4:
                Sailor_Jupiter();
                break;
        }
    }


    public void Sailor_Mercury()
    {
        nm = getResources().getString(R.string.Mercure_Nom);
        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        intent.putExtra("message_nm", nm);

        sup = getResources().getString(R.string.Mercure_sup);
        intent.putExtra("message_sup", sup);

        rot = getResources().getString(R.string.Mercure_rot);
        intent.putExtra("message_rot", rot);

        grav = getResources().getString(R.string.Mercure_grav);
        intent.putExtra("message_grav", grav);

        temp = getResources().getString(R.string.Mercure_temp);
        intent.putExtra("message_temp", temp);

        startActivity(intent);
    }

    public void Sailor_Venus()
    {
        nm = getResources().getString(R.string.Venus_Nom);
        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        intent.putExtra("message_nm", nm);

        sup = getResources().getString(R.string.Venus_sup);
        intent.putExtra("message_sup", sup);

        rot = getResources().getString(R.string.Venus_rot);
        intent.putExtra("message_rot", rot);

        grav = getResources().getString(R.string.Venus_grav);
        intent.putExtra("message_grav", grav);

        temp = getResources().getString(R.string.Venus_temp);
        intent.putExtra("message_temp", temp);

        startActivity(intent);
    }

    public void Sailor_Terra()
    {
        nm = getResources().getString(R.string.Terre_Nom);
        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        intent.putExtra("message_nm", nm);

        sup = getResources().getString(R.string.Terre_sup);
        intent.putExtra("message_sup", sup);

        rot = getResources().getString(R.string.Terre_rot);
        intent.putExtra("message_rot", rot);

        grav = getResources().getString(R.string.Terre_grav);
        intent.putExtra("message_grav", grav);

        temp = getResources().getString(R.string.Terre_temp);
        intent.putExtra("message_temp", temp);

        startActivity(intent);
    }

    public void Sailor_Mars()
    {
        nm = getResources().getString(R.string.Mars_Nom);
        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        intent.putExtra("message_nm", nm);

        sup = getResources().getString(R.string.Mars_sup);
        intent.putExtra("message_sup", sup);

        rot = getResources().getString(R.string.Mars_rot);
        intent.putExtra("message_rot", rot);

        grav = getResources().getString(R.string.Mars_grav);
        intent.putExtra("message_grav", grav);

        temp = getResources().getString(R.string.Mars_temp);
        intent.putExtra("message_temp", temp);

        startActivity(intent);
    }

    public void Sailor_Jupiter()
    {
        nm = getResources().getString(R.string.Jupiter_Nom);
        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        intent.putExtra("message_nm", nm);

        sup = getResources().getString(R.string.Jupiter_sup);
        intent.putExtra("message_sup", sup);

        rot = getResources().getString(R.string.Jupiter_rot);
        intent.putExtra("message_rot", rot);

        grav = getResources().getString(R.string.Jupiter_grav);
        intent.putExtra("message_grav", grav);

        temp = getResources().getString(R.string.Jupiter_temp);
        intent.putExtra("message_temp", temp);

        startActivity(intent);
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}