package mx.essentialab.sevenminworkout;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class SignInActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void goToMainActivity(View v){
		
	}
}
