package 배열심화;

import java.util.Random;
import java.util.Scanner;

public class 수학점수 {

	public static void main(String[] args) {
		int[] math1 = new int[300];
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random(5); //랜덤값에 숫자를 넣어주면 매번똑같은값이 나온다. seed값 씨앗값
		for (int i = 0; i < math1.length; i++) {
			math1[i] =r.nextInt(101); //0~100번까지 나온다  1적게나와서 101로넣은것임
		}
		
		int[] math2 = math1.clone();
		int sum=0;
		int sum2=0;
		
		math1[0]=39;
		math2[100]=55;
		math2[299]=66;
		
		
		for (int i = 0; i < math2.length; i++) {
			System.out.println("1학기 수학점수는 >> "+i+"번째학생: "+ math1[i]);
			System.out.println("2학기 수학점수는 >> "+i+"번째학생: "+ math2[i]);
		}
		
		for (int i = 0; i < math1.length; i++) {
			sum+=math1[i];
		}
		System.out.println("1학기 수학총점은 ="+sum);
		System.out.println("1학기 수학평균점수는="+(double)sum/math1.length);
		
		for (int i = 0; i < math2.length; i++) {
			sum2+=math2[i];
		}
		
		double avg1 =(double)sum/math1.length;
		double avg2 =(double)sum2/math2.length;
		
		
		System.out.println("2학기 수학총점은 ="+sum2);
		System.out.println("2학기 수학평균점수는="+(double)sum2/math2.length);
		
		
		if (avg1 >avg2) {
			System.out.println("1학기 평균이 더 높음");
		} else if (avg1==avg2) {
			System.out.println("두학기 평균이 동일함");
		} else {
			System.out.println("2학기 평균이 더높음");
		}
		
		System.out.println("---------위치는----------");
		int count =0;
		for (int i = 0; i < math2.length; i++) {
			if (math1[i]!=math2[i]) { // 양쪽 배열에 들어있는 값이 동일한지 체크
				count++;
				System.out.println("값이 다른 위치는 : " + i);
				
			}
		}
		System.out.println("점수가 다른 인원은 " +count + "명이다.");
		
	}

}
