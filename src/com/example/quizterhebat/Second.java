package com.example.quizterhebat;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Second extends Activity{
	
	RadioButton rb1,rb2,rb3;
	RadioGroup rg1;
	Button next;
	TextView h1;
    int total = 0;
	int selectedValueId;
	String haha;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		rb1 = (RadioButton) findViewById(R.id.radio0);
		rb2 = (RadioButton) findViewById(R.id.radio1);
		rb3 = (RadioButton) findViewById(R.id.radio2);
		rg1 = (RadioGroup) findViewById(R.id.radioGroup1);
		next = (Button) findViewById(R.id.button1);
		h1 = (TextView) findViewById(R.id.textView1);
		
		
		
		next.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				//getting the id of selected radio button 
                selectedValueId = rg1.getCheckedRadioButtonId();
                //checking the id of the selected radio
                if(selectedValueId == rb1.getId())
                {
                    total--;
                }
                else if(selectedValueId == rb2.getId())
                {
                    total++;
                }
                else if(selectedValueId == rb3.getId()){
                	total--;
                
                	
                }
   			    Intent lembu = new Intent(Second.this,Third.class);
   			    haha = String.valueOf(total);
   			    lembu.putExtra("mark", haha);
               startActivity(lembu);
			}
		});
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second, menu);
		return true;
	}

}
