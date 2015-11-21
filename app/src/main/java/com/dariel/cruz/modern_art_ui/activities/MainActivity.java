package com.dariel.cruz.modern_art_ui.activities;

import android.app.Activity;
import android.app.DialogFragment;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SeekBar;


import com.dariel.cruz.modern_art_ui.R;
import com.dariel.cruz.modern_art_ui.dialogs.AlertDialogFragment;


public class MainActivity extends AppCompatActivity{

    private static final String TAG = "MainActivity";
    private static final String Url = "http://www.moma.org/";
    private DialogFragment mDialogFragment = null;
    private SeekBar mSeekBar = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSeekBar = (SeekBar) findViewById(R.id.seekBar);
        mSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }


    public void onDialogPositive(){

    }

    public void onDialogNegative(){
        //do nothing.
    }

    public void showFragment(){
        mDialogFragment = AlertDialogFragment.newInstance();

        mDialogFragment.show(getFragmentManager(), TAG);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.more_information:
                showFragment();
                return true;
            default:
            return super.onOptionsItemSelected(item);
        }
    }

}
