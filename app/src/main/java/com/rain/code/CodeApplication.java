package com.rain.code;

import android.app.Application;
import android.content.Context;

/**
 *
 */

public class CodeApplication extends Application {

  private static Application instance;

  @Override
  public void onCreate() {
    super.onCreate();
    instance = this;

  }


  public static Context getAppContext() {
    return instance;
  }
}
