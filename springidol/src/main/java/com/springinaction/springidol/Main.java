package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kindevil on 15-3-20.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("hello");
        ApplicationContext ctx=new ClassPathXmlApplicationContext(
                "spring-idol.xml");
        Performer performer = (Performer) ctx.getBean("kenny");
        try {
            performer.perform();
        } catch (PerformanceException e) {
            e.printStackTrace();
        }
        testScope(ctx);
    }

    public static void testScope(ApplicationContext ctx){
        Counter counter = (Counter) ctx.getBean("counter");
        System.out.println(counter.index);
        counter.index=999999;
        Counter newCounter = (Counter) ctx.getBean("counter");
        System.out.println(newCounter.index);
    }
}
