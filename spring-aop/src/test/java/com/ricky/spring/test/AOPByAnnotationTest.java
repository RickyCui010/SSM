package com.ricky.spring.test;

import com.ricky.spring.aop.annotation.Calculator;
import com.ricky.spring.aop.annotation.CalculatorImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Date:2022/7/4
 * Author:ybc
 * Description:
 */
public class AOPByAnnotationTest {

    @Test
    public void testAOPByAnnotation(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("aop-annotation.xml");
        Calculator calculator = ioc.getBean(CalculatorImpl.class);
        calculator.add(1, 1);
    }

}
