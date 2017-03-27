package com.ye.actionbarlesson;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_activity_actions, menu);

        //MenuItem item = menu.getItem(R.id.action_search);
        /*ShareActionProvider actionprovider=(ShareActionProvider)item.getActionProvider();
        Intent intent=new Intent(Intent.ACTION_SEND);
        intent.setType("image*//*");
        actionprovider.setShareIntent(intent);*/
       // MenuItem menuitem = menu.getItem(R.id.action_search);
        /*View view = menuitem.getActionView();
        Button btn1 = (Button) view.findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "ok", Toast.LENGTH_LONG).show();
            }
        });*/
       /*// MenuItem item=menu.getItem(R.id.action_search);
       // SearchView searchView=(SearchView)item.getActionView();
        item.setOnActionExpandListener(new MenuItem.OnActionExpandListener() {
            @Override
            public boolean onMenuItemActionExpand(MenuItem item) {
                Toast.makeText(getApplicationContext(),"Expand",Toast.LENGTH_LONG).show();
                return true;
            }

            @Override
            public boolean onMenuItemActionCollapse(MenuItem item) {
                Toast.makeText(getApplicationContext(),"collapse",Toast.LENGTH_LONG).show();
                return true;
            }
        });*/
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_search:
                Toast.makeText(MainActivity.this,R.string.action_search,Toast.LENGTH_LONG).show();
                return  true;
            case R.id.action_settings:
                Toast.makeText(MainActivity.this, R.string.action_settings, Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
