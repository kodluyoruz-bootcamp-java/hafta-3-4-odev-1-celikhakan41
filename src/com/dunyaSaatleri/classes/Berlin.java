package com.dunyaSaatleri.classes;

import com.dunyaSaatleri.interfaces.Clock;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Berlin extends City implements Clock {



    private final String cityName;
    private final String cityCode;
    private final String gmt;



    public Berlin(String cityName, String cityCode, String gmt  ) {
        super(cityName, cityCode, gmt);
        this.cityName = cityName;
        this.cityCode = cityCode;
        this.gmt = gmt;
    }
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


    @Override
    public void showTime() {
        ZoneId berlin = ZoneId.of("Europe/Berlin");
        LocalTime localTime= ZonedDateTime.now(berlin).toLocalTime();
        System.out.println(getCityName()+" "+getCityCode()+":"+localTime+" "+getGmt());

    }


}
