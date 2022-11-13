package com.example.viewpager2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class MyFragmentStateAdapter extends FragmentStateAdapter {

    private ArrayList<Fragment> fragments;

    public MyFragmentStateAdapter(@NonNull FragmentActivity fragmentActivity,ArrayList<Fragment> fragments) {
        super(fragmentActivity);
        this.fragments=fragments;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return fragments.get(position);
    }

    @Override
    public int getItemCount() {
        return fragments.size();
    }
}
