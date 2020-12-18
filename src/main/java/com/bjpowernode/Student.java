package com.bjpowernode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {
    @Value("33")
    private int age;
    @Value("李四")
    private String name;
    @Autowired
    @Qualifier("school")
    private School school;

    public Student() {
        System.out.println("Student无参");
    }

    public Student(int age, String name, School school) {
        System.out.println("Student有参");
        this.age = age;
        this.name = name;
        this.school = school;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
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
