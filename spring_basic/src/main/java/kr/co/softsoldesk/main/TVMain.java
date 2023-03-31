package kr.co.softsoldesk.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.co.softsoldesk.beans.SamsungTV;
import kr.co.softsoldesk.beans.SoldeskTV;
import kr.co.softsoldesk.beans.TV;

public class TVMain {

	public static void main(String[] args) {
		
		// spring 컨테이너 구동
		// AbstractApplicationContext : BeanFectory + ApplicationContext
		AbstractApplicationContext ctx1=new GenericXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		// GenericXmlApplicationContext : 파일과 클래스 관리 설정(xml) 
		
		// 컨테이너로부터 필요한 객체를 요청
		TV tv11=(TV)ctx1.getBean("tv1");
		tv11.powerOn();
		tv11.powerOff();
		tv11.volumeUp();
		tv11.volumeDown();
		TV tv22=(TV)ctx1.getBean("tv2");
		tv22.powerOn();
		tv22.powerOff();
		tv22.volumeUp();
		tv22.volumeDown();
		
		ctx1.close();
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		SamsungTV tv1=(SamsungTV)ctx.getBean("tv1");
		calltv(tv1);
		SoldeskTV tv2=(SoldeskTV)ctx.getBean("tv2");
		calltv(tv2);
		
		ctx.close();
	}
	
	public static void calltv(TV tv) {
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
	}

}
