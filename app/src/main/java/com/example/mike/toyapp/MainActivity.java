package com.example.mike.toyapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;



public class MainActivity extends ActionBarActivity {

    public static final String TAG="give message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      
        //input widget
        EditText username = new EditText(this);
        //setId's
        //details for the widgets
        RelativeLayout.LayoutParams buttonDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
                );
        RelativeLayout.LayoutParams inputDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        //rules for positioning widgets
        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);

        inputDetails.addRule(RelativeLayout.ABOVE,redButton.getId());
        inputDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        inputDetails.setMargins(0,0,0,50);

        //density independent pixels(device pixels)
        Resources r = getResources();//get info about app
        int px = (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,200,r.getDisplayMetrics());//convert dip to px


        username.setWidth(px);
        //add widgets to the layout
        mylayout.addView(redButton,buttonDetails);
        mylayout.addView(username,inputDetails);
        //add the layout to the main activity
        setContentView(mylayout);

        Log.i(TAG, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onCreate");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
