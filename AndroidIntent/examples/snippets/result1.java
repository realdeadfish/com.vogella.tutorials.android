
public void onClick(View view) {
	Intent i = new Intent(this, ActivityTwo.class);
	i.putExtra("Value1", "This value one for ActivityTwo ");
	i.putExtra("Value2", "This value two ActivityTwo");
	// set the request code to any code you like,
	// you can identify the callback via this code
	startActivityForResult(i, REQUEST_CODE);
}
