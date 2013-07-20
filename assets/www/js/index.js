/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
var app = {
    // Application Constructor
    initialize: function() {
        this.bindEvents();
    },
    // Bind Event Listeners
    //
    // Bind any events that are required on startup. Common events are:
    // 'load', 'deviceready', 'offline', and 'online'.
    bindEvents: function() {
        document.addEventListener('deviceready', this.onDeviceReady, false);
    },
    // deviceready Event Handler
    //
    // The scope of 'this' is the event. In order to call the 'receivedEvent'
    // function, we must explicity call 'app.receivedEvent(...);'
    onDeviceReady: function() {
        // Init our parse SDK
        app.initializeParse();
    	
        // test parse connectivity
        //app.testParse();
        
        app.receivedEvent('deviceready');
    },
    initializeParse: function() {
    	// Init with our app info and Key
    	var parseAppID = "ckEh7vULmKVyDPUpyPF5wlasRbIegXKruD96hzSd",
        parseApiKey = "JzcCwRLgLTEuG8IcETcUil0ALN5ctviGg9ijIPo5";
    	
    	if (parseAppID == "" || parseApiKey == "") {
    		alert("Setup a parse account and add your AppID and ApiKey in 'initializeParse'");
    	}
    	
    	Parse.initialize(parseAppID, parseApiKey);
    },
    testParse: function() {
    	// Create a test object and try to save it
    	var TestObject = Parse.Object.extend("TestObject");
    	var testObject = new TestObject();
    	testObject.save({foo: "bar"}, {
    	  success: function(object) {
    		  console.log("Parse Test Successful!");
    	  }
    	});
    },
    // Update DOM on a Received Event
    receivedEvent: function(id) {
        var parentElement = document.getElementById(id);
        var listeningElement = parentElement.querySelector('.listening');
        var receivedElement = parentElement.querySelector('.received');

        listeningElement.setAttribute('style', 'display:none;');
        receivedElement.setAttribute('style', 'display:block;');

        console.log('Received Event: ' + id);
    }
};
