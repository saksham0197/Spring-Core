package reference.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("reference/springcore/refconfig.Xml");
		A temp = (A) context.getBean("aref");
		
		System.out.println(temp.getX());
		
		System.out.println(temp.getOb().getY());
		
		System.out.println(temp);
		

	}

}
