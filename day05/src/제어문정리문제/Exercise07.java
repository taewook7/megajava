package �����������;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int account =10000;
		int money = 0;
		account+= money;
		
		while (true) {
			System.out.println("-----------------");
			System.out.println("1.����|2.���|3.�ܰ�|4.����");
			System.out.println("-----------------");
			System.out.print("����>> ");
			int scan = sc.nextInt(); //String ->int 
			
			if (scan == 1) {
				System.out.println("�Աݾ� >> ");
				money=sc.nextInt();
				account+= money;
				//������ �޾Ƽ� ���忡 �־����
				System.out.println("������ "+account);
			} else if (scan == 2) {
				//����� �޾Ƽ� ���忡�� ������
				System.out.println("��ݾ� >> ");
				money=sc.nextInt();
				account-= money;
				System.out.println("���� �ܾ��� " +account);
				

				
			} else if (scan == 3) {
				//���忡 ��� �ִ� �� ������
				System.out.println("�ܰ� = " + account);
				
				
				
				
				
				
			} else if (scan == 4) {
				//���α׷� ����!4
				System.out.println("3�ʵ������մϴ�.\n" + "2�ʵ������մϴ�.\n" +"������..1\n" + "�ý����� �����մϴ�.");
				System.exit(0);
			}

			else {

			} 
		}
	
	}

}
