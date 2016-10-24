package cn.droidlover.xsharedpref.demo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import cn.droidlover.xsharedpref.XSharedPref;

public class SecondActivity extends Activity {

    TextView tv_val;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv_val = (TextView) findViewById(R.id.tv_val);

        String spValue = XSharedPref.getString(this, "user_name", null);
        tv_val.setText(spValue);
    }
}
