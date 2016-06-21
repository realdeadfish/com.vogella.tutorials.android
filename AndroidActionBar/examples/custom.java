
@Override
public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.main);
	
	ActionBar actionBar = getActionBar();
	// add the custom view to the action bar
	actionBar.setCustomView(R.layout.actionbar_view);
	actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM
	 | ActionBar.DISPLAY_SHOW_HOME);
}