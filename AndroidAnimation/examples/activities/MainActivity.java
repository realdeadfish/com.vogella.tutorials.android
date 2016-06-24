package com.vogella.android.activityanimationwithsharedviews;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView sharedImage = (ImageView) findViewById(R.id.sharedimage);
        sharedImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //This is where the magic happens. 
            	// makeSceneTransitionAnimation takes a context, view,
            	// a name for the target view.
                ActivityOptions options = 
                		ActivityOptions.
                		makeSceneTransitionAnimation(MainActivity.this, sharedImage, "sharedImage");
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent, options.toBundle());
            }
        });

    }

}
