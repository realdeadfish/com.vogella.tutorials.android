# Build the Drawing Cache
view.buildDrawingCache();

# Create Bitmap
Bitmap cache = view.getDrawingCache();

# Save Bitmap
saveBitmap(cache);
view.destroyDrawingCache();