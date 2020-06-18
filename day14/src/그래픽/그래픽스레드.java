package 그래픽;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 그래픽스레드 extends JFrame{
	JLabel l1,l2,l3; //전역변수 //아무데나서나 쓸수있음  
	
	public 그래픽스레드() { //static 이없는 일단 메서드 
		setTitle("스레드 프로그래밍");
		l1 =new JLabel("1");
		l2 =new JLabel("2");
		l3 =new JLabel("3");
		
		
		
		
		
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		add(l1);
		add(l2);
		add(l3);
		
		Font font = new Font("궁서체",Font.BOLD,50);
		l1.setFont(font);
		l3.setFont(font);
		
		
		
		
		setSize(1000,300);
		
		카운터 counter = new 카운터();
		counter.start();
		시각 time = new 시각();
		time.start();
		배열스레 array = new 배열스레();
		array.start();
		
		getContentPane().setBackground(Color.green);
		
		
		ImageIcon icon = new ImageIcon("3.png");
		l2.setIcon(icon);
		
		
		setVisible(true);
	}
	//inner class 라고 부른다. (내부 클래스라고 부른다 클래스안에 클래스를 만든다)
	
	public class 카운터 extends Thread { 
		@Override
		public void run() {
			for (int i = 500; i >=0 ; i--) {
				l1.setText("카운터: "  + i);
				try {
					Thread.sleep(1000); // 외부자원을 연결했으므로 에러가뜬다 1000 이면 1초임  			
				} catch (Exception e) {
					// TODO: handle exception
				}  			
			}}
			}
	
	
	public class 시각 extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 500; i++) {
				//오늘 현재 날짜와시각 
				Date date = new Date();
				
				l3.setText("현재: "+date);
				try {
					Thread.sleep(1000); // 외부자원을 연결했으므로 에러가뜬다 1000 이면 1초임  			
				} catch (Exception e) {
					// TODO: handle exception
				}  			
			}
		
		}
	}
	
	
	public class 배열스레 extends Thread {
		String[] s= {"1.png","2.png","3.png","4.png","5.png"};
		@Override
		public void run() {
		for (int i = 0; i < s.length; i++) {
			ImageIcon icon = new ImageIcon("s[i]");
			l2.setIcon(icon);
			
			try {
				Thread.sleep(3000); // 외부자원을 연결했으므로 에러가뜬다 1000 이면 1초임  			
			} catch (Exception e) {
				// TODO: handle exception
			}  			
		}
		
		
		
		}
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		그래픽스레드 name = new 그래픽스레드();
		
	
		
		
	}

}
