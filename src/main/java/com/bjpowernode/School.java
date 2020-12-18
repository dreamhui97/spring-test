package com.bjpowernode;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "school")
public class School {
    @Value("铁道")
    String name;
    @Value("zhuhzou")
    String adress;

    public School() {
        System.out.println("School无参");
    }

    @Override
    public String toString() {
        return "School2{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public School(String name, String adress) {
        System.out.println("School有参");
        this.name = name;
        this.adress = adress;
    }
}
