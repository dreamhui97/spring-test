package com.testZhu;

import com.bjpowernode.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "student2")
public class Student2 {
    @Value("33")
    private int age;
    @Value("lisi")
    private String name;
    @Autowired
    @Qualifier("school2")
    private School2 school;

    public Student2() {
        System.out.println("Student无参");
    }

    public Student2(int age, String name, School2 school) {
        //System.out.println("Student有参");
        this.age = age;
        this.name = name;
        this.school = school;
    }



    public School2 getSchool() {
        return school;
    }

    public void setSchool(School2 school) {
        this.school = school;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", school=" + school +
                '}';
    }
}
