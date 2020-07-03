package 예외처리;

public class 예외처리연습 {

	public static void main(String[] args) {
		
		
		
		계산기 cal = new 계산기();
		cal.mul();
		
		
		try {
			cal.div3();
			
		} catch (Exception e) {
		System.out.println("div3 의 예외처리를 잡음");
		
		}
		
		
		
	}

}
