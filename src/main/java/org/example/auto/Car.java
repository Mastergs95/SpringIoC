package org.example.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;
import java.util.Set;

public class Car {

    String type;
    String model;
    double price;
    int combinedFuelEconomy;
    Engine engine;
    Gearbox gearbox;
    List<String> notes;
    Set<Seats> availableSeatOptions;

    public Car(){
        System.out.println("Default constructor in Car has been used");
    }


    public Car(String type, String model, double price, int combinedFuelEconomy,
               Engine engine, Gearbox gearbox, List<String> notes, Set<Seats>seats){
        this.type=type;
        this.model=model;
        this.price=price;
        this.combinedFuelEconomy=combinedFuelEconomy;
        this.engine=engine;
        this.gearbox=gearbox;
        this.notes=notes;
        this.availableSeatOptions=seats;

        System.out.println("Parametrized Constructor has been used");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    @Autowired(required = false)
    @Qualifier("engineVW")
    public void setPrice(double price) {
        this.price = price;
    }

    public int getCombinedFuelEconomy() {
        return combinedFuelEconomy;
    }

    public void setCombinedFuelEconomy(int combinedFuelEconomy) {
        this.combinedFuelEconomy = combinedFuelEconomy;
    }


    public void setEngine(Engine engine) {
        this.engine = engine;
        System.out.println("Engine setter accessed in Car");
    }

    public Engine getEngine() {
        return engine;
    }

    public Gearbox getGearbox() {
        return gearbox;
    }

    @Autowired(required = false)
    public void setGearbox(Gearbox gearbox) {
        this.gearbox = gearbox;
    }

    public List<String> getNotes() {
        return notes;
    }

    @Autowired(required = false)
    public void setNotes(List<String>notes) {
        this.notes = notes;
    }

    public Set<Seats> getAvailableSeatOptions() {
        return availableSeatOptions;
    }

    @Autowired(required = false)
    public void setAvailableSeatOptions(Set<Seats> availableSeatOptions) {
        this.availableSeatOptions = availableSeatOptions;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", combinedFuelEconomy=" + combinedFuelEconomy +
                ", engine=" + engine +
                ", gearbox=" + gearbox +
                ", notes=" + notes +
                ", availableSeatOptions=" + availableSeatOptions +
                '}';
    }
}
