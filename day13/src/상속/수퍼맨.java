package 상속;

public class 수퍼맨 extends 맨 {
	//변수3개,메소드2개를 가지고 시작한다.
	
	boolean sky;
	public void space() {
		System.out.println(name+ " 이 우주를 날다");
	}
	
	
	@Override  // Annotation(표시,어노테이션 ) 
	//의미없는 확인용도 어노테이션이 있고  
	// 의미 있는 특정한 처리용도가 있다. 
	public void run() {
		System.out.println("빛의 속도로 달리다."); //부모의 run 기능을 수정함 
	}
	
	
	
	@Override
	public String toString() {
		return "수퍼맨 [sky=" + sky + ", power=" + power + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}
