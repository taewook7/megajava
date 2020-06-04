package 클래스;

public class 내가게 {

	public static void main(String[] args) {
		계산기 cal = new 계산기();
		int count =5;
		int salary =1000000;
		
		
		int result1= cal.mul(count,salary);
		
		int count2 =8;
		int salary2 =1200000;
		
		int result2 = cal.mul(count2,salary2);
		
		//두 달간 지불한 월급을 계산하고싶다.
	
		int result3 = cal.add(result1,result2);
		if (result3>=10300000) {
			System.out.println("지출이 너무컸네요");
		} else {
			System.out.println("적절한 소비였네요");
		}
	}
}

//클래스를 만들때는 하나의 역할만 집중하도록 만들어야 한다.
//응집도가 높은 것이 좋다.! (이것저것 섞어서 하지말란소리) 
