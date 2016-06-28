public void updateListContent() {
   if (parseTask == null) {
   		parseTask = new ParseTask();
   		parseTask.setFragment(this);
   		SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(getActivity());
  	 	String url = settings.getString("url", "http://www.vogella.com/article.rss");
   		parseTask.execute(url);
   }
}
