package ����;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();  // ����� �����Ҽ��ִ� ��ǰ  ��� ����Ʈ
		list.add("����");
		list.add("����");
		System.out.println(list.size()+"��");
		
		list.add("����");
		System.out.println(list.size()+"��");

		System.out.println(list.get(0));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	
		for (Object x: list) {
			System.out.println(x);
			
			System.out.println(list);
			
			list.remove(0);
			System.out.println(list);
			System.out.println(list.size());
			
			
		}
	
	
	}

}
