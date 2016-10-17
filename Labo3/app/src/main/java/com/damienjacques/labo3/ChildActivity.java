package com.damienjacques.labo3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;


public class ChildActivity extends AppCompatActivity
{
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);
    }
    /*
    @Override
    public void onStart()
    {
        Log.i("lifeCycle","onStart est exécuter");
    }

    @Override
    public void onResume()
    {
        Log.i("lifeCycle","onResume est exécuter");
    }

    @Override
    public void onPause()
    {
        Log.i("lifeCycle","onPause est exécuter");
    }

    @Override
    public void onStop()
    {
        Log.i("lifeCycle","onStop est exécuter");
    }

    @Override
    public void onRestart()
    {
        Log.i("lifeCycle","onRestart est exécuter");
    }

    @Override
    public void onDestroy()
    {
        Log.i("lifeCycle","onDestroy est exécuter");
    }
    */
}
