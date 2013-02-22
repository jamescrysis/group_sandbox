package com.example.firstgroupapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

	private Button mapSearch;
	private Button exit;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
               
        mapSearch = (Button) findViewById(R.id.button1);     
        exit = (Button) findViewById(R.id.button2); 
        
        mapSearch.setOnClickListener(this);
        exit.setOnClickListener(this);
  
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
 
    	
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

	
	public void onClick(View btn) {
		
		if(btn == mapSearch){			
			
			//Start Map Activity
			Intent intent = new Intent(this, MapActivity.class);			
			startActivity(intent);
			
			
			
		}
		else if(btn == exit){
			
			// Close Program
			finish();
		}
		
		
	}
    
}
