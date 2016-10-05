package com.damien.labo2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class ChildActivity extends AppCompatActivity
{
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        Bundle bundle = this.getIntent().getExtras();
        String messageFromParent = bundle.getString("infoId");

        Button buttonParent =(Button) findViewById(R.id.button);

        buttonParent.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {
                Intent intent = new Intent(ChildActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void onClick(View arg0)
    {
        setResult(1);
        finish();
    }
}
