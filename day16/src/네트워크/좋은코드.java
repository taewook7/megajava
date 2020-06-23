package 네트워크;

public class 좋은코드 {

	public static void main(String[] args) {
		//클래스를 사용할때는 결합도를 낮춘다.(결합도를 작게) 해야한다. 
		Tire tire = new 금호타이어(); //클래스의 다형성이다. 
		// 클래스의 다형성은 상속 관계만 가능하고 
		// 업캐스팅(자동형변환)
		tire.타이어를끼다();
		
		// class 를 만들때는 하나의 class 안에 하나의 기능만 응집되게 해야 한다. (응집도) 
		// 응집도가 높은코드가 좋은 코드이다.
		
	}

}
