package �迭��ȭ;

import java.util.Arrays;
import java.util.Random;

public class ����1����ã�ƶ� {

	public static void main(String[] args) {
		Random r = new Random(55);
		int[] jumsu = new int[10000];
		
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] =r.nextInt(401);
		}
		
		//�ı��� �Լ�
		Arrays.sort(jumsu);
		
		for (int x : jumsu) {
			System.out.println(x);
		}
		
		System.out.println("�ְ�������  " + jumsu[9999]);
		
		
	}

}
