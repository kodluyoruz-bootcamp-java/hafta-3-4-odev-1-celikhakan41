package com.dunyaSaatleri.classes;


import java.time.ZonedDateTime;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    static boolean keepRunning = true;
    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) throws InterruptedException {


        City moskow = new Moskow("Moskow", "MOW", "GTM +3:00");

        City newYork = new NewYork("New York", "NYC", "GTM -5:00");

        City london = new London("London", "LON", "GTM +0:00");

        City berlin = new Berlin("Berlin", "BER", "GTM +1:00");

        City newDelhi = new NewDelhi("New Delhi", "DEL", "GTM +5:30");


        Map<String, City> unorderedList = new HashMap<>();
        unorderedList.put(moskow.getCityName(), moskow);
        unorderedList.put(newYork.getCityName(), newYork);
        unorderedList.put(london.getCityName(), london);
        unorderedList.put(berlin.getCityName(), berlin);
        unorderedList.put(newDelhi.getCityName(), newDelhi);
        List<City> citySorting = new ArrayList<>(unorderedList.values());
        Collections.sort(citySorting, Comparator.comparing(City::getCityCode));
        System.out.println("Şehirler ve kodları : ");
        for (City city : citySorting) {
            System.out.println(city.getCityCode() + "\t" + city.getCityName());
        }


        do {

            System.out.println("3 veya daha fazla şehir kodu seç(Maksimum 5 adet)");
            System.out.print("Her kod sonrası virgül(',') koyunuz: ");
            String chooseCity = scan.nextLine().toUpperCase();
            String[] cityCode = chooseCity.split(",");

            ExecutorService executorService = Executors.newFixedThreadPool(cityCode.length);
            if (cityCode.length<3 && cityCode.length>5){
                keepRunning=false;
            }
            else{
                boolean kontrol=true;
                while (kontrol) {
                    try {
                        for (String w : cityCode) {
                            switch (w) {
                                case "BER":
                                    Runnable rn1 = new ThreadPool(berlin.cityCode);
                                    executorService.execute(rn1);
                                    berlin.showTime();
                                    Thread.sleep(1000);
                                    break;
                                case "MOW":
                                    Runnable rn2 = new ThreadPool(moskow.getCityCode());
                                    executorService.execute(rn2);
                                    moskow.showTime();
                                    Thread.sleep(1000);
                                    break;
                                case "NYC":
                                    Runnable rn3 = new ThreadPool(newYork.getCityCode());
                                    executorService.execute(rn3);
                                    newYork.showTime();
                                    Thread.sleep(1000);
                                    break;
                                case "LON":
                                    Runnable rn4 = new ThreadPool(london.getCityCode());
                                    executorService.execute(rn4);
                                    london.showTime();
                                    Thread.sleep(1000);
                                    break;
                                case "DEL":
                                    Runnable rn5 = new ThreadPool(newDelhi.getCityCode());
                                    executorService.execute(rn5);
                                    newDelhi.showTime();
                                    Thread.sleep(1000);
                                    break;

                                default:
                                    throw new IllegalStateException("Unexpected value: " + w);
                            }
                        }


                    } catch (Exception e) {
                        System.out.println("Fazla veya eksik sayıda kod girdiniz.");
                        kontrol=false;
                    }


                }
            }


        }while (keepRunning);


        }

    }












 /*Set<String> zones = ZoneId.getAvailableZoneIds();
        ZoneId istanbul = ZoneId.of("Europe/Istanbul");

        (new Thread() {
            public void run() {
                while (keepRunning) {
                }
            }
        }).start();
        while (true){
            System.out.println(ZonedDateTime.now(istanbul));
            Thread.sleep(1000);
        }*/

