package �迭��ȭ;

import java.util.Random;

public class ��������Ȯ�� {

	public static void main(String[] args) {
		int[] ���� =new int[1000];
		Random r = new Random(42);
		for (int i = 0; i < ����.length; i++) {
			����[i] = r.nextInt(4)+1; // 1~4    1���� ����ؾ��ϹǷ� +1�� ������
		}
		
		for (int i = 0; i < ����.length; i++) {
			System.out.println(i+1 +" : " +����[i]);
		}
		
		int[] �л�=����.clone();
		for (int i = 0; i < 300; i++) {
			int index=r.nextInt(300);
			int jumsu =r.nextInt(4)+1;
			�л�[index] =jumsu;
		}
		
		//� ������ Ʋ�ȴ���  ���װ� ����/��� �� ���.
		//��� Ʋ�ȴ��� ã�ƺ�����.
		//�ϳ��� 1���̶�� �Ѵٸ�, �������� ����Ʈ! 
		int count=0;
		for (int i = 0; i < �л�.length; i++) {
			if (����[i] !=�л�[i]) {
				System.out.println(i + ": " +����[i] + ", " + �л�[i]);
				count++;
			}
		}
		
		int ok= 300-count;
		System.out.println("Ʋ������: " +count+ "��");
		System.out.println("��������: " + ok +"��");
	}

}
