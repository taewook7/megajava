package 배열심화;

import java.util.Random;

public class 랜덤스트링 {

	public static void main(String[] args) {
		String[] food = {"감자", "고구마", "양파", "피자","고기"};
		Random r = new Random();
		int choice = r.nextInt(5);
		System.out.println("내가 아무거나 선택한 값은 " + food[choice]);
		
	}

}
