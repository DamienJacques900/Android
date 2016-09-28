package com.etu28642.labo1;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button bouton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        Log.i("onCreateTag","onCreate is executed");
        setContentView(R.layout.activity_main);

        bouton = (Button) findViewById(R.id.bouton1);
        bouton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0)
            {
                Toast.makeText(MainActivity.this, "Welcome",Toast.LENGTH_SHORT).show();
            }
        });

        ValeurToast affichage = (ValeurToast)this.getApplicationContext();
        String cent = Integer.toString(affichage.getValeur());

        Toast.makeText(this,cent,Toast.LENGTH_SHORT).show();
        
    }
}
