package 추상클래스;

// 테슬라 class: 설계도에 꼭 있어야하는 기능을 구현한 class
// car interface: 꼭 있어야 하는 기능을 정의한 문서 


public abstract class 테슬라 implements Car {
	String name; //일반변수
	
	//추상클래스는 추상메소드,일반메소드,일반변수 를 다 가지고있다.
	//추상 메소드 (강제성) 
	public abstract void 싣다();
	
	
public void run() {
	
	System.out.println("전기로 달리다.");
	//예외처리를 하고 싶은 경우 
	//try~catch, throws 중 하나.
	//메소드를 재정의하는 경우, throws 를 사용불가 .
	
	
	try {
		System.out.println(300/0);
		
	} catch (Exception e) {

	}

}
	
	
}
