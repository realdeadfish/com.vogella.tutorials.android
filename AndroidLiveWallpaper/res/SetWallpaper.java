
// Button to set the Wallpaper
public void onClick(View view) {
	Intent intent = new Intent(
			WallpaperManager.ACTION_CHANGE_LIVE_WALLPAPER);
	intent.putExtra(WallpaperManager.EXTRA_LIVE_WALLPAPER_COMPONENT,
		new ComponentName(this, MyWallpaperService.class));
	startActivity(intent);
}