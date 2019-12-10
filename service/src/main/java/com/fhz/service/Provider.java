package com.fhz.service;

import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: ssm
 * @description:
 * @author: FuHZ
 * @create: 2019-12-10 15:28
 **/
public class Provider {

//    static{
//        PropertyConfigurator.configure("src/main/resources/log4.properties");
//    }
    public static void main(String args[]) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:/*.xml");
        context.start();
        System.in.read();
    }
}
