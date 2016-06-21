
DetailFragment fragment = (DetailFragment) getFragmentManager().
	findFragmentById(R.id.detail_frag);
if (fragment==null || ! fragment.isInLayout()) {
	// start new Activity
	}
else {
	fragment.update(...);
}
