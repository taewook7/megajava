package 연산자;

public class 비교연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=200;
		int num2=100;
		
		//비교 연산자의 결과는 논리형!!!!  (boolean,true/false)
		System.out.println(num1==num2);  // = 을 못쓰는이유는 num1 을 선언할때 = 을 써버렸기 때문에 
		System.out.println(num1!=num2);
		System.out.println(num1>num2);
		System.out.println(num1>=num2);
		
		int money =10000;
		if (money>=15000) {
			System.out.println("감사합니다.");
		} else {
			System.out.println("조금만 더 주세요.");
		}
		
	}

}
