package com.learn.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;


public class App 
{
    public static void main( String[] args )
    {
    	// BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml")); // Deprecated XMLBeanFactory
    	
    	ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml"); // Replacement of XMLBeanFactory
    	
        Alien obj1 = (Alien)factory.getBean("alien");
        
        obj1.age = 20;
        
        obj1.code();
        System.out.println(obj1.age); // output will be 20
        
        Alien obj2 = (Alien)factory.getBean("alien");
        
        obj2.code();
        System.out.println(obj2.age); // output will be 20
    }
}


// Sigleton deisgn pattern of spring
// Singleton means all the object we create refer to same variable 
// It means of we a create an object it will not create a new object but it will refer to the old object variable

// Prototype scope will create multiple objects you have to define the scope inside spring.xml file