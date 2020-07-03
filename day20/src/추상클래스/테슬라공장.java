package 추상클래스;

public class 테슬라공장 {

	public static void main(String[] args) {
		//추상클래스는 변수의 타입으로 쓸 수 있다.
		//업캐스팅해서 쓸 수 있다.
		//인터페이스도 변수의 타입으로 쓸 수 있다.
		
		Car bus = new 테슬라트럭();
		
		bus.run();
		
//		bus.싣다(); 자식의추가된 부분은 접근할수없다. 부모로 설정된경우 
		
		
		
		
	}

}
