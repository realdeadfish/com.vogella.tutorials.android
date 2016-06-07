public void testSayHello() {
	// find a view with a specific test and check if it is displayed
	onView(withText("Button")).check(matches(isDisplayed()));
	// others checks are isEnabled() or isFocused()
	
	// combine them
	onView(withText("Button1")).check(matches(not(isEnabled())));
	
    // find a view with an ID and type some text into it
	onView(withId(R.id.name_field)).perform(typeText("New text"));
	// find a view and click on it
    onView(withId(R.id.greet_button)).perform(click());
  
    // check several conditions at once
    onView(allOf(withId(R.id.greet_button), not(withText("Placehodler")));
    
    // scroll a view
    onView(withId(R.id.listview)).performScroll();
    
    // scroll and click
    onView(withId(R.id.listview)).perform(scrollTo(), click());
}