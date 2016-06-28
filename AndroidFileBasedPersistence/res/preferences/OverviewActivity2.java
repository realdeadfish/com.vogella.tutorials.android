@Override
public boolean onCreateOptionsMenu(Menu menu) {
	MenuInflater inflater = getMenuInflater();
	inflater.inflate(R.menu.mainmenu, menu);
	return true;
}

// This method is called once the menu is selected
@Override
public boolean onOptionsItemSelected(MenuItem item) {
	switch (item.getItemId()) {
	case R.id.preferences:
		// Launch settings activity
		Intent i = new Intent(this, SettingsActivity.class);
		startActivity(i);
		break;
		// more code...
	}
	return true;
}