package com.bjpowernode;

import com.testZhu.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class springTest1 {
   /* @Test
    public void test01(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student2 student1 = (Student2) ac.getBean("student");
        System.out.println(student1);


    }*/
   /* @Test
    public void test02(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student2 student1 = (Student2) ac.getBean("student2");
        System.out.println(student1);

    }*/

   @Test
    public void test03(){
       String config = "applicationContext.xml";
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
       Student student = (Student) applicationContext.getBean("student");
      Student2 student2 = (Student2) applicationContext.getBean("student2");
       System.out.println(student);
      System.out.println(student2);
   }

   @Test
   public void test04(){
      String config = "applicationContext.xml";
      ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
       Student2 student2 = (Student2) applicationContext.getBean("student2");
       System.out.println(student2);
   }
}
