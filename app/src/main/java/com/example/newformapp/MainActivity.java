package com.example.newformapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
	public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
	public final static String EXTRA_MESSAGE1 = "com.example.myfirstapp.MESSAGE2";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	
	/** Called when the user clicks the Send button */
	
	public void sendMessage (View view) {
		// Do something in response to button
		Intent intent = new Intent(this, DisplayMessageActivity.class);
		EditText editText = (EditText) findViewById(R.id.editText1);
		String message = editText.getText().toString();
		intent.putExtra(EXTRA_MESSAGE, message);
		EditText editText2 = (EditText) findViewById(R.id.editText2);
		String message2 = editText2.getText().toString();
		intent.putExtra(EXTRA_MESSAGE1, message2);
		
		startActivity(intent);
	}

}
