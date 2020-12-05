package com.dunyaSaatleri.classes;

import com.dunyaSaatleri.interfaces.Clock;

public abstract class City implements Clock,Comparable<City> {

    protected final String cityName;
    protected final String cityCode;
    protected final String gmt;

    public City(String cityName,String cityCode,String gmt) {
        this.cityName=cityName;
        this.cityCode =cityCode;
        this.gmt =gmt;
    }

    public String getCityName() {
        return cityName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public String getGmt() {
        return gmt;
    }


    @Override
    public void showTime() {


    }

    @Override
    public int compareTo(City o) {
        return this.getCityName().compareTo(o.getCityName());
    }


}



