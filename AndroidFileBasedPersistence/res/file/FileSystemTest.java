
package de.vogella.android.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class FileSystemTest extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		String eol = System.getProperty("line.separator");
		try {
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					openFileOutput("myfile", MODE_WORLD_WRITEABLE)));
			writer.write("This is a test1." + eol);
			writer.write("This is a test2." + eol);
			writer.write("This is a test3." + eol);
			writer.write("This is a test4." + eol);
			writer.write("This is a test5." + eol);
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			BufferedReader input = new BufferedReader(new InputStreamReader(
					openFileInput("myfile")));
			String line;
			StringBuffer buffer = new StringBuffer();
			while ((line = input.readLine()) != null) {
				buffer.append(line + eol);
			}
			TextView textView = (TextView) findViewById(R.id.result);
			if (textView == null) {
				Log.e("TEST", "Wtf");
			}
			textView.setText(buffer.toString());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}