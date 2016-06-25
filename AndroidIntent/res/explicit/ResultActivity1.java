
package de.vogella.android.first;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ResultActivity extends Activity {

	@Override
	public void onCreate(Bundle bundle) {
		super.onCreate(bundle);
		setContentView(R.layout.activity_result);
		
		// TODO 1 get extras via getIntent().getExtras()
		// 
		// TODO 2 get the extras which is stored under the key 
		// "key1", type is a string
		
		// TODO 3
		// find the TextView with the "R.id.input" id 
		// and show the value of the string (extra)
	}

}
