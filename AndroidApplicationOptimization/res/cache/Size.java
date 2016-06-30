int memClass = ( ( ActivityManager) activity.getSystemService( Context.ACTIVITY_SERVICE ) ).getMemoryClass();
int cacheSize = 1024 * 1024 * memClass / 8;
LruCache cache = new LruCache<String, Bitmap>( cacheSize );
