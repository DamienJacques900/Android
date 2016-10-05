package com.damien.labo2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonChild =(Button) findViewById(R.id.button);

        buttonChild.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {
                Intent intent = new Intent(MainActivity.this,ChildActivity.class);
                intent.putExtra("infoId","Bien joué ;)");
                startActivity(intent);
                startActivityForResult(intent,1);
            }
        });
    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent intent)
    {
        super.onActivityResult(requestCode,resultCode,intent);
        Toast.makeText(MainActivity.this,"Bien",Toast.LENGTH_LONG).show();

    }

}
