package �迭;

import java.util.Scanner;

public class �����𸣰��ִ°��3 {

	public static void main(String[] args) {
		//Ű����� �ֿܼ��� �Է¹��� �� �ִ� ��ǰ �ʿ�
	Scanner sc =new Scanner(System.in);
	
	int[] data =new int[10];
	
	for (int i = 0; i < data.length; i++) {
		System.out.print("���� �Է�>> ");
		data[i] = sc.nextInt(); //String ->int 
	
	}
	for (int i = 0; i < data.length; i++) {
		System.out.print(data[i]+ " ");
	}	
	
	int sum=0;
	for (int i = 0; i < data.length; i++) {
		sum= sum + data[i];
	}
	
	System.out.println(sum); //���ı���
	System.out.println((double)sum/data.length);
						//-------���ı���
		
	}

}
