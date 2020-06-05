package 복습;

public class Car {
	//특징(응집도)
	//성질 => 멤버변수 ,전역변수(자동초기화)(클래스전체에서 쓸수있따고해서 전역변수) 
	String wheel; //바퀴모양 참조형은 다 null 로 초기화된다.
	int speed; //속도, 0 
	//객체 생성시 자동 호출되는 메소드를 만들예정, 생성자 메소드 라고 한다.
	//생성자 메소드는 반환을 표기하지 않는다. 모두다 void ~~ 
	//생성자 메소드는 클래스 이름과 동일하게 만들어야 한다.
	// 파라미터 있는 생성자 
	public Car(String wheel, int speed) {
		super();
		this.wheel = wheel;
		this.speed = speed;
	}
	
	
	//동작 => 멤버메소드(함수), 입력값, 반환값유무
	// 매개변수=영어로 파라미터임 (parameter)
	public void speedup(int speed) {//SPEEDUP(50)
		this.speed = this.speed +speed; // this 는 해당클래스를 의미함. 
		System.out.println(this.speed + "로 속도를 Up!");
	
	}
	

	public int nowSpeed() {
		return speed;
	}
	
	public void SpeedDown() {
		System.out.println("속도를 DOWN!");
	}


	@Override  //오버라이드  , 기능을 재정의  
	public String toString() {
		return "자동차 [바퀴=" + wheel + ", 속도=" + speed + "]";
	}
	
	
	
}
