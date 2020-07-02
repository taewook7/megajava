package 인터페이스;

public class BananaCar implements Car {

	@Override //재정의
	public void speedUp() {
		System.out.println("바나나 속도를 Up");
	}

	@Override
	public void speedDown() {
		System.out.println("바나나 속도를 Down");
	}

	@Override
	public void stop() {
		System.out.println("바나나 속도를 Stop");
	}

}
