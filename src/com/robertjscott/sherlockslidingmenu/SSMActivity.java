package com.robertjscott.sherlockslidingmenu;

import android.os.Bundle;
import android.util.Log;

import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.slidingmenu.lib.app.SlidingActivity;

public class SSMActivity extends SlidingActivity {
  
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_Sherlock);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        this.setSlidingActionBarEnabled(true);
        setContentView(R.layout.feed);
        setBehindContentView(R.layout.menu);
        getSlidingMenu().setBehindOffsetRes(R.dimen.actionbar_home_width);
        getSlidingMenu().setBehindScrollScale(0.25f);

    }
    
    public boolean onCreateOptionsMenu(Menu menu) {
      menu.add("Search")
          .setIcon(R.drawable.ic_action_search)
          .setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);

      return true;
    }
    
    public boolean onOptionsItemSelected(MenuItem item) {
      switch (item.getItemId()) {
      case android.R.id.home:
        Log.i("=========================","Home selected");
        toggle();
        return true;
      }
      return false;

    }

}
