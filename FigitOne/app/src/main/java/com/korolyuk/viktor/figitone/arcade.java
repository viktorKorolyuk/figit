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

import java.util.Random;


public class arcade extends ActionBarActivity {

    int red = 0;
    int green = 0;
    int blue = 0;
    boolean click11 = false;
    boolean click12 = false;
    boolean click13 = false;
    int i = 1;
    String[] code = {"1,2,3","3,2,1"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.arcade);

        String code1temp = code[new Random().nextInt(code.length)];
        String[] code1Decode = code1temp.split(",");
        final String codes = code1Decode.toString();
        String code11 = code1Decode[0];
        String code12 = code1Decode[1];
        String code13 = code1Decode[2];

        final Button bu1 = (Button) findViewById(R.id.bu1);
        final Button bu2 = (Button) findViewById(R.id.bu2);
        final Button bu3 = (Button) findViewById(R.id.bu3);


        bu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (codes.equals("1,2,3")) {

                    if (click11 = false) {
                        if (click12 = false) {
                            if (click13 = false) {
                                click11 = true;
                            }}}}
                    if (codes.equals("3,2,1")) {
                        if (click13 = true) {
                            if(click12 = true){
                                click11 = true;
                            }}}

            }
        });
        bu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (codes.equals("1,2,3")) {

                    if (click11 = true) {
                        if (click12 = false) {
                            if (click13 = false) {
                                click12 = true;
                            }}}
                }
                    if (codes.equals("3,2,1")) {
                        if (click13 = true) {
                            if(click12 = false){
                                click12 = true;
                            }}}

            }
        });

        bu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (codes.equals("1,2,3")) {

                    if (click11 = true) {
                        if (click12 = true) {
                            if (click13 = false) {
                                click13 = true;
                                //// TODO: 15-09-23 DO COMMAND HERE
                            }}}}
                if (codes.equals("3,2,1")) {
                    if (click11 = false) {
                        if(click12 = false){
                            if (click13 = false) {
                                click13 = true;
                                //// TODO: 15-09-23 DO COMMAND HERE
                            }}}}}


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



}

