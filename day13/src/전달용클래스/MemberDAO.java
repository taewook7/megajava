package ���޿�Ŭ����;
//Data Access Object(dbó�� ���� Ŭ����)
public class MemberDAO {
	//db�� �ִ� ó���� ����
	public void insert(MemberDTO bag) {
		System.out.println("db�� ������."); //db����
		System.out.println("����� id: "+bag.getId());
		System.out.println("����� pw: "+bag.getPw());
		System.out.println("����� name: "+bag.getName());
		System.out.println("����� tel: "+bag.getTel());
		System.out.println("db�� ������");  //db����
		
		
	}

}
