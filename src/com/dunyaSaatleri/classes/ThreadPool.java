package com.dunyaSaatleri.classes;

import java.time.ZonedDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ThreadPool extends Thread {

    City moskow = new Moskow("Moskow", "MOW", "GTM +3:00");

    City newYork = new NewYork("New York", "NYC", "GTM -5:00");

    City london = new London("London", "LON", "GTM +0:00");

    City berlin = new Berlin("Berlin", "BER", "GTM +1:00");

    City newDelhi = new NewDelhi("New Delhi", "DEL", "GTM +5:30");


    private final String cityCode;


    public ThreadPool(String cityCode) {

        this.cityCode = cityCode;

    }


//System.out.println(ZonedDateTime.now(berlin.showTime()));


    @Override
    public void run() {
        //System.out.println(ZonedDateTime.now(berlin.showTime()));

    }
}



