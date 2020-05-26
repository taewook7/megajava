package 배열;

import java.util.Scanner;

public class 배열연습문제4 {

	public static void main(String[] args) {
		int[] num3= new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < num3.length; i++) {
			System.out.println("숫자입력>> ");
			num3[i] =sc.nextInt();
		
		}
		for (int x : num3) {
			System.out.println(x);
		}
	}

}
