package �迭��ȭ;

import java.util.Random;

public class ������Ʈ�� {

	public static void main(String[] args) {
		String[] food = {"����", "����", "����", "����","���"};
		Random r = new Random();
		int choice = r.nextInt(5);
		System.out.println("���� �ƹ��ų� ������ ���� " + food[choice]);
		
	}

}
