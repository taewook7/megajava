package ����;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountExample {

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		ArrayList list = new ArrayList(); //���¸�� ������ class 
		
		
		
		
		while (true) {
			System.out.println("------------------------------------------");
			System.out.println("1.���»��� | 2. ���¸�� | 3. ���� | 4.��� | 5.����");
			System.out.println("------------------------------------------");
			System.out.print("����> ");
			int choice = sc.nextInt();
			if (choice == 5) {
				System.out.println("���α׷� ����");
				System.exit(0);

			} 
		if (choice==1) { //���°�ü ������ , list �� �߰�ó��
			System.out.println("------------------------------");
			System.out.println("���»�����.");
			System.out.println("------------------------------");
			System.out.print("���¹�ȣ: ");
			String no =sc.next();
			System.out.print("������: ");
			String name =sc.next();			
			System.out.print("�ʱ��Աݾ�: ");
			int money =sc.nextInt();			
			Account a = new Account(no,name,money);
			list.add(a);
			
			
		} else if (choice==2) {  //���¸��

			System.out.println("-------------");
			System.out.println("���¸��");
			System.out.println("-------------");
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
			
			
			
			
		} else if (choice==3) {
			System.out.println("----------");
			System.out.println("����");
			System.out.println("-----------");
			System.out.println("���¹�ȣ: ");
			String no=sc.next();
			
			
			int index = 0; // ����Ʈ ���� ���� ��ġ 
			for (int i = 0; i < list.size(); i++) {
				Account a = (Account)list.get(i);
				if(a.no.equals(no)) {
					index =i;
				}
			}
//			int index = Integer.parseInt(no);
			Account a = (Account)list.get(index);
			System.out.println("�Աݾ�: ");
			int input =sc.nextInt();
			a.money=a.money+input;
			System.out.println("����ó�� �Ϸ�.!");
		
		} else if (choice==4) {
			System.out.println("----------");
			System.out.println("���");
			System.out.println("-----------");
			System.out.println("���¹�ȣ: ");
			String no=sc.next();  //1
			int index = Integer.parseInt(no);
			Account a = (Account)list.get(index -1);
			System.out.println("��ݾ�: ");
			int output =sc.nextInt();
			a.money=a.money-output;
			System.out.println("���ó���Ϸ�!");
			
			int money =sc.nextInt();
		} else {
			System.out.println("���� �׸��Դϴ�. Ȯ���ϰ� �ٽ� �Է����ּ���.");
		}  //else end 
		} // while end
		
		
	} //main end

} // class end 
