package com.igaworks.lucy.igawcommonsample;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;

import com.igaworks.IgawCommon;

/*
 * Created by HMin on 2015-06-11.
 */
public class SubActivity extends ActionBarActivity {

    // Igaworks Common
    public String tag = "Igaw";


    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

            /*
             * Your Code
             */
    }


     /*
      * Your Code
      */


    protected void onResume(){
        super.onResume();
        IgawCommon.startSession(getApplicationContext());
        Log.d(tag, "startSession ::: SubActivity");
    }

    protected void onPause(){
        super.onPause();
        IgawCommon.endSession();
        Log.d(tag, "endSession ::: SubActivity");
    }

}
