public void onClick(View view) {
	Intent intent = new Intent(this, SecondActivity.class);
	ActivityOptions options = ActivityOptions.makeScaleUpAnimation(view, 0,
			0, view.getWidth(), view.getHeight());
	startActivity(intent, options.toBundle());
}