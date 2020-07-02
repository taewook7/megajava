package 인터페이스;

public interface 테슬라우주선 extends 우주선, 비행기 {
	//일반 변수는 쓸 수 없다.
	public final String NAME = "테슬라";//상수만!
	//메소드 2개를 이미 가지고 시작함.
	//인터페이스도 상속 가능.
	//인테페이스는 다중 상속 가능.
	//public abstract은 생략 가능.
	public abstract void jump(); //완벽하지 않은 메소드 정의
	//완벽하지 않음 == abstract(추상적)
	//완벽하지 않은 메소드 == 추상 메소드
	//인터페이스는 추상메소드만 들어갈 수 있다.
	
}
