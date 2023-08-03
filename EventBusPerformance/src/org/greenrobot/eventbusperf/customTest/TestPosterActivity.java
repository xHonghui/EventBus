package org.greenrobot.eventbusperf.customTest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbusperf.R;
import org.greenrobot.eventbusperf.customTest.event.CustomEvent1;
import org.greenrobot.eventbusperf.customTest.event.CustomEvent2;
import org.greenrobot.eventbusperf.customTest.event.CustomEvent3;
import org.greenrobot.eventbusperf.customTest.event.CustomEvent4;

/**
 * @author：xuhonghui
 * @date：2023/7/17
 */
public class TestPosterActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_poster);
    }

    public void postEvent1(View view) {
        EventBus.getDefault().post(new CustomEvent1());
    }


    public void postEvent2(View view) {
        EventBus.getDefault().post(new CustomEvent2());
    }


    public void postEvent3(View view) {
        EventBus.getDefault().post(new CustomEvent3());
    }


    public void postEvent4(View view) {
        EventBus.getDefault().post(new CustomEvent4());
    }
}
