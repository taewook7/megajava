package �迭��ȭ;

import java.util.Random;
import java.util.Scanner;

public class �������� {

	public static void main(String[] args) {
		int[] math1 = new int[300];
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random(5); //�������� ���ڸ� �־��ָ� �Ź��Ȱ������� ���´�. seed�� ���Ѱ�
		for (int i = 0; i < math1.length; i++) {
			math1[i] =r.nextInt(101); //0~100������ ���´�  1���Գ��ͼ� 101�γ�������
		}
		
		int[] math2 = math1.clone();
		int sum=0;
		int sum2=0;
		
		math1[0]=39;
		math2[100]=55;
		math2[299]=66;
		
		
		for (int i = 0; i < math2.length; i++) {
			System.out.println("1�б� ���������� >> "+i+"��°�л�: "+ math1[i]);
			System.out.println("2�б� ���������� >> "+i+"��°�л�: "+ math2[i]);
		}
		
		for (int i = 0; i < math1.length; i++) {
			sum+=math1[i];
		}
		System.out.println("1�б� ���������� ="+sum);
		System.out.println("1�б� �������������="+(double)sum/math1.length);
		
		for (int i = 0; i < math2.length; i++) {
			sum2+=math2[i];
		}
		
		double avg1 =(double)sum/math1.length;
		double avg2 =(double)sum2/math2.length;
		
		
		System.out.println("2�б� ���������� ="+sum2);
		System.out.println("2�б� �������������="+(double)sum2/math2.length);
		
		
		if (avg1 >avg2) {
			System.out.println("1�б� ����� �� ����");
		} else if (avg1==avg2) {
			System.out.println("���б� ����� ������");
		} else {
			System.out.println("2�б� ����� ������");
		}
		
		System.out.println("---------��ġ��----------");
		int count =0;
		for (int i = 0; i < math2.length; i++) {
			if (math1[i]!=math2[i]) { // ���� �迭�� ����ִ� ���� �������� üũ
				count++;
				System.out.println("���� �ٸ� ��ġ�� : " + i);
				
			}
		}
		System.out.println("������ �ٸ� �ο��� " +count + "���̴�.");
		
	}

}
