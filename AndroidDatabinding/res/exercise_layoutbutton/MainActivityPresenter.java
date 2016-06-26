package com.vogella.android.databinding;

import android.util.Log;
import android.view.View;
import android.widget.Toast;


public class MainActivityPresenter {
    private MainActivityContract.View view;

    public MainActivityPresenter(MainActivityContract.View view) {

        this.view = view;
    }
    public void onShowData(TemperatureData temperatureData) {
        view.showData(temperatureData);
    }
}
