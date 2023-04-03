package kr.co.softsoldesk.beans3;

public class TestBean2 {
	
	public TestBean2() {
		TestBean1 t1=new TestBean1(); // 의존성
		System.out.println("TestBean2의 생성자");
	}
	
	public void bean2_init() {
		System.out.println("TestBeean2의 init 메서드");
	}
}
