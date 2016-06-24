
SharedPreferences prefs = 
    PreferenceManager.getDefaultSharedPreferences(this);

// Instance field for listener
listener = new SharedPreferences.OnSharedPreferenceChangeListener() {
  public void onSharedPreferenceChanged(SharedPreferences prefs, String key) {
    // Your Implementation
  }
};

prefs.registerOnSharedPreferenceChangeListener(listener);