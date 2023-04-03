package kr.co.softsoldesk.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class TestBeanPostProcessor implements BeanPostProcessor{

	//init=method 호출전
	//beanName : 등록된 id -> t1(TestBean1), t2(TestBean2)
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("before");
		// 관리자[admin]
		switch (beanName) {
		case "t1":
			System.out.println("id가 t1인  객체가 생성됨");
			break;

		case "t2":
			System.out.println("id가 t2인  객체가 생성됨");
			break;
		}
		
		return bean;
	}

	//init=method 호출후
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("after");
		return bean;
	}
	
	

}
