package �迭��ȭ;

import java.util.Arrays;
import java.util.Random;

public class �ְ�ã�� {

	public static void main(String[] args) {
		Random r = new Random(55);
		int[] jumsu = new int[10000];
		
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] =r.nextInt(401);
		}
		
		
		int max = jumsu[0];
		//��ü ������ ���鼭 
		//����üũ : �ְ���max �� �־�� ������ ū�� ? 
		//ó��: ���� ũ�ٸ�, �� �ε��� ������ �ְ��� �ȴٴ� 
		// �̾߱� �̹Ƿ� , max = �ش簪�� �־�� ��.
		
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i]>max) {
				max = jumsu[i];
			}
		}
		

		
		System.out.println("���� �ְ��̴� " + max);
		int count =0;
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] ==max) {
				System.out.println("��ȣ " + i);
				count++;
			}
		}
		System.out.println("�ο��� " +count);
		
		
		
		System.out.println("�ְ��� "+ jumsu[9999]);
	}

}
