package org.example;

import org.example.auto.Car;
import org.example.auto.CarBeanConfig;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) throws Exception {

//        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//
//        System.out.println("\nAbout to retrieve the instantiated bean...\n");
//        IOTDevice myDeviceBean = (IOTDevice) appContext.getBean("FridgeBean");
//        IOTDevice mySecondDeviceBean = (IOTDevice) appContext.getBean("DishwasherBean");
//
//
//        System.out.println("FirstBean: " + myDeviceBean);
//        System.out.println("SecondBean: " + mySecondDeviceBean);
//
//        appContext.close();


        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Car car = (Car) appContext.getBean("carBean");

        System.out.println("\nThe car obtained from the Bean:\n" + car);

    }


}
