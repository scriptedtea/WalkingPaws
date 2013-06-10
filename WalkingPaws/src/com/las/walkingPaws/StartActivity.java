package com.las.walkingPaws;

import org.apache.cordova.DroidGap;
import org.apache.cordova.api.LOG;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

// First activity layout for the start and stop button for recording route
public class StartActivity extends DroidGap {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_layout);
        
        // Initialize start and stop button
        // When start button is pressed, stop button appears
        final Button startButton = (Button) findViewById(R.id.startButton);
        final Button stopButton = (Button) findViewById(R.id.stopButton);
        stopButton.setVisibility(View.INVISIBLE);
        startButton.setVisibility(View.VISIBLE);
        
        stopButton.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View v) {
        		stopButton.setVisibility(View.INVISIBLE);
        		startButton.setVisibility(View.VISIBLE);
        		stopRecording(v);
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
    	
    	// Insert code for recording route after start button is pressed.
    	LOG.v("StartActivity", "Start button pressed!");
    }
    
    public void stopRecording(View v) {
    	
    }
}