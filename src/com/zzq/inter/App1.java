package com.zzq.inter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/zzq/inter/beans.xml");
		Check c = (Check) ac.getBean("check");
		System.out.println(c.check());
	}

}
