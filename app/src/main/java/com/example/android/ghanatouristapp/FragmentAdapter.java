package com.example.android.ghanatouristapp;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {
    private Context context;


    public FragmentAdapter(Context context1, FragmentManager fm) {
        super(fm);
        context = context1;
    }

    //    Find which tab has been selected by the user
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HotelsFragment();
        } else if (position == 1) {
            return new RestaurantsFragment();
        } else if (position == 2) {
            return new ShoppingFragment();
        } else {
            return new SightseeFragment();
        }
    }

    //      Total number of fragments expected
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {

//      Tab titles generated based on position of item
        switch (position) {
            case 0:
                return context.getString(R.string.hotels_tab);
            case 1:
                return context.getString(R.string.restaurants_tab);
            case 2:
                return context.getString(R.string.shopping_tab);
            case 3:
                return context.getString(R.string.sightseeing_tab);
            default:
                return null;
        }
    }
}
