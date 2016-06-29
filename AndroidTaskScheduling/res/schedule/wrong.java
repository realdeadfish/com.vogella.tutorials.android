
public void onCreate() {
		super.onCreate();
		pollForUpdates();
	}

// WRONG, don't do this
private void pollForUpdates() {
	timer.scheduleAtFixedRate(new TimerTask() {
		@Override
		public void run() {
			if (list.size() >= 6) {
				list.remove(0);
			}
			list.add(fixedList[index++]);
			if (index >= fixedList.length) {
				index = 0;
			}
		}
	}, 0, UPDATE_INTERVAL);
	Log.i(getClass().getSimpleName(), "Timer started.");
}