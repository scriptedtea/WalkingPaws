package com.las.walkingPaws;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;

import org.apache.cordova.DroidGap;

import android.app.Activity;
import android.os.Bundle;

// Second activity for route history
public class LogActivity extends DroidGap {
	 ScriptEngineManager manager = new ScriptEngineManager();
     ScriptEngine engine = manager.getEngineByName("JavaScript");
	 ScriptEngineFactory f = engine.getFactory();
	 
	 
	 
public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_layout);
        //count # of entries in localStorage
        //TODO: display information 
        //TODO: refresh list  		
       		
        String [] statements ={
        
       	 " tracks_recorded = window.localStorage.length;",   
   			
   	    }	;
	
        String [] trackInfo ={
        //find track_id of the workout they're viewing        
              		 
          			
          	    }	;
       	
        
        
        
        
        
        
        
	
	}
}
