
// StartAction
myView.animate().translationX(100).withStartAction(new Runnable(){
	public void run(){
		viewer.setTranslationX(100-myView.getWidth());
		// do something
	}
});

// EndAction
myView.animate().alpha(0).withStartAction(new Runnable(){
	public void run(){
		// rRemove the view from the parent layout
		parent.removeView(myView);
	}
});



