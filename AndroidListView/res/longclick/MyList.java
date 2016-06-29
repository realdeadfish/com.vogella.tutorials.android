package de.vogella.android.listactivity;

import android.widget.AdapterView.OnItemLongClickListener;


public class MyList extends Activity {

	/** Called when the activity is first created. */
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		// configure your list view as before
		// ListView is assigned to local variable list...
		
		list.setOnItemLongClickListener(new OnItemLongClickListener() {
			@Override
			public boolean onItemLongClick(AdapterView<?> parent, View view,
					int position, long id) {
				Toast.makeText(MyList.this,
						"Item in position " + position + " clicked",
						Toast.LENGTH_LONG).show();
				// Return true to consume the click event. In this case the
				// onListItemClick listener is not called anymore.
				return true;
			}
		});
	}
}