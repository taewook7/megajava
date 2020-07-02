package ��������;

public interface DAOinterface {
	void create(String id, String pw);
	void read(String id);
	void update(String id,String pw);
	void delete(String id);
}

//����
//DAO interface
//1) create(String id, String pw)
//2) read(String id)
//3) update(String id,String pw)
//4) delete(String pw)
//
//
//�͸�Ŭ���� 
//1) create: root,1234�� ���ԿϷ�!
//2) read: root �� ������ ��й�ȣ�� 1234 �Դϴ�.
//3) update: root�� ��й�ȣ�� 9999�� ����Ǿ����ϴ�.
//4) delete: root �� �����Ǿ����ϴ�.
