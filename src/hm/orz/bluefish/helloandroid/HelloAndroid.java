package hm.orz.bluefish.helloandroid;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class HelloAndroid extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Toast.makeText(this, "Hello Android!", Toast.LENGTH_SHORT).show();

		setContentView(R.layout.main);
	}
}
