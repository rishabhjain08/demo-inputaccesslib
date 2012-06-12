package com.accessibility.demooptionsmenu;

import ca.idi.tecla.sdk.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class DemoInaccessibleOptionsMenuActivity extends Activity {
    /** Called when the activity is first created. */
	//some variable
	private int resumeCount = 0;
	
	private Spinner spinner;
	private static String[] listItems = {"Item1", "Item2", "Item3", "Item4","Item5"};

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        spinner = (Spinner)findViewById(R.id.Spinner01);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.select_dialog_item);
        for(int i=0;i<listItems.length;i++){
        	adapter.add(listItems[i]);
        }
        spinner.setAdapter(adapter);
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