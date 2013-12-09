package org.androidtown.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//버튼 객체 참조
		Button button1= (Button) findViewById(R.id.button1);
		button1.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), "시작 버튼이 눌렸어요",Toast.LENGTH_LONG).show();
			}
		});
		Button button2= (Button) findViewById(R.id.button2);
		button2.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), "시작 버튼이 눌렸어요",Toast.LENGTH_LONG).show();
			}
		});
		Button button3= (Button) findViewById(R.id.button3);
		button3.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), "시작 버튼이 눌렸어요",Toast.LENGTH_LONG).show();
			}
		});

	}
		

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
