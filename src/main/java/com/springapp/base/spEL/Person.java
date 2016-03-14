package com.springapp.base.spEL;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by apple on 16/2/21.
 */
public class Person {

    String name;

    private Car car;

    @Value("#{systemProperties['aa']}")
    private String city;

    @Value("#{T(java.lang.Math).random()*100.0}")
    String info;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", car=" + car +
                ", city='" + city + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
