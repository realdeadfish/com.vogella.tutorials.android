@Override
public void onResume() {
	super.onResume();

  // Register mMessageReceiver to receive messages.
  LocalBroadcastManager.getInstance(this).registerReceiver(mMessageReceiver,
      new IntentFilter("my-event"));
}

// handler for received Intents for the "my-event" event 
private BroadcastReceiver mMessageReceiver = new BroadcastReceiver() {
  @Override
  public void onReceive(Context context, Intent intent) {
    // Extract data included in the Intent
    String message = intent.getStringExtra("message");
    Log.d("receiver", "Got message: " + message);
  }
};

@Override
protected void onPause() {
  // Unregister since the activity is not visible
  LocalBroadcastManager.getInstance(this).unregisterReceiver(mMessageReceiver);
  super.onPause();
}