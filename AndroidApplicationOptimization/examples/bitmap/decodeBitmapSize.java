// instruct BitmapFactory to only the bounds and type of the image
BitmapFactory.Options options = new BitmapFactory.Options();
options.inJustDecodeBounds = true;
BitmapFactory.decodeResource(getResources(), R.id.myimage, options);

// get width and height
int imageHeight = options.outHeight;
int imageWidth = options.outWidth;
// type of the image
String imageType = options.outMimeType;