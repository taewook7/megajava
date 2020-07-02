package 인터페이스;

public class 테슬라우주선v1 implements 테슬라우주선 {

	@Override
	public void space() {
		System.out.println("화성을 탐사하다.");
	}

	@Override
	public void fly() {
		System.out.println("여객 2000명을 태우다.");
	}

	@Override
	public void jump() {
		System.out.println("300km를 수직상승할 수 있다.");
	}

}
