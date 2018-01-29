package com.example.root.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by root on 1/21/18.
 */

public class fragmentAdapter extends FragmentPagerAdapter {

    private Context context;
    public fragmentAdapter(Context context,FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new EventFragment();
        } else if (position == 1) {
            return new RestaurantCafeFragment();
        } else if (position == 2) {
            return new HistoricalSiteFragment();
        } else {
            return new HotelFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {

        if (position == 0) {
            return context.getString(R.string.tabOptionOne);
        } else if (position == 1) {
            return context.getString(R.string.tabOptionTwo);
        } else if (position == 2) {
            return context.getString(R.string.tabOptionThree);
        } else {
            return context.getString(R.string.tabOptionFour);
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
