package edu.nyu.scps.seekbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SeekBar;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    final String makeALongStoryShort[] = {"If you Having coding Problems",
            " That's too bad for you Son",
            " Cause I got 99 Probs but Android Ain't One",
            "This is what you call the Waffle",
            " Rambling on and on endlessly",
            " Just to make this textbox big enough",
            " And make it scroll for ever and ever and ever",
            " Mary Had a little Lamp, Little Lamp, Little Lamp",
            "That Bitch Mary got killed by father Francis",
            "The end of times are Near. Ruuuuuuuunnnnnnn"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar);
//        int celsius = seekBar.getProgress();

        int scale = seekBar.getProgress();


        final TextView textView = (TextView) findViewById(R.id.textView);
//

//        for ( int i = 0; i < 9;) {
//            textView.setText(makeALongStoryShort[i]);
        int i = 0;
        do {


//            textView.setLines(2);
            textView.setText(makeALongStoryShort[i]);




            seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

//                seekBar.setMax(10);

                    scrollText(progress, textView);

//                textView.setText(String.format(format, celsiusToFahrenheit(celsius), celsius));

//                tex
                }


                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {
                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {
                }
            });

            i++;

        }
        while (i < 10);
    }

//    }

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


    //Convert Celsius to Fahrenheit.

    private static float celsiusToFahrenheit(int celsius) {
        return 32f + celsius * (212f - 32f) / (100f - 0f);
    }

    private void scrollText(int progress, TextView textView) {

        if (progress < 10) {
            textView.setText(makeALongStoryShort[progress]);

        }

    }
}
