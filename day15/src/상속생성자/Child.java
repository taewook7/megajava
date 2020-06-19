package 상속생성자;

public final class Child extends Parent {
	//클래스앞에 final 를 붙이면 내가 끝이라는 얘기다. 
	//종단 클래스  300p 
	@Override
	void tv() {
		System.out.println("무한도전을 보다.");
		

	}
	
	final void together() { //같이 뭘하냐? 
		tv();  // 나는 tv를 보다. 
		super.tv(); //부모님은 tv를 본다.   부모클래스의 
		//메소드를 쓰기때문에 super.메소드 라고 지정 . 책298p
	}
	
	
	
	
}
