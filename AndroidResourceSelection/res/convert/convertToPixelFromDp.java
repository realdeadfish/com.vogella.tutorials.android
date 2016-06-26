public int convertToPixelFromDp(int dpInput) {
	// get the screen's density scale
	final float scale = getResources().getDisplayMetrics().density;
	// convert the dps to pixels, based on density scale
	return (int) (dpInput * scale + 0.5f);
}