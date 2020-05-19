package 순차문;

import java.util.Date;

public class 연습문제 {

	public static void main(String[] args) {

		// Date를 이용해서 시간을 구한다.  지금 인사를 출력해보세  11시 전이면 굿모닝  , 16시 전이면 굿애프터눈 ,  22시전이면 굿이브닝  아니면 굿나잇 
		// Date를 이용 달을 구해보세요. 2월은 28일까지  4,6,9,11월은 30일까지  나머지는 31일까지 
	Date date= new Date();
	int hour = date.getHours();
		
	if (hour < 11) {
		System.out.println("굿모닝");
	} else if (hour < 16) {
		System.out.println("굿애프터눈");
	} else if (hour <22) {
		System.out.println("굿이브닝");
	} else {
		System.out.println("굿나잇");
	}
	
	int month = date.getMonth()+1;
	if (month==2) {
		System.out.println("28일까지");
	} else if (month==4 || month==6 || month==9 ||month==11) {
		System.out.println("30일까지");
	} else {
			System.out.println("31일까지");
		}
	}
	
	
	}


