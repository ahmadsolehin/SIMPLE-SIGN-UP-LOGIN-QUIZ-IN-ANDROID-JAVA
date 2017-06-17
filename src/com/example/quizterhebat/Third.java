package com.example.quizterhebat;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class Third extends Activity {
	TextView tx1;
	
	RadioButton rb1,rb2,rb3;
	RadioGroup rg1;
	String ayam,haha;
     String x;
	int xray;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_third);
		tx1 = (TextView) findViewById(R.id.textView1);
		
		Bundle extras = getIntent().getExtras();
		    ayam= extras.getString("mark");
		    xray = Integer.parseInt(ayam);
		    tx1.setText(ayam);
		
		rb1 = (RadioButton) findViewById(R.id.radio0);
		rb2 = (RadioButton) findViewById(R.id.radio1);
		rb3 = (RadioButton) findViewById(R.id.radio2);
		rg1 = (RadioGroup) findViewById(R.id.radioGroup1);
				
		rg1.setOnCheckedChangeListener(new OnCheckedChangeListener() 
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.radio0:
                    	xray--;
                    break;

                    case R.id.radio1:
                    	xray--;
        				break;

                    case R.id.radio2:
                    	xray++;
        				break;

                }

                Intent lembu = new Intent(Third.this,Four.class);
                haha = String.valueOf(xray);
   			    lembu.putExtra("mark", haha);
               startActivity(lembu);
            }
        });
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.third, menu);
		return true;
	}

}
