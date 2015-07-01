package com.igaworks.lucy.igawcommonsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;

import com.igaworks.IgawCommon;


public class MainActivity extends ActionBarActivity {

    // Igaworks Common
    String tag = "Igaw";

    //this version


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Igaworks Common
        IgawCommon.startApplication(MainActivity.this);
        Log.d(tag, "startApplication ::: MainActivity");

        /*
         * Your Code
         */
    }


     /*
      * Your Code
      */


    // Your Code
    public void moveSubactivity(View view){
        Log.d(tag, "moveSubactivity ::: Button Click");

        Intent intent = new Intent(this, SubActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();

        // Igaworks Common
        IgawCommon.startSession(MainActivity.this);
        Log.d(tag, "startSession ::: MainActivity" );

        /*
         * Your Code
         */
    }

    @Override
    protected void onPause() {
        super.onPause();

        // Igaworks Common
        IgawCommon.endSession();
        Log.d(tag, "endSession ::: MainActivity");

        /*
         * Your Code
         */
    }

}
