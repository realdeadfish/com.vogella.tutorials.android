static final LatLng HAMBURG = new LatLng(53.558, 9.927);
static final LatLng KIEL = new LatLng(53.551, 9.993);

private GoogleMap map;
... // Obtain the map from a MapFragment or MapView.

//Move the camera instantly to hamburg with a zoom of 15.
map.moveCamera(CameraUpdateFactory.newLatLngZoom(HAMBURG, 15));

// Zoom in, animating the camera.
map.animateCamera(CameraUpdateFactory.zoomTo(10), 2000, null);
