package com.example.newformapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DisplayMessageActivity extends Activity {

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_message);
	
	

	// Make sure we're running on Honeycomb or higher to use ActionBar APIs
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
        // Show the Up button in the action bar.
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }

	
	Intent intent = getIntent();
	String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
	String message2 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE1);
	
	// Create the text views and the overall layout
	
	LinearLayout lv = new LinearLayout(this);
    TextView textView = new TextView(this);
    textView.setTextSize(40);
    textView.setText(message);
    
    TextView textView1 = new TextView(this);
    textView1.setTextSize(40);
    textView1.setText(message2);
    
    lv.setOrientation(1);
    lv.addView(textView);
    lv.addView(textView1);
    
    
    
    
    // Set the linear layout as the activity layout
    
    
    
    setContentView(lv);
    
 	
	}

	
	
}