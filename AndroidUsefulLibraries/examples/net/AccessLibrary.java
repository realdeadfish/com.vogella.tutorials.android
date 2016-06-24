
// Update the method updateDetail() {
// more code....

// reading the RSS items
List<RssItem> list = RssFeedProvider
	.parse("http://www.vogella.com/article.rss");
String text = String.valueOf(list.size());
// TODO send text to the Detail fragment