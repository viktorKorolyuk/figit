package com.korolyuk.viktor.figitone;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;


public class arcade extends AppCompatActivity {

    RelativeLayout rl;


    int red = 0;
    int green = 0;
    int blue = 0;


    // These variables record the order in which the buttons were pressed
    int bu1One = 0;
    int bu2One = 0;
    int bu3One = 0;

    final int CHOICES[] = {1, 2, 3};
    int chosen[] = new int[3];
    int currentIndex = 0;

    int code11;
    int code12;
    int code13;
    Vibrator vibrator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.arcade);

        rl = (RelativeLayout) findViewById(R.id.guiLayout);

        final Button bu1 = (Button) findViewById(R.id.bu1);
        final Button bu2 = (Button) findViewById(R.id.bu2);
        final Button bu3 = (Button) findViewById(R.id.bu3);
        vibrator = (Vibrator) getApplicationContext().getSystemService(VIBRATOR_SERVICE);


        /**
         * When a button is pressed then the boolean changes, the boolean changes so that you dont mess up while entering the codes...
         *
         * I NEED TO FIX THAT AS SOON AS POSSIBLE!
         *
         * It is fixed what do you mean?
         * What?
         * WHat?
         * How are you talking to me? This project has no contributors!
         * MAGIC!*!*!*!*!*!*!*! JK its just you.
         * Me?
         * YES, YOU!
         *
         *  --- A random convo by Viktor Korolyuk @October 1 2015 @@2:17 ---
         *
         *  -- (Friday 13, 2018) --
         *  Just found this conversation. Not sure what the original intent was.
         */

        bu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chosen[currentIndex++] = 1;

                if (currentIndex == 3) checkCode();


            }
        });

        bu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chosen[currentIndex++] = 2;

                if (currentIndex == 3) checkCode();
            }


        });


        bu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chosen[currentIndex++] = 3;
                if (currentIndex == 3) checkCode();
            }


        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        choosePass();
    }

    public void checkCode() {
        green += 10;
        int x = code11;
        int y = code12;
        int z = code13;

        if (chosen[0] == x && chosen[1] == y && chosen[2] == z) {
            // Sets the background colour to a green "win"
            rl.setBackgroundColor(Color.rgb(0, green, 0));
            resetCode();
            choosePass();

        } else {

            // Reset to black.
            rl.setBackgroundColor(Color.parseColor("#111111"));
            resetCode();

            // Vibrate to indicate loss.
            vibrator.vibrate(500);
        }


    }

    public void resetCode() {
        chosen = new int[3];
        currentIndex = 0;
    }

    public void choosePass() {
        code11 = CHOICES[(int) Math.floor(Math.random() * CHOICES.length)];
        code12 = CHOICES[(int) Math.floor(Math.random() * CHOICES.length)];
        code13 = CHOICES[(int) Math.floor(Math.random() * CHOICES.length)];
        Log.d("WTF", getCode());
    }

    public String getCode() {
        return code11 + ", " + code12 + ", " + code13;
    }
}

