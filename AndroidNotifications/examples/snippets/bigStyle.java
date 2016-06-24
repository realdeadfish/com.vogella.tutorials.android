String longText = "...";

Notification noti = new Notification.Builder(this).
.....
.setStyle(new Notification.BigTextStyle().bigText(longText))