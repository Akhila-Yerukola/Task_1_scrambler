package com.example.scramber;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class DisplayText extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_text);
		TextView disp=(TextView)findViewById(R.id.tvDisplay);
		Bundle gotBasket=getIntent().getExtras();
				 String jtxt=gotBasket.getString("key");
				disp.setText(jtxt);
		
	}

	

}
