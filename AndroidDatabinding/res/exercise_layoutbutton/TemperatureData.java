package com.vogella.android.databinding;


import android.databinding.ObservableField;

import java.util.Observable;

public class TemperatureData {
    private String celsius;

    public String getFahrenheit() {
        return fahrenheit;
    }
    public TemperatureData(String celsius) {
        this.celsius = celsius;
    }
    public void setFahrenheit(String fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    private String fahrenheit;

    public String getCelsius() {
        return celsius;
    }

    public void setCelsius(String celsius) {
        this.celsius = celsius;
    }


}
