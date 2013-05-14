package com.example.androidhive;

import com.android.database.DatabaseAdapter;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class zahialga extends Activity {
	private EditText ovog;
	private EditText bank;
	private EditText dugaar;
	private EditText ddugaar;
	private EditText home;

	private EditText email;
	
	private Button zahialButton;
	private Button clearButton;
	private Button exitButton;

	
	 public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	    	setContentView(R.layout.zahialga);
			
	        
	       
	        
	      
	    	 
	         initControls();
	     }


	private void initControls() {
		// TODO Auto-generated method stub
		 
		    
				ovog = (EditText) findViewById(R.id.ovog);
				bank = (EditText) findViewById(R.id.bank);
				dugaar = (EditText) findViewById(R.id.dugaar);
				ddugaar = (EditText) findViewById(R.id.ddugaar);
				home = (EditText) findViewById(R.id.home);
				
				email = (EditText) findViewById(R.id.email);
				
				zahialButton = (Button) findViewById(R.id.zahial);
		    	clearButton = (Button) findViewById(R.id.Clear);
		    	exitButton = (Button) findViewById(R.id.Exit);
		    	
		    	//Create touch listeners for all buttons.
		    	
	 
	
	clearButton.setOnClickListener(new Button.OnClickListener(){
		public void onClick (View v){
			ClearForm();
		}
	});
	
	exitButton.setOnClickListener(new Button.OnClickListener(){
		public void onClick (View v){
			Exit();
		}

		private void Exit() {
			// TODO Auto-generated method stub
			finish();
		}
	});



	zahialButton.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View view) {
			// Launching All products Activity
			Intent i = new Intent(getApplicationContext(), login.class);
			startActivity(i);
			
		}
	});
	}

	protected void ClearForm() {
		// TODO Auto-generated method stub
		ovog.setText("");
    	bank.setText("");
    	dugaar.setText("");
    	ddugaar.setText("");
    	email.setText("");
    	home.setText("");
	}


	
}