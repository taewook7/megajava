package �ݺ���;

import java.util.Scanner;

public class Switch�������� {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("����� �����ϴ� ������ ??");
		String data = sc.next(); // �Ѵܾ ������,nextLine() ������������
		switch (data) {
		case "�ڹ�": System.out.println("JSP�� ����");
			break;
		case "���̽�": System.out.println("���� ����");	
			break;
			
		default:System.out.println("������ ������!");
			break;
		}
		
		
	}

}
