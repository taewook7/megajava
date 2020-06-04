package 클래스;

public class 계산기 {
	//동작: 멤버메소드
	//더하기, 곱하기
	public int add(int x, int y) {
		int result= x+y;
		System.out.println("두수를 더한 결과는= "+result + " 원");
		return result;
	}
	
	public int mul(int count,int salary) {
		int result =count * salary;
		System.out.println("두 수를 곱한 결과는= "+result+" 원");
		return result;
	}
}
