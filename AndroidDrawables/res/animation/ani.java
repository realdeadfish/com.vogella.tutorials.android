ImageView img = (ImageView)findViewById(R.id.yourid);
img.setBackgroundResource(R.drawable.your_animation_file);

 // Get the AnimationDrawable object.
 AnimationDrawable frameAnimation = (AnimationDrawable) img.getBackground();

 // Start the animation (looped playback by default).
 frameAnimation.start();