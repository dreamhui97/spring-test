package com.testZhu;

import com.bjpowernode.LaoShi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "school2")
public class School2 {
    @Value("tiedao")
    String name;
    @Value("zhuhzou")
    String adress;
    @Autowired
    @Qualifier("laoshi")
    LaoShi laoShi;

    @Override
    public String toString() {
        return "School2{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", laoShi=" + laoShi +
                '}';
    }

    public LaoShi getLaoShi() {
        return laoShi;
    }

    public void setLaoShi(LaoShi laoShi) {
        this.laoShi = laoShi;
    }

    public School2() {
        System.out.println("School无参");
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

    public School2(String name, String adress) {
        //System.out.println("School有参");
        this.name = name;
        this.adress = adress;
    }
}
