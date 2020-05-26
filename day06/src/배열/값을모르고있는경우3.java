package 배열;

import java.util.Scanner;

public class 값을모르고있는경우3 {

	public static void main(String[] args) {
		//키보드로 콘솔에서 입력받을 수 있는 부품 필요
	Scanner sc =new Scanner(System.in);
	
	int[] data =new int[10];
	
	for (int i = 0; i < data.length; i++) {
		System.out.print("숫자 입력>> ");
		data[i] = sc.nextInt(); //String ->int 
	
	}
	for (int i = 0; i < data.length; i++) {
		System.out.print(data[i]+ " ");
	}	
	
	int sum=0;
	for (int i = 0; i < data.length; i++) {
		sum= sum + data[i];
	}
	
	System.out.println(sum); //비파괴형
	System.out.println((double)sum/data.length);
						//-------비파괴형
		
	}

}
