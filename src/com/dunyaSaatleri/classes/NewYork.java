package com.dunyaSaatleri.classes;

import com.dunyaSaatleri.interfaces.Clock;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;


public class NewYork extends City implements Clock {


    private final String cityName;

    @Override
    public String getCityName() {
        return cityName;
    }

    @Override
    public String getCityCode() {
        return cityCode;
    }

    @Override
    public String getGmt() {
        return gmt;
    }

    private final String cityCode;
    private final String gmt;

    public NewYork(String cityName, String cityCode, String gmt  ) {
        super(cityName, cityCode, gmt);
        this.cityName = cityName;
        this.cityCode = cityCode;
        this.gmt = gmt;
    }


    @Override
    public void showTime() {

        ZoneId newYork = ZoneId.of("America/New_York");
        LocalTime localTime=ZonedDateTime.now(newYork).toLocalTime();
        System.out.println(getCityName()+" "+getCityCode()+":"+localTime+" "+getGmt());
        //System.out.println(getCityName()+": "+ZonedDateTime.now(newYork).toLocalDateTime()+getGmt());


    }
}
