package 클래스;

public class Tv {
	//멤버변수 , 전역변수(자동 초기화) 
	int ch; //변수는 선언된 위치가 사용할 수 있는 영역. 
	//값을 지정하진 않았지만 int는 0으로초기화됬고 불린은 false 로 초기화됬다. 전역변수니깐 
	//왜 전역변수냐고 전체에서 쓸수있어서 class tv안 전체에서 
	boolean onoff;

	//객체생성될 때마다 자동으로 사용! call(호출하다)
	//그래서 생성자 (메소드) 라고 한다.
	public Tv(int x,boolean y) {
		ch=x;
		onoff=y;
	}
	
	//멤버메서드
	public void on() {
		System.out.println("Tv를 켜다.");
		
	}
	public void off() {
		System.out.println("Tv를 끄다");
	}
	
	
	// 재정의 (override, 오버라이딩)
	public String toString() {
		return "채널은"+ ch + ", 전원은 " + onoff;
	}
	
	
	
	
}
