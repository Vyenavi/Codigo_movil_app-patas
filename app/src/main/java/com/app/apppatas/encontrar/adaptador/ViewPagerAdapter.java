package com.app.apppatas.encontrar.adaptador;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    private final List<Fragment> listFragment = new ArrayList<>();
    private final List<String> listTitleFragment = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
        return listFragment.get(position);
    }

    @Override
    public int getCount() {
        return listFragment.size();
    }

    //agregar este metodo

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return listTitleFragment.get(position);
    }

    public void addFragment(Fragment fragment, String s){
        listFragment.add(fragment);
        listTitleFragment.add(s);
    }
}
