package com.mumin.main;

import com.mumin.beans.Doctor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext(
        "com/mumin/resources/applicationContext.xml");
    Doctor doc1 = (Doctor) context.getBean("doctorOne");
    doc1.displayInfo();
  }

}
