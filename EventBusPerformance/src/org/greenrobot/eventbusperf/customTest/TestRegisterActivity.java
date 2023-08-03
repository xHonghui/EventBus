package org.greenrobot.eventbusperf.customTest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;


import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbusperf.MyEventBusIndex;
import org.greenrobot.eventbusperf.R;
import org.greenrobot.eventbusperf.customTest.event.CustomEvent1;
import org.greenrobot.eventbusperf.customTest.event.CustomEvent2;
import org.greenrobot.eventbusperf.customTest.event.CustomEvent3;
import org.greenrobot.eventbusperf.customTest.event.CustomEvent4;

/**
 * @author：xuhonghui
 * @date：2023/7/17
 */
public class TestRegisterActivity extends Activity {

    private static final String TAG = "TestRegisterActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_test);
    }

    public void startTestPosterActivity(View view) {
        //EventBus 初始化时，设置 apt 生成的 MyEventBusIndex 类，然后初始化 DefaultEventBus，
        // 后续通过 EventBus.getDefault() 即可获得该 EventBus 对象
        EventBus.builder().addIndex(new MyEventBusIndex()).installDefaultEventBus();
        EventBus.getDefault().register(this);
        startActivity(new Intent(this, TestPosterActivity.class));
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onCustomEvent1(CustomEvent1 event1) {
        Log.i(TAG, "onCustomEvent1: ");
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onCustomEvent2(CustomEvent2 event2) {
        Log.i(TAG, "onCustomEvent2: ");
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onCustomEvent3(CustomEvent3 event3) {
        Log.i(TAG, "onCustomEvent3: ");
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onCustomEvent4(CustomEvent4 event4) {
        Log.i(TAG, "onCustomEvent4: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }
}
