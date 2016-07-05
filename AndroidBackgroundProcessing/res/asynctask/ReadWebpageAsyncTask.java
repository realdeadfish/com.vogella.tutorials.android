package de.vogella.android.asynctask;

// imports cut out for brevity 

public class ReadWebpageAsyncTask extends Activity {
	private TextView textView;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		textView = (TextView) findViewById(R.id.TextView01);
	}

	private class DownloadWebPageTask extends AsyncTask<String, Void, String> {
		@Override
		protected String doInBackground(String... urls) {
			// we use the OkHttp library from https://github.com/square/okhttp
			OkHttpClient client = new OkHttpClient();
			Request request = 
					new Request.Builder()
					.url(urls[0])
					.build();
				 Response response = client.newCall(request).execute();
				 if (response.isSuccessful()) {
					 return response.body().string();
				 }
			}
			return "Download failed";
		}

		@Override
		protected void onPostExecute(String result) {
			textView.setText(result);
		}
	}

	public void onClick(View view) {
		DownloadWebPageTask task = new DownloadWebPageTask();
		task.execute(new String[] { "http://www.vogella.com/index.html" });

	}
}