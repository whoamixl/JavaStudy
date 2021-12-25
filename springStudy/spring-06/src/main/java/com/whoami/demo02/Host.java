package com.whoami.demo02;


import com.whoami.demo02.Rent;

//房东
public class Host implements Rent {
    @Override
    public void rent() {
        System.out.println("房东要出租房子");
    }

}
