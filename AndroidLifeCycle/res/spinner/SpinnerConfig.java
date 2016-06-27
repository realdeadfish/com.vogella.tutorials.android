// configure the spinner in code
Spinner spinner = (Spinner) findViewById(R.id.spinner);
String[] values = getResources().getStringArray(R.array.operating_systems);
ArrayAdapter<String> adapter = 
	new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values);
spinner.setAdapter(adapter);