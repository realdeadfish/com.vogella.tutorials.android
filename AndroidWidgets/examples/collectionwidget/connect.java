Intent intent = new Intent(context, YourRemoteViewsService.class);
intent.putExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, appWidgetId);
views.setRemoteAdapter(
	apppWidgetId,
	R.id.widget_your_id_to_collectionview,
	intent)
