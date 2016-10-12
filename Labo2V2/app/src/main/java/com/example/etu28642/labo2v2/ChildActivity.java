package com.example.etu28642.labo2v2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by etu28642 on 12-10-16.
 */
public class ChildActivity extends AppCompatActivity
{

    private Button clickParent;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        Bundle bundle = this.getIntent().getExtras();
        String messageMain = bundle.getString("infoId");
        Toast.makeText(ChildActivity.this, messageMain, Toast.LENGTH_SHORT).show();

        clickParent = (Button) findViewById(R.id.button2);

        clickParent.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {
                Intent intent = new Intent(ChildActivity.this,MainActivity.class);
                intent.putExtra("infoChild","Coucou papa");
                startActivityForResult(intent,1);
            }
        });
    }

    public void onClick(View arg0)
    {
        setResult(1);
        finish();
    }
}
