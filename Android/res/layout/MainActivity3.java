// search in the layout of the activity
LinearLayout linearLayout = (LinearLayout) findViewById(R.id.mylayout);

// afterwards search in linearLayout for another view
TextView textView = (TextView) linearLayout.findViewById(R.id.mytext);

// note, you could have directly searched for R.id.mytext, the above coding
// is just for demonstration purposes