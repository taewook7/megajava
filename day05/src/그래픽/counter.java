package �׷���;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class counter {
	static int count =0;  //������ �� ���� static�� �־��ش�.. 

	public static void main(String[] args) {
		
		
		//��ü Ʋ ��ǰ ����
		//��ư 2�� ��ǰ ����
		//�� ��ǰ ���� => �۾��� ���� �� ��� 
		
		JFrame f=new JFrame();   // f= ��ǰ �ڿ��� ������ 
		f.setSize(300, 310);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JButton plus=new JButton("�� �� ��");
		JButton minus=new JButton("���̳ʽ�");
		
		JLabel number= new JLabel("0");
		
		f.add(plus);
		f.add(number);
		f.add(minus);
		minus.setBackground(Color.orange);
		plus.setBackground(Color.yellow);
		Font font = new Font("�ü�", Font.BOLD, 100);
		number.setFont(font);
		Font font2 = new Font("�ü�", Font.BOLD, 50);
		minus.setFont(font2);
		plus.setFont(font2);
		
		minus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("���̳ʽ� ��ư ����.");
				count--;
				System.out.println("count: " + count);
				number.setText(count+""); //�ϳ��� ��Ʈ���� �������� �ڵ���Ʈ���Ǽ� �Ϻη� �ڿ� ���龴����
			}
		}); //��׼����Ҷ� ó���� 
		plus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("�÷��� ��ư ����.");
				System.out.println("count: " + count);
				number.setText(count+"");
				count++;
			}
		});
		
		f.setVisible(true); // �׻� �ǳ��� �;��� �̹�����!!! 
	}

}
