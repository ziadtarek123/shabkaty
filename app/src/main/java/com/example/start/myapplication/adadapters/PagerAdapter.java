package com.example.start.myapplication.adadapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumofTaps;
    public PagerAdapter(FragmentManager fm, int NumOfTaps) {
        super(fm);
        this.mNumofTaps=NumOfTaps;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
           case 0:
               VodafoneFragment tab1=new VodafoneFragment();
               return tab1;
           case 1:
               EtisalateFragment tab2=new EtisalateFragment();
               return tab2;
           case 2:
               OrangeFragment tab3=new OrangeFragment();
               return tab3;
           case 3:
               weFragment tab4=new weFragment();
               return tab4;
          default:
          return null;
        }

    }

    @Override
    public int getCount() {
        return mNumofTaps;
    }
}
