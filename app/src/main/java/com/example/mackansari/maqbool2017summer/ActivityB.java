package com.example.mackansari.maqbool2017summer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ActivityB extends BaseActivity {

    @OnClick(R.id.activity_b_a)
    public void toA(View v) {goToActivity(ActivityA.class);}

    @OnClick(R.id.activity_b_b)
    public void toB(View v) {goToActivity(ActivityB.class);}

    @OnClick(R.id.activity_b_c)
    public void toC(View v) {goToActivity(ActivityC.class);}

    @OnClick(R.id.activity_b_d)
    public void toD(View v) {goToActivity(ActivityD.class);}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        ButterKnife.bind(this);
        shortToast("OnCreate");
    }
    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        shortToast("onNewIntent");
    }
}
