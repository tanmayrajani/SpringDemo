package com.tanmay.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("com/tanmay/SpringDemo/spring-config.xml");
        Triangle triangle = (Triangle) context.getBean("trianlge");
        triangle.draw();
    }
}
