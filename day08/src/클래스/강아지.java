package 클래스;

public class 강아지 {
// 강아지=>class 
// -색,이름 => 멤버변수  (클래스 바로밑에 쓰는변수) , 선언의 변수의 생존범위(전체영역에 쓸수있다고해서 
	// 전역변수라고함 Global 이라고도 함 
	String color;
	String name;
// -짖다,꼬리를 흔들다 => 멤버메소드(함수)
	public void bark() {
		System.out.println("강아지가 짖다.");
	}
	
	public void shake() {
		System.out.println("꼬리를 흔들다.");
	}
	
}
