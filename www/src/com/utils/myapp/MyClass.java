package com.utils.myapp;

import org.apache.cordova.DroidGap;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.webkit.WebView;

public class MyClass {
	private WebView mAppView;
	  private DroidGap mGap;

	  public MyClass(DroidGap gap, WebView view)
	  {
	    mAppView = view;
	    mGap = gap;
	  }

	  public String getTelephoneNumber(){
	    TelephonyManager tm = 
	      (TelephonyManager) mGap.getSystemService(Context.TELEPHONY_SERVICE);
	    String number = tm.getLine1Number();
	    return number;
	  }

}
