package com.example.viewpager2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class fragment_one extends Fragment {
    //通过内部静态方法，创建一个Fragment实例，用于添加到外部的Fragment集合当中（集合会被传入构建器——以FragmentStatePager)
    public static fragment_one newsInstance(){
        fragment_one frag1=new fragment_one();
        return frag1;
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= LayoutInflater.from(getContext()).inflate(R.layout.fragment_one,null);
        return v;
    }

}
