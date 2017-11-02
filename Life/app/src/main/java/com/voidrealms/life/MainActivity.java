package com.voidrealms.life;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static String tag = "voidrealms";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(tag,"create");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag,"start");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag,"stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag,"destroy");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag,"resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag,"pause");
    }


    @Override
    protected void onRestart() {
        super.onPause();
        Log.d(tag,"restart");
    }
}
