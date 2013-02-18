package com.timothyking.uptime;

import java.text.DecimalFormat;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.os.SystemClock;

public class Uptime extends Activity {
    /** Called when the activity is first created. */
	private transient TextView tv;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        tv = (TextView) findViewById(R.id.TextView01);
        
        float secs = SystemClock.elapsedRealtime()/1000;
        float hours = (secs/60)/60;
        float days = hours/24;
        
        DecimalFormat df = new DecimalFormat("#####.##");
        tv.setText(df.format(days) + " days\nOr\n" + df.format(hours) + " hours");
    }
}