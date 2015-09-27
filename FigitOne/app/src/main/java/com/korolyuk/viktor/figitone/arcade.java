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
import android.widget.Toast;

import java.util.Random;


public class arcade extends ActionBarActivity {

    int red = 0;
    int green = 0;
    int blue = 0;
    boolean click11 = false;
    boolean click12 = false;
    boolean click13 = false;
    int i = 1;
    int bu1One = 0;
    int bu2One = 0;
    int bu3One = 0;
    boolean bu1Clicked = false;
    boolean bu2Clicked = false;
    boolean bu3Clicked = false;


    String[] code = {"1,2,3","3,2,1"};
    String code1temp = code[new Random().nextInt(code.length)];
    String[] code1Decode = code1temp.split(",");
    final String codes = code1Decode.toString();
    String code11 = code1Decode[0];
    String code12 = code1Decode[1];
    String code13 = code1Decode[2];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.arcade);

        String code1temp = code[new Random().nextInt(code.length)]; //choose code
        String[] code1Decode = code1temp.split(","); //split the code into seperate objects
        String codes = code1Decode.toString(); // turn into strings
        String code11 = code1Decode[0];
        String code12 = code1Decode[1];
        String code13 = code1Decode[2];
        final Button bu1 = (Button) findViewById(R.id.bu1);
        final Button bu2 = (Button) findViewById(R.id.bu2);
        final Button bu3 = (Button) findViewById(R.id.bu3);


/**
 * When a button is pressed then the boolean changes, the boolean changes so that you dont mess up while entering the codes...
 *
 * I NEED TO FIX THAT AS SOON AS POSSIBLE!
 */

        bu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!bu1Clicked) {
                    bu1Clicked = true;
                    if (bu1One == 0) {
                        bu1One = 1;
                        Toast.makeText(getApplicationContext(), "Bu1One == 1", Toast.LENGTH_SHORT).show();
                    }else if (bu1One > 0 && bu2One == 0) {
                        bu2One = 1;
                        Toast.makeText(getApplicationContext(), "Bu2One == 1", Toast.LENGTH_SHORT).show();
                    }else if (bu1One > 0 && bu2One > 0 && bu3One == 0) {
                        bu3One = 1;

                    }

                    if (bu1One > 0 && bu2One > 0 && bu3One > 0) {
                        //// TODO: 15-09-25 Make function that will deal with checking if the code entered is correct.
                        checkCode();
                    }

                } else {
//// TODO: 15-09-25 make it so that when the user clicks same button then the code resets with alert
                    //// TODO: 15-09-26 OPTIONAL OBVIOUSLY
                }


            }
        });
        bu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!bu2Clicked) {
                    bu2Clicked = true;
                    if (bu1One == 0) {
                        bu1One = 2;
                        Toast.makeText(getApplicationContext(), "Bu1One == 1", Toast.LENGTH_SHORT).show();
                    }else if (bu1One > 0 && bu2One == 0) {
                        bu2One = 2;
                        Toast.makeText(getApplicationContext(), "Bu2One == 1", Toast.LENGTH_SHORT).show();
                    }else if (bu1One > 0 && bu2One > 0 && bu3One == 0) {
                        bu3One = 2;

                    }

                    if (bu1One > 0 && bu2One > 0 && bu3One > 0) {
                        //// TODO: 15-09-25 Make function that will deal with checking if the code entered is correct.
                        checkCode();

                    }

                } else {
//// TODO: 15-09-25 make it so that when the user clicks same button then the code resets with alert
                }


            }



        });


        bu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!bu3Clicked) {
                    bu3Clicked = true;
                    if (bu1One == 0) {
                        bu1One = 3;
                        Toast.makeText(getApplicationContext(), "Bu1One == 3", Toast.LENGTH_SHORT).show();
                    }else if (bu1One > 0 && bu2One == 0) {
                        bu2One = 3;
                        Toast.makeText(getApplicationContext(), "Bu2One == 3", Toast.LENGTH_SHORT).show();
                    }else if (bu1One > 0 && bu2One > 0 && bu3One == 0) {
                        bu3One = 3;

                    }
                    if (bu1One > 0 && bu2One > 0 && bu3One > 0) {
                        //// TODO: 15-09-25 Make function that will deal with checking if the code entered is correct.
                        checkCode();
                    }
                } else {
//// TODO: 15-09-25 make it so that when the user clicks same button then the code resets with alert
                }



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

    public void checkCode() {

        int x = Integer.parseInt(code11);
        int y = Integer.parseInt(code12);
        int z = Integer.parseInt(code13);
        if (bu1One == x && bu2One == y && bu3One == z) {
            Toast.makeText(getApplicationContext(), "Congrats you got the code 1,2,3 correct!, the code will now be reset so that you can find another one!", Toast.LENGTH_SHORT).show();
            resetCode();
        }
/**
        if (code1temp == "1,2,3") {
            int supo1 = 1;
            int supo2 = 2;
            int supo3 = 3;

            if (bu1One == supo1 && bu2One == supo2 && bu3One == supo3) {
                Toast.makeText(getApplicationContext(), "Congrats you got the code 1,2,3 correct!, the code will now be reset so that you can find another one!", Toast.LENGTH_SHORT).show();
resetCode();
            } else {}
        }

        if (code1temp == "3,2,1") {
            int supo1 = 3;
            int supo2 = 2;
            int supo3 = 1;

            if (bu1One == supo1 && bu2One == supo2 && bu3One == supo3) {
                Toast.makeText(getApplicationContext(), "Congrats you got the code 3,2,1 correct!", Toast.LENGTH_SHORT).show();

            } else {
            }
        }
*/

    }

    public void resetCode() {
        bu1One = 0;
        bu2One = 0;
        bu3One = 0;
        bu1Clicked = false;
        bu2Clicked = false;
        bu3Clicked = false;
    }

}

