
Intent intent = new Intent(Intent.ACTION_INSERT);
intent.setType("vnd.android.cursor.item/event");
intent.putExtra(Events.TITLE, "Learn Android");
intent.putExtra(Events.EVENT_LOCATION, "Home suit home");
intent.putExtra(Events.DESCRIPTION, "Download Examples");

// Setting dates
GregorianCalendar calDate = new GregorianCalendar(2012, 10, 02);
intent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
	calDate.getTimeInMillis());
intent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
	calDate.getTimeInMillis());

// make it a full day event
intent.putExtra(CalendarContract.EXTRA_EVENT_ALL_DAY, true);

// make it a recurring Event
intent.putExtra(Events.RRULE, "FREQ=WEEKLY;COUNT=11;WKST=SU;BYDAY=TU,TH");

// Making it private and shown as busy
intent.putExtra(Events.ACCESS_LEVEL, Events.ACCESS_PRIVATE);
intent.putExtra(Events.AVAILABILITY, Events.AVAILABILITY_BUSY);