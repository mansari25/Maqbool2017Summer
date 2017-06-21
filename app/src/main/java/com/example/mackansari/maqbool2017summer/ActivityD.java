package com.example.mackansari.maqbool2017summer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.BaseAdapter;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ActivityD extends BaseActivity {

    @OnClick(R.id.activity_d_a)
    public void toA(View v) {goToActivity(ActivityA.class);}

    @OnClick(R.id.activity_d_a)
    public void toB(View v) {goToActivity(ActivityB.class);}

    @OnClick(R.id.activity_d_a)
    public void toC(View v) {goToActivity(ActivityC.class);}

    @OnClick(R.id.activity_d_a)
    public void toD(View v) {goToActivity(ActivityD.class);}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d);
        ButterKnife.bind(this);
        shortToast("onCreate");
    }
    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        shortToast("onNewIntent");
    }
}
