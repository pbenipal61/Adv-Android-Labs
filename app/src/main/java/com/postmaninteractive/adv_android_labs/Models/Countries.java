package com.postmaninteractive.adv_android_labs.Models;

import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class Countries {

    private ArrayList<String> countries = new ArrayList();

    public ArrayList<String> getCountries() {
        return this.countries;
    }

    public void addCountry(String country){
        this.countries.add(country);
    }

    public void removeCountryByIndex(int index){
        countries.remove(index);
    }

    public void popCountries(){
        if(this.countries.size() > 0) {
            this.countries.remove(this.countries.size() - 1);
        }
    }
}
