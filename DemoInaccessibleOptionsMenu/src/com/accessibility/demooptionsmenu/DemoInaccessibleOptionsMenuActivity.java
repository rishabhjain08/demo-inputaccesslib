package com.accessibility.demooptionsmenu;

import ca.idi.tecla.sdk.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class DemoInaccessibleOptionsMenuActivity extends Activity {
    /** Called when the activity is first created. */
	private int resumeCount = 0;
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
    	super.onResume();
    }
    
    public boolean onOptionsItemSelected(MenuItem menu_item){
    	int item_id = menu_item.getItemId();
    	//Do something with the item_id
    	return false;//or return true depending upon your requirement
    }
    
}