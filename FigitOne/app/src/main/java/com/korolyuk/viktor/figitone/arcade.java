package com.korolyuk.viktor.figitone;

import android.graphics.Color;


import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;



public class arcade extends ActionBarActivity {

    int red = 0;
    int green = 0;
    int blue = 0;
int i = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.arcade);

//tools:context=".MainActivity"

        // ImageView arcadeM = (ImageView) findViewById(R.id.imageView);



        final  Button aone =(Button) findViewById(R.id.Aone);
        final  Button atwo =(Button) findViewById(R.id.Atwo);
        final  Button athree =(Button) findViewById(R.id.Athree);
        final  Button afour =(Button) findViewById(R.id.Afour);
        final  Button afive =(Button) findViewById(R.id.Afive);
        final  Button asix =(Button) findViewById(R.id.Asix);
        final  Button aseven =(Button) findViewById(R.id.Aseven);
        final  Button aeight =(Button) findViewById(R.id.Aeight);

        aone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        atwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        athree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        aone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
bgColorChange();
            }
        });

        afour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        afive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        asix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        aseven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        aeight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

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

    public void bgColorChange() {

        final Handler myHandler = new Handler();
        (new Thread(new Runnable(){

            @Override
            public void run() {
                final RelativeLayout bg = (RelativeLayout) findViewById(R.id.guiLayout);
                //final String changeBG = bg.setBackgroundColor(Color.WHITE);
                myHandler.post(new Runnable() {
                    @Override
                public void run() {
                        while (true) {
                            red += 5;
                            blue += 5;
                            green += 5;
                            bg.setBackgroundColor(Color.rgb(red, green, blue));

                        }
                    }
                });

            }
        })).start();





    }
}
