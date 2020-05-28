package 배열심화;

public class 배열복사 {

	public static void main(String[] args) {
		int[] x= {100,200,300};
		int[] y=x; //참조형의 복사
		for (int i = 0; i < y.length; i++) {
			System.out.println("x: " +x[i]+ ", " + "y: " + y[i]);
		}
		System.out.println("--------------------------------");
		x[0]= 999;
		
		for (int i = 0; i < y.length; i++) {
			System.out.println("x: " +x[i]+ ", " + "y: " + y[i]);
		}
		System.out.println("얕은 복사y주소: " + y );
		System.out.println("얕은 복사x주소: " + x );
		System.out.println("---------------------");
		int[] a= {100,200,300};
		int[] b= a.clone(); //깊은 복사
		a[0]=777;
		for (int i = 0; i < b.length; i++) {
		System.out.println("a >>"+a[i]);
		System.out.println("b >>"+b[i]);
		}
		System.out.println("얕은 복사a주소: " + a );
		System.out.println("얕은 복사b주소: " + b );
		
		
//		int x=100;
//		int y=x; //  기본형의 복사
//		System.out.println("x: " +x);
//		System.out.println("y: " +y);
//		x=200;
//		System.out.println();
//		System.out.println("x: " +x);
//		System.out.println("y: " +y);
	}

}
