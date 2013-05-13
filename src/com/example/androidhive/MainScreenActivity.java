package com.example.androidhive;


import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ViewFlipper;

import com.android.database.DatabaseAdapter;




public class MainScreenActivity extends Activity{
	int mFlipping = 0 ;
	Button btnViewProducts;
	Button btnNewProduct;
	Button mButton ;
	private Button mButton1;

	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_screen);
	
		
		
	
		// Buttons
		btnViewProducts = (Button) findViewById(R.id.btnViewProducts);
		btnNewProduct = (Button) findViewById(R.id.btnCreateProduct);
		
		 mButton =(Button) findViewById(R.id.btn);
		// view products click event
		
			
		 mButton.setOnClickListener(new View.OnClickListener() {
			

				@Override
				public void onClick(View v) {
					ViewFlipper flipper = (ViewFlipper) findViewById(R.id.flipper1);
					
					if(mFlipping==0){
						/** Start Flipping */
						flipper.startFlipping();
						mFlipping=1;
						mButton.setText(R.string.str_btn_stop);
					}
					else{
						/** Stop Flipping */
						flipper.stopFlipping();					
						mFlipping=0;
						mButton.setText(R.string.str_btn_start);
					}
				}
			});
		

			Button backButton = (Button)findViewById(R.id.logout);
			backButton.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					startActivity(new Intent(MainScreenActivity.this,  login.class));				
				}
			});
		 
		btnViewProducts.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching All products Activity
				Intent i = new Intent(getApplicationContext(), AllProductsActivity.class);
				startActivity(i);
				
			}
		});
		
		// view products click event
		btnNewProduct.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching create new product activity
				Intent i = new Intent(getApplicationContext(), NewProductActivity.class);
				startActivity(i);
				
			}
		});
 
	    }
}
	




