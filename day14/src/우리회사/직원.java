package 우리회사;

public class 직원 {
	public String name="홍길동"; //범위 넓은거 1위  (같은 패키지도 다되고 + 다른패키지도 접근가능) 
	protected int salary=100; // 범위넓은거 2위  ,같은 패키지+다른패키지(상속관계에 있을때만)
	String address="서울";  // 디폴트 접근제어자 기본값 3위 , 같은 패키지내에서만 접근가능
	private int rrn=801010; // 범위제일좁은 4위 (해당 클래스에서만 접근가능) 
	
	
	@Override
	public String toString() {
		return "직원 [name=" + name + ", address=" + address + ", salary=" + salary + ", rrn=" + rrn + "]";
	}
	
	
}
