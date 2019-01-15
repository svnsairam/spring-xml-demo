package com.stackroute;


import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1 = (Movie) context.getBean("movieBB2");
        System.out.println("Actor Name using Application Context = " + movie1.getActor().getName());
        System.out.println("Actor Gender using Application Context = " + movie1.getActor().getGender());
        System.out.println("Actor Age using Application Context = " + movie1.getActor().getAge());

        Movie movie2 = (Movie) context.getBean("movieBB2");
        System.out.println(movie1 == movie2);

        Movie movie3 = (Movie) context.getBean("movieKhaleja");
        System.out.println("Actor Name using Application Context = " + movie3.getActor().getName());
        System.out.println("Actor Gender using Application Context = " + movie3.getActor().getGender());
        System.out.println("Actor Age using Application Context = " + movie3.getActor().getAge());

        Movie movie4 = (Movie) context.getBean("movieSVSC");
        System.out.println("Actor Name using Application Context = " + movie4.getActor().getName());
        System.out.println("Actor Gender using Application Context = " + movie4.getActor().getGender());
        System.out.println("Actor Age using Application Context = " + movie4.getActor().getAge());
    }
}
