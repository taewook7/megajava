package 예외처리;

public class 계산기 {
	public void div(int n) {
		try {
			System.out.println(n/0);
			
		} catch (Exception e) {
			System.out.println("에러처리함.");
		
		}
		//1. 예외처리가 발생한 장소에서 바로 처리
		// try~catch
		
	}





public void div2(int n) throws  Exception { 
	System.out.println(n/0);

	//2. 예외처리할 메소드를 호출한 곳으로 떠넘기는 방법
	
}



public void mul(){    // try~catch
	int[] num={1,2}; 
	try {
		System.out.println(num[2]);
	} catch (Exception e) {
		System.out.println("mul 의 예외처리를 잡았다.");
	}
}

public void div3(){     
	int[] num={1,2};
		System.out.println(num[2]);
}

}

