package 순차문;

import java.util.Date;

import javax.swing.JOptionPane;

public class DateTest {

	public static void main(String[] args) {
	Date date=new Date();   
	//년월일 요일
	//시 분 초
	int year =date.getYear()+1900;   // 가운데 쭉 그어진 이유는 이클립스가 새거쓰라고 권유하는거  
//노란색밑줄로 그어진이유는 이거 왜안썼지 ? 주의경고 메시지 
	int month=date.getMonth()+1;
	int daily=date.getDate();
	int day=date.getDay();
	
	//JOptionPane.showMessageDialog(null, year+"년"+month+"월"+daily+"일"+day+"요일");
	System.out.println(day);
	if (day==0 || day == 6) { // 토요일,일요일이면,
		System.out.println("자전거탄다.");
	} else if (day==1) {
		System.out.println("영화를본다");
	}else if (day==2) {
		System.out.println("집에서쉰다.");
	}else {
		System.out.println("공부를한다.");
	}
	
	
	
	int hour = date.getHours();
	int min= date.getMinutes();
	int sec=date.getSeconds();
	
	
	
	}

}
