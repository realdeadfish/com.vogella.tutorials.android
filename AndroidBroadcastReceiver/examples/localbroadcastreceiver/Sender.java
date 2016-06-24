// This method is assigned to button in the layout
// via the onClick property
public void onClick(View view) {
	sendMessage();
}

// Send an Intent with an action named "my-event". 
private void sendMessage() {
  Intent intent = new Intent("my-event");
  // add data
  intent.putExtra("message", "data");
  LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
}