package �迭��ȭ;

public class �迭���� {

	public static void main(String[] args) {
		int[] x= {100,200,300};
		int[] y=x; //�������� ����
		for (int i = 0; i < y.length; i++) {
			System.out.println("x: " +x[i]+ ", " + "y: " + y[i]);
		}
		System.out.println("--------------------------------");
		x[0]= 999;
		
		for (int i = 0; i < y.length; i++) {
			System.out.println("x: " +x[i]+ ", " + "y: " + y[i]);
		}
		System.out.println("���� ����y�ּ�: " + y );
		System.out.println("���� ����x�ּ�: " + x );
		System.out.println("---------------------");
		int[] a= {100,200,300};
		int[] b= a.clone(); //���� ����
		a[0]=777;
		for (int i = 0; i < b.length; i++) {
		System.out.println("a >>"+a[i]);
		System.out.println("b >>"+b[i]);
		}
		System.out.println("���� ����a�ּ�: " + a );
		System.out.println("���� ����b�ּ�: " + b );
		
		
//		int x=100;
//		int y=x; //  �⺻���� ����
//		System.out.println("x: " +x);
//		System.out.println("y: " +y);
//		x=200;
//		System.out.println();
//		System.out.println("x: " +x);
//		System.out.println("y: " +y);
	}

}
