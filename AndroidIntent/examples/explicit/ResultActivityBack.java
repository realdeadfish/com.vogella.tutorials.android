
package de.vogella.android.first;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ResultActivity extends Activity {

	
/** Called when the activity is first created. */

	@Override
	public void onCreate(Bundle bundle) {
		super.onCreate(bundle);
		setContentView(R.layout.activity_result);
		Bundle extras = getIntent().getExtras();
		if (extras == null) {
			return;
		}
		String value1 = extras.getString("key1");
		if (value1 != null) {
			TextView text = (TextView) findViewById(R.id.input);
			text.setText(value1);
		}
	}

	@Override
	public void finish() {
		Intent data = new Intent();
		EditText view = (EditText) findViewById(R.id.returnValue);
		String string = view.getText().toString();
		data.putExtra("returnKey1", string);
		setResult(RESULT_OK, data);
		super.finish();
	}
}
