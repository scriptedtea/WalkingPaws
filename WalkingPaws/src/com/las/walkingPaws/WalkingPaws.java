/*
       Licensed to the Apache Software Foundation (ASF) under one
       or more contributor license agreements.  See the NOTICE file
       distributed with this work for additional information
       regarding copyright ownership.  The ASF licenses this file
       to you under the Apache License, Version 2.0 (the
       "License"); you may not use this file except in compliance
       with the License.  You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

       Unless required by applicable law or agreed to in writing,
       software distributed under the License is distributed on an
       "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
       KIND, either express or implied.  See the License for the
       specific language governing permissions and limitations
       under the License.
 */

package com.las.walkingPaws;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.app.TabActivity;

import org.apache.cordova.*;

public class WalkingPaws extends DroidGap//TabActivity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        // Set by <content src="index.html" /> in config.xml
        super.loadUrl(Config.getStartUrl());
        //super.loadUrl("file:///android_asset/www/index.html")
    	
//    	super.onCreate(savedInstanceState);
//        setContentView(R.layout.main);
//         
//        TabHost tabHost = getTabHost(); // Creating a tab host for the two tabs: start and log
//         
//        // Tab for Start
//        TabSpec startspec = tabHost.newTabSpec("Start");
//        // setting Title and Icon for the Tab
//        startspec.setIndicator("Start", getResources().getDrawable(R.drawable.icon_start_tab));
//        Intent startIntent = new Intent(this, StartActivity.class);
//        startspec.setContent(startIntent);
//         
//        // Tab for Log
//        TabSpec logspec = tabHost.newTabSpec("Log");        
//        logspec.setIndicator("Log", getResources().getDrawable(R.drawable.icon_log_tab));
//        Intent logIntent = new Intent(this, LogActivity.class);
//        logspec.setContent(logIntent);
//         
//        // Adding all TabSpec to TabHost
//        tabHost.addTab(startspec); // Adding start tab
//        tabHost.addTab(logspec); // Adding log tab
    }
}

