package com.example.viewpager2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Integer> list;
    private ArrayList<Fragment> fragments;
    private ArrayList<String> titles;
    private TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager2 viewPager2 =findViewById(R.id.my_view_pager2);
        tabLayout=findViewById(R.id.talayout);
        init();
        //list=initList();
        //HorizontalVpAdapter horizontalVpAdapter=new HorizontalVpAdapter(list);
        //viewPager2.setAdapter(horizontalVpAdapter);
        MyFragmentStateAdapter myFragmentStateAdapter=new MyFragmentStateAdapter(this,fragments);
        viewPager2.setAdapter(myFragmentStateAdapter);
        //关联Tablayout
        new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                //将标题内容分别对应赋值
                tab.setText(titles.get(position));
            }
        }).attach();
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
            }
        });
    }

    public void init(){
        fragments=new ArrayList<>();
        titles=new ArrayList<>();
        fragments.add(fragment_one.newsInstance());
        fragments.add(fragment_two.newsInstance());
        titles.add("关注");
        titles.add("推荐");
    }
}