package kr.co.softsoldesk.beans2;

public class TestBean1 {
	
	public TestBean1() {
		System.out.println("TestBean1의 생성자 입니다");
	}
	//생성자가 호출된후 자동으로 호출
	public void bean1_init() {
		System.out.println("TestBean1의 init 메서드");
	}
	
	//close 후 자동으로 호출
	public void bean1_destroy() {
		System.out.println("TestBean1의 destroy 메서드");
	}
}
