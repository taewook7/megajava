package ���޿�Ŭ����;

public class �Է�ȭ��DAO {
	public void insert(�Է�ȭ��DTO dto) {
		System.out.println("db�� ������");
		System.out.println("����� ��ȣ�� " + dto.getNumber());
		System.out.println("����� ������ " + dto.getTitle());
		System.out.println("����� ������ " + dto.getContent());
		System.out.println("����� �۾��̴� " +dto.getWriter());
		System.out.println("db�� ����Ϸ�");
	}
	
	
}
