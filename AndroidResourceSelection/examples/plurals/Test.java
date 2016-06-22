// number is defined somewhere before this
// number =....
// get the Resources
Resources res = getResources();
// get the 
String quantityString = res.getQuantityString(R.plurals.tutorials,
    number, number);
// do something with it...