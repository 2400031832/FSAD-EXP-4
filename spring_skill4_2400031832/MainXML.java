
package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainXML {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("student-config.xml");
        Student s = (Student) ctx.getBean("studentBean");
        System.out.println(s);
    }
}
