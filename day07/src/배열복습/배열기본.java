package 배열복습;

public class 배열기본 {

	public static void main(String[] args) {
		// 1. 많은 양의 데이터를 이미 알고 있는 경우.
		String[] food = {"짜장면", "짬뽕", "커피"};
		//배열은 같은 타입만 묶을 수 있다.
		food[0]="울면";
		for (int i = 0; i < food.length; i++) {
			System.out.println(food[i]);
		}
		for (String string : food) {
			System.out.println(string);
		}
		
		// 2. 많은 양의 데이터를 모르고 있는 경우.
		String[] doing = new String[3];
		doing[0]="회사인";
		doing[1]="소설가";
		doing[2]="여행가";

		for (int i = 0; i < doing.length; i++) {
			System.out.println(doing[i]);
		}
		
		for (String a : doing) {
			System.out.println(a);
		}
		
		
		
	}

}
