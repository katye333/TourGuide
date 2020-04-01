package com.example.android.tourguide;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new SpringFragment();
        } else if (position == 1) {
            return new BeachFragment();
        } else if (position == 2) {
            return new PreserveFragment();
        } else {
            return new ThemeParkFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.springs);
        }
        else if (position == 1) {
            return mContext.getString(R.string.beaches);
        }
        else if (position == 2) {
            return mContext.getString(R.string.nature);
        }
        else {
            return mContext.getString(R.string.theme_parks);
        }
    }
}
