package �����������;

import java.util.Scanner;

public class �α���ǥ���� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int ������ =0;
		int ���缮=0;
		int ��ź=0;
		
		while (true) {
			System.out.println("-----------------");
			System.out.println("1.������|2.���缮|3.��ź|4.����");
			System.out.println("-----------------");
			System.out.print("����� ������ ? >> ");
			int scan = sc.nextInt(); //String ->int 
			
			if (scan == 1) {
				������=������+1;
				System.out.println("������ >> "+������);
				System.out.println("���缮 >> "+���缮);
				System.out.println("��ź >> "+��ź);
				
			} else if (scan == 2) {
				���缮=���缮+1;
			} else if (scan == 3) {
				��ź++;
			} else if (scan == 4) {
				//���α׷� ����!4
				System.out.println("��ǥ�� �����մϴ�. "+"\n");
				System.out.println("������: "+������ + "ǥ");
				System.out.println("���缮: "+���缮 + "ǥ");
				System.out.println("��ź: "+��ź + "ǥ");
				System.exit(0);
				
			}

			else {
				System.out.println("1~4������ ���� �������ּ���.");
			} 
		}
	
	}

}
