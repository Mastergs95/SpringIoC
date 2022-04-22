package org.example.auto;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarBeanConfig {

    @Bean
    public Car carBean(){
        Car car= new Car();

        car.setType("HatchBack");
        car.setModel("Volkswagen GTI");
        car.setPrice(33000);
        car.setCombinedFuelEconomy(26);

        return car;
    }

    @Bean(name = "engineVM")
    public Engine engine(){

        return new Engine(228,5000,2.0f,
                "I-4","premium unleaded");
    }
}
