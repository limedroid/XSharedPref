package cn.droidlover.xsharedpref.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import cn.droidlover.xsharedpref.XSharedPref;

public class MainActivity extends Activity {

    Button bt_loadUi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_loadUi = (Button) findViewById(R.id.bt_loadUi);
        bt_loadUi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });

        XSharedPref.putString(this, "user_name", "https://github.com/limedroid");

    }
}
