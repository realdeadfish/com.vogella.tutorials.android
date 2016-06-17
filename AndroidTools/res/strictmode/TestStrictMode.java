
package de.vogella.android.strictmode;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;

public class TestStrictMode extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Activate StrictMode
		StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder()
				.detectAll()
				.detectDiskReads()
				.detectDiskWrites()
				.detectNetwork() 
				 // alternatively .detectAll() for all detectable problems
				.penaltyLog()
				.penaltyDeath()
				.build());
		StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder()
		 		.detectLeakedSqlLiteObjects()
		 		.detectLeakedClosableObjects()
				// alternatively .detectAll() for all detectable problems
				.penaltyLog()
				.penaltyDeath()
				.build());
		
		// Test code
		setContentView(R.layout.main);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		String eol = System.getProperty("line.separator");
		try {
			BufferedWriter writer = 
					new BufferedWriter(
							new OutputStreamWriter(
							openFileOutput("myfile", 
							MODE_WORLD_WRITEABLE)));
			writer.write("This is a test1." + eol);
			writer.write("This is a test2." + eol);
			writer.write("This is a test3." + eol);
			writer.write("This is a test4." + eol);
			writer.write("This is a test5." + eol);
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}