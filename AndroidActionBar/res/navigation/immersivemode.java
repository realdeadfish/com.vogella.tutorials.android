// This method hides the system bars and resize the content
	private void hideSystemUI() {
		getWindow().getDecorView().setSystemUiVisibility(
					View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
						| View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // hide nav bar
						| View.SYSTEM_UI_FLAG_FULLSCREEN // hide status bar
						// remove the following flag for version < API 19
						| View.SYSTEM_UI_FLAG_IMMERSIVE
						); 
	}
