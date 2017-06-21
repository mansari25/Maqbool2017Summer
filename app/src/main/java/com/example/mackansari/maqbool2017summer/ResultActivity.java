package com.example.mackansari.maqbool2017summer;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ResultActivity extends BaseActivity {

    private final int ACTIVITY1 = 123;
    private final int ACTIVITY2 = 321;


    @OnClick(R.id.activity_result_bt1)
    public void toResult1(View view){
        Intent intent = new Intent(this,ResultActivity1.class);
        startActivityForResult(intent,ACTIVITY1);
    }

    @OnClick(R.id.activity_result_bt2)
    public void toResult2(View view){
        Intent intent = new Intent(this,ResultActivity2.class);
        startActivityForResult(intent,ACTIVITY2);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        ButterKnife.bind(this);


    }

    @Override
    protected void  onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(resultCode,resultCode, data);
        String s = data.getStringExtra("Data");
        switch (requestCode){
            case ACTIVITY1:
                shortToast(s + "fromResultActivity1");
                break;
            case ACTIVITY2:
                shortToast(s + "fromResultActivity2");
                break;
            default:
        }
    }
}
