
@Override
protected void onActivityResult(int requestCode, int resultCode, Intent data) {
	if (resultCode == RESULT_OK && requestCode == REQUEST_CODE) {
		if (data.hasExtra("returnKey1")) {
			Toast.makeText(this, data.getExtras().getString("returnKey1"),
				Toast.LENGTH_SHORT).show();
		}
	}
}
