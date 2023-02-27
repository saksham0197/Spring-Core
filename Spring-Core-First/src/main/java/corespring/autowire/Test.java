package corespring.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import reference.springcore.A;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("corespring/autowire/AutoWireConfig.Xml");
		Emp emp1 = context.getBean("emp1",Emp.class);
		System.out.println(emp1);
		
		

	}

}
