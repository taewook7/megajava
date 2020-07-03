package 예외처리;

public class 예외발생1 {

	public static void main(String[] args) {
		int num=30;
		System.out.println("에러 발생전..처리내용");
		try {
			//에러가 발생할 것 같은 코드
			System.out.println(num/0);  // 이문장을 실행하면 
			
		} catch (Exception e) {  //에러가 발생하면 잡아라 
			//에러가 발생하면 어떻게 처리할 지 코드
//			e.printStackTrace();
			System.out.println("산술 계산시 에러가 발생하여 처리함");
		}
		
		System.out.println("에러 발생후..처리내용");
		
		
		
	}

}
