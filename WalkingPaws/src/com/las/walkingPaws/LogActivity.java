package com.las.walkingPaws;

import org.apache.cordova.DroidGap;

import android.app.Activity;
import android.os.Bundle;

// Second activity for route history
public class LogActivity extends DroidGap {
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_layout);
	}
}