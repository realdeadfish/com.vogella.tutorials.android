
public static boolean isIntentAvailable(Context ctx, Intent intent) {
	final PackageManager mgr = ctx.getPackageManager();
	List<ResolveInfo> list =
		mgr.queryIntentActivities(intent, 
			PackageManager.MATCH_DEFAULT_ONLY);
	return list.size() > 0;
}
