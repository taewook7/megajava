package ���������;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class �ڵ������ְ���2 extends JFrame{
	public �ڵ������ְ���2() {
		setTitle("�ڵ������ְ���");
		setSize(1900, 400);
		//3���� ������ ��ü ����, start ��Ű�� ��. 
		MyThread car1 = new MyThread("�ڵ���1",100,0);
		MyThread car2 = new MyThread("�ڵ���2",100,50);
		MyThread car3 = new MyThread("�ڵ���3",100,100);
		MyThread car4 = new MyThread("�ڵ���4",100,150);
		MyThread car5 = new MyThread("�ڵ���5",100,200);
		MyThread car6 = new MyThread("�ڵ���6",100,250);
		car1.start();
		car2.start();
		car3.start();
		car4.start();
		car5.start();
		car6.start();
		setLayout(null); 
		setVisible(true);
	}
	
	public class MyThread extends Thread{  // �̳�Ŭ����(Ŭ�����ȿ�Ŭ����)
		int x, y;
		
		JLabel label;
		
		public MyThread(String file, int x, int y) {
			this.x=x;
			this.y=y;
			label=new JLabel(file); 
		//1������ ���� 1�� �������� ����
//			label =new JLabel(icon);
			label.setBounds(x, y,100, 100);
			add(label);
		}
		@Override
			public void run()  {
				for (int i = 0; i < 200; i++) {
					//0~0.99999�� ���� 10�� ��������� 
					x += 10*Math.random();
					System.out.println("����� x�� ��ǥ");
					label.setBounds(x, y,100, 100);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				}

			}
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		new �ڵ������ְ���2(); 
	//��ü�� ��������µ� �̸��� ������������ = �͸�Ŭ���� ����Ѵ�.
	
	}

}
