package com.example.firstgroupapp;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;

public class MapActivity extends Activity implements OnClickListener {

	
	private Button search;
	private EditText longitude;
	private EditText latitude;
	private Button returnHome;
	private TextView text;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map);
		
		search = (Button) findViewById(R.id.button1); 
		longitude = (EditText) findViewById(R.id.editText1);
		latitude = (EditText) findViewById(R.id.editText2);
     	text = (TextView) findViewById(R.id.textView3);
		returnHome =  (Button) findViewById(R.id.button2); 
		  
		
		search.setOnClickListener(this);
		returnHome.setOnClickListener(this);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.map, menu);
		return true;
	}

	@Override
	public void onClick(View btn) {
		
		
		if(btn == returnHome){
			
			Intent intent = new Intent(this, MainActivity.class);			
			startActivity(intent);
		}
		else if(btn == search){
			
			// Check if any fields are blank			
			if(longitude.getText().toString().length() == 0 || latitude.getText().toString().length() == 0){
				
				text.setText("Cannot be left blank");
			}
			else{
				
				double latit, longit;
				
				latit = Double.parseDouble(latitude.getText().toString());
				longit = Double.parseDouble(longitude.getText().toString());
				
				//Intent action = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:" + latit + "," +longit));
				Intent action = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=101 Saint Nicholas Dr., North Pole,AK"));
				startActivity(action);
			}
			
			
		}
		
		
		
		
	}

}
