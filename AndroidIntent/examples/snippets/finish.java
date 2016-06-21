
@Override
public void finish() {
	// Prepare data intent 
	Intent data = new Intent();
	data.putExtra("returnKey1", "Swinging on a star. ");
	data.putExtra("returnKey2", "You could be better then you are. ");
	// Activity finished ok, return the data
	setResult(RESULT_OK, data);
	super.finish();
}
