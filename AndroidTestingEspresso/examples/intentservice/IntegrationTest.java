package com.vogella.android.espressointentservice;

import android.app.Instrumentation;
import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.notNullValue;

@RunWith(AndroidJUnit4.class)
public class IntegrationTest {

    @Rule
    public ActivityTestRule rule = new ActivityTestRule(MainActivity.class);
    IntentServiceIdlingResource idlingResource;

    @Before
    public void before() {
        Instrumentation instrumentation
                = InstrumentationRegistry.getInstrumentation();
        Context ctx = instrumentation.getTargetContext();
        idlingResource = new IntentServiceIdlingResource(ctx);
        Espresso.registerIdlingResources(idlingResource);

    }
    @After
    public void after() {
        Espresso.unregisterIdlingResources(idlingResource);

    }

    @Test
    public void runSequence() {
        // this triggers our intent service, as we registered
        // Espresso for it, Espresso wait for it to finish
        onView(withId(R.id.action_settings)).perform(click());
        onView(withText("Broadcast")).check(matches(notNullValue()));
    }
}
