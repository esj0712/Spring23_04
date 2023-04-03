package kr.co.softsoldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.TestBean;
import kr.co.softsoldesk.beans2.TestBean1;
import kr.co.softsoldesk.beans2.TestBean2;
import kr.co.softsoldesk.beans2.TestBean3;
import kr.co.softsoldesk.beans2.TestBean4;

public class MainClass2 {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans2.xml");
		// #1
		TestBean1 t1=ctx.getBean("t1", TestBean1.class);
		System.out.println("t1"+t1);
		
		// #2
		TestBean2 t2=ctx.getBean("t2", TestBean2.class);
		System.out.println("t2"+t2);
		
		// #3
		TestBean3 t3=ctx.getBean("t3", TestBean3.class);
		System.out.println("t3"+t3);
		
		// #4
		TestBean4 t4=ctx.getBean("t4", TestBean4.class);
		System.out.println("t4"+t4);
		
		ctx.close();
		

	}

}
