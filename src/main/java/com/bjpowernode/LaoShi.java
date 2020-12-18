package com.bjpowernode;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "laoshi")
public class LaoShi {
    @Value("zhangsan")
    private String name;
    @Value("yuwen")
    private String type;

    @Override
    public String toString() {
        return "LaoShi{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LaoShi() {
    }

    public LaoShi(String name, String type) {
        this.name = name;
        this.type = type;
    }
}
