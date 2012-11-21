package com.example.plyphnegap;

import org.apache.cordova.DroidGap;

import android.os.Bundle;
import android.view.Menu;

import com.utils.myapp.MyClass;

public class MainActivity extends DroidGap  {
	private MyClass mc;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.init();
     //   setContentView(R.layout.activity_main);
        mc = new MyClass(this, appView);
        appView.addJavascriptInterface(mc, "MyCls");
        super.loadUrl("file:///android_asset/www/index.html");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
