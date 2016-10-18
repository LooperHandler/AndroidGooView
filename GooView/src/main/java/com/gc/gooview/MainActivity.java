package com.gc.gooview;

import com.gc.gooview.GooView.OnReleaseListener;
import com.gc.gooview.util.ToastUtil;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        GooView gooView = new GooView(this);
        gooView.setOnReleaseListener(new OnReleaseListener() {
            @Override
            public void onReset(boolean isOutOfRange) {
                ToastUtil.showToast(getApplicationContext(), "返回原地.." + isOutOfRange);
            }

            @Override
            public void onDisappear() {
                ToastUtil.showToast(getApplicationContext(), "消失了..");
            }
        });
        setContentView(gooView);
    }

}
