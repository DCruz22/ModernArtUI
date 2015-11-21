package com.dariel.cruz.modern_art_ui.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;


import com.dariel.cruz.modern_art_ui.R;


public class MainActivity extends ActionBarActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

}
