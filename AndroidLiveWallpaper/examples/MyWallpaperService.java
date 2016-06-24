
package de.vogella.android.wallpaper;

import java.util.ArrayList;
import java.util.List;

import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.service.wallpaper.WallpaperService;
import android.view.MotionEvent;
import android.view.SurfaceHolder;

public class MyWallpaperService extends WallpaperService {

	@Override
	public Engine onCreateEngine() {
		return new MyWallpaperEngine();
	}

	private class MyWallpaperEngine extends Engine {
		private final Handler handler = new Handler();
		private final Runnable drawRunner = new Runnable() {
			@Override
			public void run() {
				draw();
			}

		};
		private List<MyPoint> circles;
		private Paint paint = new Paint();
		private int width;
		int height;
		private boolean visible = true;
		private int maxNumber;
		private boolean touchEnabled;

		public MyWallpaperEngine() {
			SharedPreferences prefs = PreferenceManager
					.getDefaultSharedPreferences(MyWallpaperService.this);
			maxNumber = Integer
					.valueOf(prefs.getString("numberOfCircles", "4"));
			touchEnabled = prefs.getBoolean("touch", false);
			circles = new ArrayList<MyPoint>();
			paint.setAntiAlias(true);
			paint.setColor(Color.WHITE);
			paint.setStyle(Paint.Style.STROKE);
			paint.setStrokeJoin(Paint.Join.ROUND);
			paint.setStrokeWidth(10f);
			handler.post(drawRunner);
		}

		@Override
		public void onVisibilityChanged(boolean visible) {
			this.visible = visible;
			if (visible) {
				handler.post(drawRunner);
			} else {
				handler.removeCallbacks(drawRunner);
			}
		}

		

}
