package �迭;

import java.util.Scanner;

public class �迭��������4 {

	public static void main(String[] args) {
		int[] num3= new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < num3.length; i++) {
			System.out.println("�����Է�>> ");
			num3[i] =sc.nextInt();
		
		}
		for (int x : num3) {
			System.out.println(x);
		}
	}

}
