package 배열;

import java.util.Scanner;

public class 배열연습문제2 {

	public static void main(String[] args) {
		//JAVA,SPRING,JSP를 입력받아 배열에넣어보세요.
		//출력은 **JAVA보다는 SPRING**
		Scanner sc = new Scanner(System.in);
		String[] num= new String[3];
		
		for (int i = 0; i < num.length; i++) {
			System.out.println("과목을 입력하세요>= ");
			num[i]=sc.next();
		
		}
	for (int i = 0; i < num.length; i++) {
		System.out.print(num[i]+" **");
	}
	}

}
