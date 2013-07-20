package com.las.walkingPaws;

import org.apache.cordova.DroidGap;
import org.apache.cordova.api.LOG;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import javax.script.*;

// First activity layout for the start and stop button for recording route
public class StartActivity extends DroidGap {
	 ScriptEngineManager manager = new ScriptEngineManager();
     ScriptEngine engine = manager.getEngineByName("JavaScript");
	 ScriptEngineFactory f = engine.getFactory();
	   String [] variables ={
	    		
			 " var track_id = '';",      // Name/ID of the exercise
			  " watch_id = null;",    // ID of the geolocation
			  " tracking_data = [];" // Array containing GPS position objects		
	    		
	    		
	    }	;
	   
	   
//	   document.addEventListener("deviceready", function(){
//			
//			if(navigator.network.connection.type == Connection.NONE){
//				$("#home_network_button").text('No Internet Access')
//										 .attr("data-icon", "delete")
//										 .button('refresh');
//			}
//
//		});
//	    	 
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_layout);
        
        // Initialize start and stop button
        // When start button is pressed, stop button appears
        final Button startButton = (Button) findViewById(R.id.startButton);
        final Button stopButton = (Button) findViewById(R.id.stopButton);
       // final Button networkButton = (Button) findViewById(R.id.networkButton);
        
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
    
  //start and stop recording doesn't plot 
  //when you go into route history -> when u can see the map
    
    public void startRecording(View v) {
    	
    	// Insert code for recording route after start button is pressed.
    	LOG.v("StartActivity", "Start button pressed!");

 String script = "  watch_id = navigator.geolocation.watchPosition("+
		    
		    	// Success
		   "     function(position){ tracking_data.push(position);},"+
		        		        
		        // Error
		       "function(error){ console.log(error);}," +
		       
		        
		        // Settings
		        "{ frequency: 3000, enableHighAccuracy: true });";
		        
//show track id
//show tracking status?
 //need to add in route history
 

String program = f.getProgram(variables);
try {
	engine.eval(program);
	engine.eval(script);
	
} catch (ScriptException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
    	
    	
    }
    
//Saves all location points
    public void stopRecording(View v) {
    	
    	
   String [] statements = {
		   "navigator.geolocation.clearWatch(watch_id);",
		   "window.localStorage.setItem(track_id, JSON.stringify(tracking_data));",
		   "var watch_id = null;",
		   "var tracking_data = null;"
		   
   };
   String program = f.getProgram(variables);
   String program2 = f.getProgram(statements);
   
  try {
	engine.eval(program);
	  engine.eval(program2);
} catch (ScriptException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}	
    }
    

    
    
    
}