package ������;

import java.util.Date;

import javax.swing.JOptionPane;

public class DateTest {

	public static void main(String[] args) {
	Date date=new Date();   
	//����� ����
	//�� �� ��
	int year =date.getYear()+1900;   // ��� �� �׾��� ������ ��Ŭ������ ���ž���� �����ϴ°�  
//��������ٷ� �׾��������� �̰� �־Ƚ��� ? ���ǰ�� �޽��� 
	int month=date.getMonth()+1;
	int daily=date.getDate();
	int day=date.getDay();
	
	//JOptionPane.showMessageDialog(null, year+"��"+month+"��"+daily+"��"+day+"����");
	System.out.println(day);
	if (day==0 || day == 6) { // �����,�Ͽ����̸�,
		System.out.println("������ź��.");
	} else if (day==1) {
		System.out.println("��ȭ������");
	}else if (day==2) {
		System.out.println("����������.");
	}else {
		System.out.println("���θ��Ѵ�.");
	}
	
	
	
	int hour = date.getHours();
	int min= date.getMinutes();
	int sec=date.getSeconds();
	
	
	
	}

}
