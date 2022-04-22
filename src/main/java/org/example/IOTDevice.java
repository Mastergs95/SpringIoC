package org.example;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class IOTDevice {

    String device="Air Conditioner";
    String description="Temperature sensor";

    public IOTDevice(){
        System.out.println("Objected created successfully!");
    }

    public IOTDevice(String device,String description){
        System.out.println("Objected created successfully!");
        this.device=device;
        this.description=description;
    }

    public String getDescription() {
        return description;
    }

    public String getDevice() {
        return device;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    @Override
    public String toString() {
        return "IOTDevice {" +
                "device = '" + device + "!\'" +
                ", description = '" + description + "\'" + '}';
    }

    @PostConstruct
    public void initBean() throws Exception{
        System.out.println("IOTDevice bean has been instantiated. Inside the initBean() method.");

    }

    @PreDestroy
    public void destroyBean()throws Exception{
        System.out.println("IOTDevice has been destroyed. Inside the destroyBean() method.");
    }
}
