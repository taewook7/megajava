package ���޿�Ŭ����;

import java.util.Scanner;

public class �Է�ȭ�� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��ȣ�� �Է��ϼ���.: ");
		String number = sc.next();
		System.out.println("������ �Է��ϼ���.: ");
		String title=sc.next();
		System.out.println("������ �Է��ϼ���>: ");
		String content=sc.next();
		System.out.println("�۾��̴�? ");
		String writer=sc.next();
		
		�Է�ȭ��DAO dao = new �Է�ȭ��DAO();
		�Է�ȭ��DTO dto = new �Է�ȭ��DTO();
		
		dto.setNumber(number);
		dto.setContent(content);
		dto.setTitle(title);
		dto.setWriter(writer);
		
		dao.insert(dto);
	}

}
