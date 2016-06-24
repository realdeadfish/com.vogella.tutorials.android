// ACTION_INSERT does not work on all phones
// use  Intent.ACTION_EDIT in this case
Intent intent = new Intent(Intent.ACTION_INSERT);
intent.setData(CalendarContract.Events.CONTENT_URI);
startActivity(intent);