package com.upgrad.hirewheels.client;

import com.upgrad.hirewheels.beans.Users;
import com.upgrad.hirewheels.practice.BalanceService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        //Checkpoint 1
        System.out.println("Checkpoint 1");
        Users user = (Users) context.getBean("user1");
        System.out.println(user);

        BalanceService balanceService = (BalanceService) context.getBean("balanceService");
        System.out.println(balanceService.checkUserBalance());

    }
}
