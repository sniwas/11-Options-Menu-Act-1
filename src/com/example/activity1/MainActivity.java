package com.example.activity1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class MainActivity extends Activity {
	ImageView iv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		iv=(ImageView)findViewById(R.id.imageView1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	@Override
	public boolean onOptionsItemSelected(@NonNull MenuItem item)
	{
		switch(item.getItemId())
		{
		case R.id.Anniversary:
			iv.setImageResource(R.drawable.anniversary);
			return true;
		case R.id.Birthday:
			iv.setImageResource(R.drawable.download);
			return true;
		case R.id.Thankyou:
			iv.setImageResource(R.drawable.thank);
			return true;
		case R.id.Welcome:
			iv.setImageResource(R.drawable.welcome);
			return true;
		default:
				return super.onOptionsItemSelected(item);
		}
	}

}
