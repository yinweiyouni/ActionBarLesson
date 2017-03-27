package com.ye.actionbarlesson;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;

/**
 * @author: YE                              --------->作者
 * @description: --------->描述
 * @projectName: ActionBarLesson    ---------> 项目名称
 * @date: 2017-03-22    --------->日期
 * @time: 23:36               --------->时间
 */
public class second extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.app_lian);
        setContentView(R.layout.activity_second);
        ActionBar actionBar=getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                /*Intent upintent=NavUtils.getParentActivity(this);
                if(NavUtils.shouldUpRecreateTask(this,upintent)){

                }*/
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
