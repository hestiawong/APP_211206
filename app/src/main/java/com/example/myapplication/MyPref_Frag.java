package com.example.myapplication;

import android.os.Bundle;
import android.preference.PreferenceFragment;

public class MyPref_Frag extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }
}

