package com.driver;

public class Order {

    private String id;
    private int deliveryTime;

    public Order(String id, String deliveryTime) {

        // The deliveryTime has to converted from string to int and then stored in the attribute
        //deliveryTime  = HH*60 + MM
        int totalTime= Integer.valueOf(deliveryTime.substring(0,2))*60+Integer.valueOf(deliveryTime.substring(3,5));
        this.id=id;
        this.deliveryTime=totalTime;
    }

    public String getId() {
        return id;
    }

    public int getDeliveryTime() {return deliveryTime;}
}
