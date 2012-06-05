package com.accessibility.demooptionsmenu;

import ca.idi.tecla.lib.InputAccess;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class DemoAccessibleOptionsMenuActivity extends Activity {
    /** Called when the activity is first created. */
	private int resumeCount = 0;
	//Create an instance of InputAccess
	private InputAccess inputAccess = new InputAccess(this);
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
    	menu.add(0, 0, 0, "Item 1").setIcon(android.R.drawable.ic_menu_upload);
    	menu.add(0, 0, 0, "Item 2");
    	menu.add(0, 0, 0, "Item 3").setIcon(android.R.drawable.alert_dark_frame);
    	menu.add(0, 0, 0, "Item 4").setIcon(android.R.drawable.arrow_up_float);
    	menu.add(0, 0, 0, "Item 5").setIcon(android.R.drawable.ic_popup_sync);
    	return true;
    }
    
    @Override
    public void onResume(){
    	resumeCount++;
    	//Call this method to make this activity's options menu accessible
    	inputAccess.onResume();
    	super.onResume();
    }
    
    @Override
    public void onPause(){
    	//Call this method to make this activity's options menu accessible
    	inputAccess.onPause();
    	super.onPause();
    }
    
	//Define this function to make this activity's options menu accessible if it is not already defined
    public boolean onPrepareOptionsMenu(Menu menu){
    	//Call this method to make this activity's options menu accessible
    	return inputAccess.onPrepareOptionsMenu(menu);
    }
    
    public boolean onOptionsItemSelected(MenuItem menu_item){
    	int item_id = menu_item.getItemId();
    	//Do something with the item_id
    	return false;//or return true depending upon your requirement
    }
    
}