package 복습;

public class 정리문제 {

	public static void main(String[] args) {
		//정수
		int hour = 7;
		
		//실수
		double min = 0.49;
		
		//문자
		char day = '화';
		
		//논리
		boolean food = true; // false 
		
		System.out.println("지금 시각은 "+hour+"시");   // . 을 안으로들어간다고해서 접근연산자 라고 한다. 
		System.out.println("지금 분은 "+min+"분");
		System.out.println("지금 요일은 "+day+"요일");
		System.out.println("식사여부는 "+food);
		
		String     name = "홍길동" ;    // 기본형 이외에 데이터이며 특별하게 기본형처럼 만들어놓은것임.
		
		/////////////////////////////
		int num1 = 200; // 램에 데이터저장 
		int num2 = 100;  
		System.out.println(num1 == num2);  // 똑같니? 라는 비교연산자  cpu가 비교한다. 비교연산자의 결과는 무조건 boolean
		
		
		String n1="홍길동";
		String n2="박길동";
		System.out.println(n1.equals(n2));  // 기본형이 아니므로 == 비교연산자 사용불가. 
		
		if (n1.equals(n2)) { //true
			System.out.println("동일인이시군요");
		} else { //false
			System.out.println("동일인이 아니시군요.!");
		}

		
	}

}
