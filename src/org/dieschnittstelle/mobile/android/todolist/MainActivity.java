package org.dieschnittstelle.mobile.android.todolist;

import org.dieschnittstelle.mobile.android.todolist.model.TodolistRESTAccessorTest;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// just call the test method on the TodolistRESTAccessorTest class -
		// this does not have any effect on the user interface, but will write
		// log messages viewable via the LogCat view
		TodolistRESTAccessorTest.callWebapp();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
