package com.vogella.android.jobscheduler;

import android.app.Activity;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends Activity {
	TestJobService testService;
	private static int kJobId = 0;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void onClick(View v) {
		ComponentName mServiceComponent = new ComponentName(this, TestJobService.class);
		JobInfo.Builder builder = new JobInfo.Builder(kJobId++, serviceComponent);
		builder.setMinimumLatency(5 * 1000); // wait at least
		builder.setOverrideDeadline(50 * 1000); // maximum delay
		builder.setRequiredNetworkType(JobInfo.NETWORK_TYPE_UNMETERED); // require unmetered network
		builder.setRequiresDeviceIdle(true); // device should be idle
		builder.setRequiresCharging(false); // we don't care if the device is charging or not
		JobScheduler jobScheduler = getApplication().getSystemService(Context.JOB_SCHEDULER_SERVICE);
		jobScheduler.schedule(builder.build());
	}

	public void cancelAllJobs(View v) {
		JobScheduler tm = (JobScheduler) getSystemService(Context.JOB_SCHEDULER_SERVICE);
		tm.cancelAll();
	}


}