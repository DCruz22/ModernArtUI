package com.dariel.cruz.modern_art_ui.activities;

import android.app.DialogFragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.SeekBar;


import com.dariel.cruz.modern_art_ui.R;
import com.dariel.cruz.modern_art_ui.dialogs.AlertDialogFragment;


public class MainActivity extends AppCompatActivity{

    private static final String TAG = "MainActivity";
    private static final String Url = "http://www.moma.org/";
    private DialogFragment mDialogFragment = null;
    private SeekBar mSeekBar = null;
    private View mView1 = null;
    private View mView2 = null;
    private View mView3 = null;
    private View mView4 = null;
    private View mView5 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mView1 = findViewById(R.id.View1);
        mView2 = findViewById(R.id.View2);
        mView3 = findViewById(R.id.View3);
        mView4 = findViewById(R.id.View4);
        mView5 = findViewById(R.id.View5);

        mSeekBar = (SeekBar) findViewById(R.id.seekBar);
        mSeekBar.setMax(200);
        mSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                mView1.setBackgroundColor(makeColor(255, 255, 255 - i));
                mView2.setBackgroundColor(makeColor(175, 244 - i, 253));
                mView3.setBackgroundColor(makeColor(31 + i, 40, 255 - i));
                mView4.setBackgroundColor(makeColor(252 - i, 209, 47 + i));
                mView5.setBackgroundColor(makeColor(250 - i, 175, 243 - i));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

    private int makeColor(int r, int g, int b){
        return b + g * 256 + r * 256 * 256 + 255 * 256 * 256 *256;
    }

    public void onDialogPositive(){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(Url));
        Intent chooserIntent = Intent.createChooser(i, "Open with:");
        startActivity(chooserIntent);
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
