package com.tutorial.fahmi.androidlifecycle;

/**
 * Created by Fahmi on 07-Feb-15.
 */
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SecondActivity extends TracerActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}
