package com.example.mackansari.maqbool2017summer.fragment;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.mackansari.maqbool2017summer.ActivityA;
import com.example.mackansari.maqbool2017summer.AdcancedViewPagerActivity;
import com.example.mackansari.maqbool2017summer.AdvanceListVIewActivity;
import com.example.mackansari.maqbool2017summer.NinePatchActivity;
import com.example.mackansari.maqbool2017summer.NotificationActivity;
import com.example.mackansari.maqbool2017summer.R;
import com.example.mackansari.maqbool2017summer.ResultActivity;
import com.example.mackansari.maqbool2017summer.ScaleTypeActivity;
import com.example.mackansari.maqbool2017summer.adapter.ListNormalAdapter;
import com.example.mackansari.maqbool2017summer.ViewPagerActivity;
import com.example.mackansari.maqbool2017summer.audio.BaseBean;

import java.util.ArrayList;


public class DemoFragment extends Fragment {

    private final ArrayList<String> contentList;
    private final Context context;
    private ListView listView;


    public DemoFragment() {
        context = getContext();
        contentList = new ArrayList<String>();
        contentList.add("ViewPager");
        contentList.add("imageScaleType");
        contentList.add("9Patch");
        contentList.add("Notification");
        contentList.add("AdvanceListView");
        contentList.add("AdvancedViewPager");
        contentList.add("LaunchMode");
        contentList.add("ActivityResult");
        contentList.add("F");
        contentList.add("G");
        contentList.add("H");
        contentList.add("I");

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
        ListNormalAdapter adapter = new ListNormalAdapter(this.getContext(), contentList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent intent = new Intent(getActivity(), ViewPagerActivity.class);
                        startActivity(intent);
                        break;
                    case 2:
                        Intent intent2 = new Intent(getActivity(), NinePatchActivity.class);
                        startActivity(intent2);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getActivity(), ScaleTypeActivity.class);
                        startActivity(intent1);
                        break;
                    case 3:
                        Intent intent3 = new Intent(getActivity(), NotificationActivity.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(getActivity(), AdvanceListVIewActivity.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(getActivity(), AdcancedViewPagerActivity.class);
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(getActivity(), ActivityA.class);
//                        intent6.putExtra("StringINfo","FromDemoFragment");
//                        intent6.putExtra("IntegerInfo",10);Bundle bundle = new Bundle();
//                        BaseBean bean = new BaseBean();
//                        bean.setName("bean");
//                        bundle.putString("StringBundle","FromBundleDemo");
//                        bundle.putInt("IntegerBundle",101);
//                        bundle.putSerializable("Object", bean);
//                        intent6.putExtra("Bundle",bundle);
                        startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7 = new Intent(getActivity(), ResultActivity.class);
                        startActivityForResult(intent7,400);

                    default:

                }
            }
        });
        return view;
    }

}
