package com.example.etu28642.labo2v2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button clickChild;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clickChild = (Button) findViewById(R.id.button);

        clickChild.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {
                Intent intent = new Intent(MainActivity.this,ChildActivity.class);
                intent.putExtra("infoId","Coucou");
                startActivityForResult(intent,1);
            }
        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent intent)
    {
        super.onActivityResult(requestCode,resultCode,intent);
       // if(requestCode==1)
        //{
          //  switch(resultCode)
            //{
                /*case 0 :*/
        Log.i("id","erreur");
        Toast.makeText(MainActivity.this, Integer.toString(resultCode), Toast.LENGTH_SHORT).show();
                         //break;
                //case 1 : Toast.makeText(MainActivity.this, "code : 1", Toast.LENGTH_SHORT).show();
                  //       break;
            //}
        //}
    }
}
