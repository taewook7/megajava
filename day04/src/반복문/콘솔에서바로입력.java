package �ݺ���;

import java.util.Scanner;

public class �ֿܼ����ٷ��Է� {

	public static void main(String[] args) {
//		// Scanner ��ĳ�� (�Է¿�, file, Ű����, ��Ʈ��ũ)
//		// String -- > int ��ɾ ������ ����.
		Scanner sc=new Scanner(System.in);
//		System.out.print("���̸� �Է�>>");
//		int age = sc.nextInt();  // �Էµ� �޾ƿ��� ��Ʈ�ε� �ǰ� 
//	
//		System.out.println("����� ���̴�" + age);
//	    //���� ���̸� ����غ�����.
//		
//		int age2 = age+1;
//		System.out.println("����� ���⳪�̴� "+age2+"�Դϴ�.");
		
//--------------------------------------------------------------
		//�� ���� �Է¹޾Ƽ�, ���� �� ū��.? 
		System.out.print("num1 >> ");
		int num1=sc.nextInt();
		System.out.print("num2 >>");
		int num2=sc.nextInt();
		if (num1>num2) {
			System.out.println("num1 " + num1 + " �� ��ũ�׿�");
		} else {
			System.out.println("num2 " + num2 + " �� ��ũ�׿�");
		}

	}

}
