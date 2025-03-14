package com.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Demo {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml"); 
    	
		Alien obj1 = (Alien)factory.getBean("alien");
        
        System.out.println(obj1.getAge());
        
        obj1.run();

	}
}

// We can set the initial value of age var which is private inside the property inside spring.xml file
// It will by default call the setAge method to set the value
// property is used to set the default value inside the class variable which is private