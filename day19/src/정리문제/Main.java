package ��������;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//1.create
		System.out.println("id�Է�>> ");
		String id= sc.next();
		
		System.out.println("pw�Է�>> ");
		String pw= sc.next();
		
		//dbó��(dao)
		
		
		DAOinterface dao = new DAOinterface() {
			
			@Override
			public void update(String id, String pw) {
				System.out.println(id + "�� ��й�ȣ��" + pw +"�κ���Ǿ����ϴ�.");
			}
			
			@Override
			public void read(String id) {
				System.out.println(id+ "�� ��й�ȣ�� 1234 �Դϴ�.");
			}
			
			@Override
			public void delete(String id) {
				System.out.println(id+"�� �����Ǿ����ϴ�.");
				
			}
			
			@Override
			public void create(String id, String pw) {
				System.out.println(id + ", "+pw+"�� ���ԿϷ�!");
				
			}
		};
		dao.create(id, pw);
		dao.update(id, pw);
		dao.read(id);
		dao.delete(id);
		
		
		
		
	}

}
