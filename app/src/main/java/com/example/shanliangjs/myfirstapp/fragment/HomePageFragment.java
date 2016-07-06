package com.example.shanliangjs.myfirstapp.fragment;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.shanliangjs.myfirstapp.R;
import com.example.shanliangjs.myfirstapp.activity.IntentServiceActivity;

import java.util.zip.Inflater;

/**
 * Created by shanliangjs on 2016/6/29.
 */
public class HomePageFragment extends Fragment {

    private TextView tvGoService;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home_page,container,false);
        tvGoService = (TextView) view.findViewById(R.id.tv_go_service_test);
        init();
        return view;
    }

    public void init() {
        tvGoService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), IntentServiceActivity.class);
                startActivity(intent);
            }
        });
    }
}
