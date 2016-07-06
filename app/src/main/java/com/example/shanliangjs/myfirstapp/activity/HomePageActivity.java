package com.example.shanliangjs.myfirstapp.activity;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.example.shanliangjs.myfirstapp.fragment.HomePageFragment;
import com.example.shanliangjs.myfirstapp.R;

public class HomePageActivity extends Activity {
    private FrameLayout flMainFragmentContainer;
    private HomePageFragment hpFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        initView();
        initHomePage();

    }

    private void initView() {
        flMainFragmentContainer = (FrameLayout) findViewById(R.id.fl_home_page_fg_container);
    }

    private void initHomePage() {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        hpFragment = new HomePageFragment();
        transaction.replace(R.id.fl_home_page_fg_container,hpFragment);
        transaction.commit();
    }
}
