package com.example.mackansari.maqbool2017summer.fragment;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mackansari.maqbool2017summer.Quiz_1_Activity;
import com.example.mackansari.maqbool2017summer.R;


public class WorkFragment extends Fragment {


    private final Context context;

    public WorkFragment() {
        context = getContext();
    }




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_work, container, false);




    }

}
