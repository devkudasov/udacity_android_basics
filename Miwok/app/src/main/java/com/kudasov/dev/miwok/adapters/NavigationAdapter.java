package com.kudasov.dev.miwok.adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.kudasov.dev.miwok.fragments.ColorsFragment;
import com.kudasov.dev.miwok.fragments.FamilyFragment;
import com.kudasov.dev.miwok.fragments.NumbersFragment;
import com.kudasov.dev.miwok.fragments.PhrasesFragment;

public class NavigationAdapter extends FragmentPagerAdapter {
    public NavigationAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NumbersFragment();
        } else if (position == 1) {
            return new FamilyFragment();
        } else if (position == 2) {
            return new ColorsFragment();
        } else {
            return new PhrasesFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
