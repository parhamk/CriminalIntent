package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by parham on 1/21/2017 AD.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
