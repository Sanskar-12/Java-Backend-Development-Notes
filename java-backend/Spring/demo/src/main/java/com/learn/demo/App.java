package com.learn.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml")); // Deprecated XMLBeanFactory
    	
    	ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml"); // Replacement of XMLBeanFactory
    	
        Alien obj = (Alien)factory.getBean("alien");
        
        obj.code();
    }
}
