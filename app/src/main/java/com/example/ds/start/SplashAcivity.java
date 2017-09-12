package com.example.ds.start;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

/**
 * MainActivity为主界面的Activity
 * 不要调用setContentView这个方法不然会启动白屏
 * Created by ds on 2017/9/5.
 */

public class SplashAcivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
