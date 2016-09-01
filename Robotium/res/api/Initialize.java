package de.vogella.android.test.target.test;

import junit.framework.Assert;
import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;

import de.vogella.android.test.target.SimpleActivity;
import de.vogella.android.test.target.SimpleListActivity;

public class SimpleActivityTest extends
		ActivityInstrumentationTestCase2<SimpleActivity> {

	private Solo solo;

	public SimpleActivityTest() {
		super(SimpleActivity.class);
	}

	public void setUp() throws Exception {
		solo = new Solo(getInstrumentation(), getActivity());
	}

	
	@Override
	public void tearDown() throws Exception {
		solo.finishOpenedActivities();
	}
}