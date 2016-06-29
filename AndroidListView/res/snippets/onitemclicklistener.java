
listView.setOnItemClickListener(new OnItemClickListener() {
	@Override
	public void onItemClick(AdapterView<?> parent, View view,
		int position, long id) {
		Toast.makeText(getApplicationContext(),
			"Click ListItem Number " + position, Toast.LENGTH_LONG)
			.show();
	}
});