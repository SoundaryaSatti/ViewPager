package com.example.viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.viewpager.fragments.PageFragments;
import com.example.viewpager.fragments.PageFragments1;
import com.example.viewpager.fragments.PageFragments2;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ViewPager pager;
    private PagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Fragment> list= new ArrayList<>();
        list.add(new PageFragments());
        list.add(new PageFragments1());
        list.add(new PageFragments2());
        pager=findViewById(R.id.vpager);
        pagerAdapter=new viewPageAdapter(getSupportFragmentManager(),list);
        pager.setAdapter(pagerAdapter);
    }
}
