package com.kudasov.dev.tourguideapp.adapters;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.kudasov.dev.tourguideapp.R;

public class NavigationAdapter extends FragmentPagerAdapter {
    private final int PAGES_COUNT = 4;
    private final String[] mTabs = new String[PAGES_COUNT];
    private final Fragment[] mFragments = new Fragment[PAGES_COUNT];
    private Context mContext;

    public NavigationAdapter(FragmentManager fm, Context context) {
        super(fm);

        mContext = context;

        mTabs[0] = mContext.getString(R.string.food_title);
        mTabs[1] = mContext.getString(R.string.shop_title);
        mTabs[2] = mContext.getString(R.string.med_title);
        mTabs[3] = mContext.getString(R.string.gas_title);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments[position];
    }

    @Override
    public int getCount() {
        return PAGES_COUNT;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mTabs[position];
    }
}
