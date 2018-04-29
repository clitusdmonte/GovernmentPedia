package com.example.shruti.governmentpedia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

/**
 * Created by 7000 on 4/14/2017.
 */

public class AboutActivity extends AppCompatActivity {

    //***********************************
    //Protected Method
    //***********************************

    /**
     * Adds content to the layout activity_about
     * @param savedInstanceState
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_about);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
    }

    /**
     *
     * @param item Menuitem
     * @return selected option
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Intent clickedNoteIntent = new Intent();
                setResult(RESULT_OK, clickedNoteIntent);
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * finish the method once clicked ok
     */

    @Override
    public void onBackPressed(){
        Intent clickedNoteIntent = new Intent();
        setResult(RESULT_OK, clickedNoteIntent);
        finish();
    }
}
