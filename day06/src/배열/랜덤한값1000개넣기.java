package �迭;

import java.util.Random;

public class �����Ѱ�1000���ֱ� {

	public static void main(String[] args) {
		Random r = new Random(42);  // 42�� �صθ� �Ȱ������� ����.
		int[] num = new int[1000]; //�ּҴ� ������8����Ʈ  4����Ʈx1000�� 
		for (int i = 0; i < num.length; i++) {
			num[i]=r.nextInt(1000); // 0~999
		}
		for (int x : num) {
			System.out.println(x);
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(i+": "+num[i]);
		}
		System.out.println("================");
		for (int i = 0; i < num.length; i++) {
			// 1.�迭�� �ش� �ε����� ����ִ� ���� ������ͼ�(cpu) 
			//,ã�����ϴ� ���� ��ġ�ϴ��� üũ
			// 2. ��ġ�Ѵٸ�, �ش� �ε����� ����Ʈ 
			if (num[i]==492) {
				System.out.println(i);
			}
			
		}
		
	}

}
