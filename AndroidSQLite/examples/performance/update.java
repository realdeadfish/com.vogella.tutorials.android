db.beginTransaction();
try {
   for (int i= 0; i< values.lenght; i++){
	   // TODO prepare ContentValues object values
	   db.insert(your_table, null, values);
	   // In case you do larger updates
	   yieldIfContededSafely()
     }
     db.setTransactionSuccessful();	   
    } finally {
      db.endTransaction();
}
