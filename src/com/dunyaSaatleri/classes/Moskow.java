package com.dunyaSaatleri.classes;


import com.dunyaSaatleri.interfaces.Clock;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;


public class Moskow extends City implements Clock {
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

    private final String cityName;
    private final String cityCode;
    private final String gmt;

    public Moskow(String cityName, String cityCode, String gmt  ) {
        super(cityName, cityCode, gmt);
        this.cityName = cityName;
        this.cityCode = cityCode;
        this.gmt = gmt;
    }



    public void showTime(){

        ZoneId moskow = ZoneId.of("Europe/Moscow");
        LocalTime localTime=ZonedDateTime.now(moskow).toLocalTime();
        System.out.println(getCityName()+" "+getCityCode()+":"+localTime+" "+getGmt());

        /*Date time = new Date();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");

        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(getGmtFark()));

        System.out.println(getCityName() + " : " + simpleDateFormat.format(time));*/


    }

}
