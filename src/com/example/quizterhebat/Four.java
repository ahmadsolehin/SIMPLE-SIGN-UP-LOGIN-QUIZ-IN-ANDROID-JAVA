package com.example.quizterhebat;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Four extends Activity {
	RadioButton rb1,rb2,rb3;
	RadioGroup rg1;
	
	TextView d;
	String x;
	int xray;
	String ayam;
	Button b1;
	LoginDataBaseAdapter loginDataBaseAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_four);
		
		
		// get Instance  of Database Adapter
		loginDataBaseAdapter=new LoginDataBaseAdapter(this);
		loginDataBaseAdapter=loginDataBaseAdapter.open();
		
	
				
		d = (TextView) findViewById(R.id.textView2);
		b1 = (Button) findViewById(R.id.button1);
		

		Bundle extras = getIntent().getExtras();
		    ayam= extras.getString("mark");
		    xray = Integer.parseInt(ayam);
		    d.setText(ayam);

		
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
			    loginDataBaseAdapter.insertTotal(ayam);
			    Toast.makeText(getApplicationContext(), "save Successfully  ", Toast.LENGTH_LONG).show();
			 // Insert the row into your table
			
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.four, menu);
		return true;
	}

}
