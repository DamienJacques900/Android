package com.damienjacques.labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button clickFils;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clickFils = (Button) findViewById(R.id.button);

        clickFils.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                startActivityForResult(new Intent(MainActivity.this,ChildActivity.class),1);
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        this.getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch(item.getItemId())
        {
            case R.id.mailID:
                Toast.makeText(MainActivity.this,"Vous avez appuyer sur mail", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.phoneID:
                Toast.makeText(MainActivity.this,"Vous avez appuyer sur téléphone", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    /*@Override
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
