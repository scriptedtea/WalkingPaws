package com.las.walkingPaws;

import org.apache.cordova.api.LOG;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_layout);
        
        final Button startButton = (Button) findViewById(R.id.startButton);
        final Button stopButton = (Button) findViewById(R.id.stopButton);
        stopButton.setVisibility(View.INVISIBLE);
        startButton.setVisibility(View.VISIBLE);
        
        stopButton.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View v) {
        		
        	}
        });
        
        startButton.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View v) {
        		startButton.setVisibility(View.INVISIBLE);
        		stopButton.setVisibility(View.VISIBLE);
        		startRecording(v);
        	}
        });
    }
    
    public void startRecording(View v) {
    	LOG.v("StartActivity", "Start button pressed!");
    }
}