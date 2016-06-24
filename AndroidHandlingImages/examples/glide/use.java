// simple usage
Glide.with(myListFragment)
	.load("url").into(imageView)
	
// with placeholder
	Glide.with(myListFragment)
	.load("url").placeholder(R.drawable.loading_spinner).into(imageView)