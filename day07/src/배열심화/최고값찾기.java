package 배열심화;

import java.util.Arrays;
import java.util.Random;

public class 최고값찾기 {

	public static void main(String[] args) {
		Random r = new Random(55);
		int[] jumsu = new int[10000];
		
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] =r.nextInt(401);
		}
		
		
		int max = jumsu[0];
		//전체 점수를 돌면서 
		//조건체크 : 최고변수max 에 넣어둔 값보다 큰가 ? 
		//처리: 만약 크다면, 그 인덱스 까지의 최고값이 된다는 
		// 이야기 이므로 , max = 해당값을 넣어야 함.
		
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i]>max) {
				max = jumsu[i];
			}
		}
		

		
		System.out.println("내가 최고값이다 " + max);
		int count =0;
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] ==max) {
				System.out.println("번호 " + i);
				count++;
			}
		}
		System.out.println("인원은 " +count);
		
		
		
		System.out.println("최고값은 "+ jumsu[9999]);
	}

}
