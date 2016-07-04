
// add new file to your media library
ContentValues values = new ContentValues(4);
long current = System.currentTimeMillis();
values.put(MediaStore.Audio.Media.TITLE, "audio" + audiofile.getName());
values.put(MediaStore.Audio.Media.DATE_ADDED, (int) (current / 1000));
values.put(MediaStore.Audio.Media.MIME_TYPE, "audio/3gpp");
values.put(MediaStore.Audio.Media.DATA, audiofile.getAbsolutePath());
ContentResolver contentResolver = getContentResolver();

Uri base = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
Uri newUri = contentResolver.insert(base, values);

// Notifiy the media application on the device
sendBroadcast(new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE, newUri));