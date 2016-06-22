// configuration as before
ListView listView = (ListView) findViewById(R.id.list);
View header = getLayoutInflater().inflate(R.layout.header, null);
View footer = getLayoutInflater().inflate(R.layout.footer, null);
listView.addHeaderView(header);
listView.addFooterView(footer);
listView.setAdapter(new ArrayAdapter<String>(this,
		android.R.layout.simple_list_item_single_choice,
		android.R.id.text1, names));
	}
}
