	public void updateDetail() {
		DetailFragment fragment = (DetailFragment) getFragmentManager()
				.findFragmentById(R.id.detailFragment);

		// Accessing the library project
		List<RssItem> list = RssFeedProvider
				.parse("http://www.vogella.com/article.rss");
		String numberOfItems = String.valueOf(list.size());
		if (fragment != null && fragment.isInLayout()) {
			fragment.setText(numberOfItems);
		} else {
			Intent intent = new Intent(getActivity().getApplicationContext(),
					DetailActivity.class);
			intent.putExtra("value", numberOfItems);
			startActivity(intent);

		}
	}