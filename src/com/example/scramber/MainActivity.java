package com.example.scramber;

import java.util.Random;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements View.OnClickListener{
	
	EditText data;
	Button Jumble;
	String jText;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Jumble=(Button)findViewById(R.id.bJumble);
	    data=(EditText)findViewById(R.id.etView);
		Jumble.setOnClickListener(this);
		
		
	}

	@Override
	public void onClick(View arg0) {
		char temp;
		// TODO Auto-generated method stub
		 String text = data.getText().toString();
		 char jt[] = data.getText().toString().toCharArray();	
         int len=data.getText().toString().length();
        
         Random r = new Random();
         for(int i =len-1; i > 0; i--)
         {
           int rand = r.nextInt(i);
            temp=jt[i];
           jt[i]=jt[rand];
           jt[rand]=temp;
        }
         jText = String.copyValueOf(jt);
         Bundle basket = new Bundle();
 		basket.putString("key", jText);
 		Intent a = new Intent(this,DisplayText.class);
 		a.putExtras(basket);
 		startActivity(a);
	}

	

}
