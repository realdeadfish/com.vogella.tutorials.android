package com.vogella.android.databinding;


import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableField;

import java.util.Observable;

public class TemperatureData extends BaseObservable{
    private String celsius;

    public TemperatureData(String celsius) {
        this.celsius = celsius;
    }

    private String fahrenheit;

    @Bindable
    public String getCelsius() {
        return celsius;
    }


    public void setCelsius(String celsius) {

        this.celsius = celsius;
        notifyPropertyChanged(BR.celsius);
    }


}
