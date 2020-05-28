package 배열심화;

import java.util.Arrays;
import java.util.Random;

public class 수능1등을찾아라 {

	public static void main(String[] args) {
		Random r = new Random(55);
		int[] jumsu = new int[10000];
		
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] =r.nextInt(401);
		}
		
		//파괴형 함수
		Arrays.sort(jumsu);
		
		for (int x : jumsu) {
			System.out.println(x);
		}
		
		System.out.println("최고점수는  " + jumsu[9999]);
		
		
	}

}
