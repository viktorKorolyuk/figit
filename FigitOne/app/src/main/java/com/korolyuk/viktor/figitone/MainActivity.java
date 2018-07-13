package com.korolyuk.viktor.figitone;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private boolean arcadeToggle = false;
    private boolean timedToggle = false;
    private boolean scoresToggle = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final ImageView iv = (ImageView) findViewById(R.id.iconInfo);
        final Button start = (Button) findViewById(R.id.button);
        final Button arcade = (Button) findViewById(R.id.button2);
        final Button timed = (Button) findViewById(R.id.button3);
        final Button score = (Button) findViewById(R.id.button4);


        arcade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv.setImageResource(R.drawable.one_on_all_off);
                setArcTimeSco(1, 0, 0);
            }
        });
        timed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv.setImageResource(R.drawable.two_on_all_off);
                setArcTimeSco(0, 1, 0);
            }
        });
        score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv.setImageResource(R.drawable.three_on_all_off);
                setArcTimeSco(0, 0, 1);
            }
        });

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*
                 *   SharedPreferences settings = getSharedPreferences("Settings", MODE_WORLD_READABLE);
                 *   SharedPreferences.Editor poluEdit_two = settings.edit();
                 *    poluEdit_two.putInt("setting", rains);
                 *     poluEdit_two.commit();
                 */
                if (arcadeToggle) {
                    Intent arcade = new Intent(MainActivity.this, arcade.class);
                    startActivity(arcade);
                } else if (timedToggle) {

                } else if (scoresToggle) {

                }
                if (!(scoresToggle || arcadeToggle || timedToggle)) {
                    throw new RuntimeException("Idiot user!");
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

    public void setArcTimeSco(int arc, int time, int sco) {
        this.arcadeToggle = arc == 1;
        this.timedToggle = time == 1;
        this.scoresToggle = sco == 1;
    }
}
