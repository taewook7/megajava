package ����ó��;

public class ���� {
	public void div(int n) {
		try {
			System.out.println(n/0);
			
		} catch (Exception e) {
			System.out.println("����ó����.");
		
		}
		//1. ����ó���� �߻��� ��ҿ��� �ٷ� ó��
		// try~catch
		
	}





public void div2(int n) throws  Exception { 
	System.out.println(n/0);

	//2. ����ó���� �޼ҵ带 ȣ���� ������ ���ѱ�� ���
	
}



public void mul(){    // try~catch
	int[] num={1,2}; 
	try {
		System.out.println(num[2]);
	} catch (Exception e) {
		System.out.println("mul �� ����ó���� ��Ҵ�.");
	}
}

public void div3(){     
	int[] num={1,2};
		System.out.println(num[2]);
}

}

