package 생성자;

import java.util.Date;

public class 계산기사용 {

	public static void main(String[] args) {
		계산기 cal = new 계산기();
		//메서드 오버로딩시 구분은 입력값으로 한다.
		//타입,순서,개수 중요 3박자 
		
		
		int result1=cal.add(100, 200);
		System.out.println(result1);
		
		double result2=cal.add(100, 200.2);
		System.out.println(result2);

		String result4=cal.add(100, "원");
		System.out.println(result4);

		int result5=cal.add(100, 200);
		System.out.println(result5);
		
		int[] result6= cal.add();
		for (int x : result6) {
			System.out.println(x);
		}
		
		Date result7 =cal.add(100);
		System.out.println(result7.getHours());
		
	}

}
