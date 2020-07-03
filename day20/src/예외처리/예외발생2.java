package 예외처리;

public class 예외발생2 {

	public static void main(String[] args) {
		int num=30;
		System.out.println("에러 발생전..처리내용");
		//계산 처리 부분은 계산기를 만들어서 부품을 사용! 
	
		계산기 cal = new 계산기();
		cal.div(num);  //1번으로 예외처리
		
		
		
		//호출한 곳에서 예외처리를 해야함..
		try {
			cal.div2(num);
		} catch (Exception e) {
			System.out.println("호출한 곳에서 예외처리함");
		
		}
		
		
		System.out.println("에러 발생후..처리내용");
		
		
		
	}

}
