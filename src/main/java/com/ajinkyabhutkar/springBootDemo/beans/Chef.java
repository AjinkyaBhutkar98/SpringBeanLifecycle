package com.ajinkyabhutkar.springBootDemo.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Scanner;


@Component("myChef")
public class Chef implements InitializingBean, DisposableBean {

    private LocalDate localDate;
    private Scanner scanner;
    private String custName;
    private String dishName;

    public Chef(){
        System.out.println("Chef has joined the kitchen");
        System.out.println("===========================");
    }

    @Override
    public void afterPropertiesSet() throws Exception{
        this.localDate=LocalDate.now();
        System.out.println("Customer arrived at "+localDate);
        System.out.println("===============================");
        this.scanner=new Scanner(System.in);

    }

    public void order(){

        System.out.println("PLease Enter your name to order food");
        custName=scanner.nextLine();
        System.out.println("PLease Enter food you want to order");
        dishName=scanner.nextLine();
        System.out.println(custName+" has ordered "+dishName);

    }

    @Override
    public void destroy() throws Exception{
        System.out.println("customer is leaving restaurant");
        this.localDate=null;
        this.scanner.close();
        System.out.println("restaurant is closed and will be opened tommorrow");
    }
}
