package com.tzabochen.frag;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // CONTAINER_1

        FragmentManager fragmentManager1 = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction1 = fragmentManager1.beginTransaction();
        Fragment1 fragment1 = new Fragment1();
        fragmentTransaction1.add(R.id.main_container_1, fragment1);
        fragmentTransaction1.commit();

        // CONTAINER_2
        FragmentManager fragmentManager2 = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction2 = fragmentManager2.beginTransaction();
        Fragment2 fragment2 = new Fragment2();
        fragmentTransaction2.add(R.id.main_container_2, fragment2);
        fragmentTransaction2.commit();

        // START ACTIVITY TEST
        Button buttonStartActivityTest = (Button)findViewById(R.id.main_button);
        buttonStartActivityTest.setOnClickListener(this);

    }

    @Override
    public void onClick(View v)
    {
        Intent intentActivityTest = new Intent(this, ActivityTest.class);
        startActivity(intentActivityTest);
    }
}
