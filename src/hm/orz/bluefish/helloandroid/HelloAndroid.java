package hm.orz.bluefish.helloandroid;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;

public class HelloAndroid extends Activity {
	private EditText edit;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Toast.makeText(this, "Hello Android!", Toast.LENGTH_SHORT).show();

		setContentView(R.layout.main);

        edit = (EditText)this.findViewById(R.id.editText1);
        findViewById(R.id.button1).setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Editable name = edit.getText();
                Toast.makeText(HelloAndroid.this, "こんにちは！ "+ name +"さん", Toast.LENGTH_LONG).show();
            }
        });

	}
}
