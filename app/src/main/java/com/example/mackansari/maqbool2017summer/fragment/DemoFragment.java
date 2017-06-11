package com.example.mackansari.maqbool2017summer.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.mackansari.maqbool2017summer.R;

import java.util.ArrayList;


public class DemoFragment extends Fragment {

    private final ArrayList<String> contentList;
    private ListView listView;


    public DemoFragment() {
        contentList = new ArrayList<String>();
        contentList.add("ViewPager");
        contentList.add("imageScaleType");
        contentList.add("(9Patch");
        contentList.add("(9Patch");
        contentList.add("(9Patch");
        contentList.add("(9Patch");
        contentList.add("(9Patch");
        contentList.add("(9Patch");
        contentList.add("(9Patch");
        contentList.add("(9Patch");
        contentList.add("(9Patch");
        contentList.add("(9Patch");

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_demo,container,false);
        listView = (ListView)view.findViewById(R.id.fragment_demo_lv);
        return inflater.inflate(R.layout.fragment_demo, container, false);
    }

}
