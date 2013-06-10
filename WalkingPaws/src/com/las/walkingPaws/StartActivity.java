package com.las.walkingPaws;

import org.apache.cordova.api.LOG;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class StartActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_layout);
    }
    
    public void startRecording(View view) {
    	LOG.d("StartActivity", "Start button pressed!");
    }
}