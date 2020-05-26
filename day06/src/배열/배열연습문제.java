package 배열;

public class 배열연습문제 {

	public static void main(String[] args) {
//1. 10,20,30,40,50 을 배열에 넣어 첫번째 값과 두번째값을 더해서 프린트
		int[] num= {10,20,30,40,50};
		int sum=0;
			for (int i = 0; i < 2; i++) {
				sum=sum+num[i];
			}
		System.out.println("첫번째값+두번째값 = "+sum);
		
		
		
	}

}
