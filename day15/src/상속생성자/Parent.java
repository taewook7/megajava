package 상속생성자;

public class Parent {
	void tv() {
		System.out.println("아침마당을보다");
	}
	
	//오버라이드 불가 메소드~상속은된다 
	// 파이널 써서 play는 여기가 마지막임 
	final void play() {
		System.out.println("등산을 하다");
	}
	
	
	
}
