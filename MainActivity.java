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
