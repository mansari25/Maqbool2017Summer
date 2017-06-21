package com.example.mackansari.maqbool2017summer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import butterknife.ButterKnife;

public class Quiz_1_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_1_);
        ButterKnife.bind(this);
    }

    public void Submit(View v) {
        Toast.makeText(Quiz_1_Activity.this, "You clicked Submit", Toast.LENGTH_SHORT).show();
    }

}
