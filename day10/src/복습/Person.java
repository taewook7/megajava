package 복습;

public class Person {

	public static void main(String[] args) {
		Car car = new Car("금관모양", 150);
		//객체 생성시 클래스이름과 동일한 메소드는 자동호출이 된다.
		//객체 생성시 반드시 해주어야하는 초기설정을 하기 위해
//		car.wheel ="금광모양";
//		car.speed= 150;
		System.out.println(car.nowSpeed());
		car.speedup(50);
		System.out.println(car.nowSpeed());
		car.SpeedDown();
		System.out.println(car.toString());
	}

}
