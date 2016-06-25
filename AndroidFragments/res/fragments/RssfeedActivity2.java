package com.example.android.rssreader;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;

public class RssfeedActivity extends Activity implements
        MyListFragment.OnItemSelectedListener {

	   @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_main);
	        if (findViewById(R.id.fragment_container) == null) {
	            // all good, we use the fragments defined in the layout
	            return;
	        }
	        // if savedInstanceState is null we need to load at least one fragment
	        if (savedInstanceState != null) {
	            // cleanup any existing fragments in case we are in detailed mode
	            getFragmentManager().executePendingTransactions();
	            Fragment fragmentById = getFragmentManager().
	            		findFragmentById(R.id.fragment_container);
	            if (fragmentById!=null) {
	                getFragmentManager().beginTransaction()
	                        .remove(fragmentById).commit();
	            }
	        }
	        MyListFragment listFragment = new MyListFragment();
	        FrameLayout viewById = (FrameLayout) findViewById(R.id.fragment_container);
	        getFragmentManager().beginTransaction()
	                .replace(R.id.fragment_container, listFragment).commit();
	    }

    @Override
    public void onRssItemSelected(String link) {
        if (getResources().getBoolean(R.bool.twoPaneMode)) {
            DetailFragment fragment = (DetailFragment) getFragmentManager()
                    .findFragmentById(R.id.detailFragment);
            fragment.setText(link);
        } else {
            // replace the fragment
            // Create fragment and give it an argument for the selected article
            DetailFragment newFragment = new DetailFragment();
            Bundle args = new Bundle();
            args.putString(DetailFragment.EXTRA_URL, link);
            newFragment.setArguments(args);
            FragmentTransaction transaction = getFragmentManager().beginTransaction();

            // Replace whatever is in the fragment_container view with this fragment,
            // and add the transaction to the back stack so the user can navigate back

            transaction.replace(R.id.fragment_container, newFragment);
            transaction.addToBackStack(null);

            // Commit the transaction
            transaction.commit();

        }
    }


}
