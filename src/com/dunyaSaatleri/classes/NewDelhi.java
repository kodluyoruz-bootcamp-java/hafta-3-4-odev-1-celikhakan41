package com.dunyaSaatleri.classes;

import com.dunyaSaatleri.interfaces.Clock;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class NewDelhi extends City implements Clock {

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

    public NewDelhi(String cityName, String cityCode, String gmt) {
        super(cityName, cityCode, gmt);
        this.cityName = cityName;
        this.cityCode = cityCode;
        this.gmt = gmt;
    }

    @Override
    public void showTime() {
        ZoneId newDelhi = ZoneId.of("Asia/Kolkata");
        LocalTime localTime= ZonedDateTime.now(newDelhi).toLocalTime();
        System.out.println(getCityName()+" "+getCityCode()+":"+localTime+" "+getGmt());

    }


}
