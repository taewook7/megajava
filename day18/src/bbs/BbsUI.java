package bbs;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BbsUI extends JFrame {
	public BbsUI() {
		setTitle("�Խ���");
		setSize(500, 700);
 
		
		
		JLabel l1 = new JLabel("���� �Խ���");
		JLabel l2 = new JLabel("�Խ��� ID");
		JLabel l3= new JLabel("�Խ��� ����");
		JLabel l4 = new JLabel("�Խ��� ����");
		JLabel l5 = new JLabel("�Խ��� �ۼ���");
		
		Font font1 = new Font("�ü�ü",Font.BOLD,65);
		Font font2 = new Font("�ü�ü",Font.BOLD,30);
		
		FlowLayout flow = new FlowLayout();
		l1.setFont(font1);
		l2.setFont(font2);
		l3.setFont(font2);
		l4.setFont(font2);
		l5.setFont(font2);
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);
		t1.setFont(font2);
		t2.setFont(font2);
		t3.setFont(font2);
		t4.setFont(font2);
		setLayout(flow);
		
		JButton b = new JButton ("�Խù� �ۼ��Ϸ�");
		JButton b2 = new JButton ("�Խù� �����Ϸ�");
		JButton b3 = new JButton ("�Խù� �˻��Ϸ�");
		
		b.setFont(font2);
		b2.setFont(font2);
		b3.setFont(font2);
		add(l1);
		add(l2);
		add(t1);
		add(l3);
		add(t2);
		add(l4);
		add(t3);
		add(l5);
		add(t4);
		add(b);
		add(b2);
		add(b3);
		
		getContentPane().setBackground(Color.green);
		b.setBackground(Color.yellow);
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//�Է��Ѱ� ������ �ͼ� DAO �� ó���ϵ��� ���� 
				String id = t1.getText();
				String title = t2.getText();
				String content = t3.getText();
				String writer = t4.getText();
				// DAo �� ó���ϵ��� ����
				BbsDAO dao = new BbsDAO();
				
				//������ ���� ������ ? �������� set�޼ҵ带 �̿��߰� 
				// ���϶��� get �� �̿��ߴµ� �ָ������? 
				// ���� ���� �����͸� ���濡 �־ �����Ϸ��� ���� 
				//���� ������ Ŭ������ Data Transfer Object ��� �Ѵ� DTO 
				//DTO, ���� �־��� ���� �Ѵٰ��ؼ� VALUE Object ��� �θ��� ª��(vo)

				
				BbsBag bag = new BbsBag();
				bag.setId(id);
				bag.setTitle(title);
				bag.setContent(content);
				bag.setWriter(writer);
				
				dao.create(bag);

			}
		});
		
		setVisible(true);
		
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				// DAo �� ó���ϵ��� ����
				BbsDAO dao = new BbsDAO();
				dao.delete(id);
				
				
				
			}
		});
		
		b3.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						String id = t1.getText();
						// DAo �� ó���ϵ��� ����
						BbsDAO dao = new BbsDAO();
						BbsBag bag=dao.read(id);
						t1.setText(bag.getId());
						t2.setText(bag.getTitle());
						t3.setText(bag.getContent());
						t4.setText(bag.getWriter());
						t1.setForeground(Color.red);
						t2.setForeground(Color.red);
						t3.setForeground(Color.red);
						t4.setForeground(Color.red);
						
						
						
					}
				});
		
	}
	

	
	
	
	
	
	
	
	public static void main(String[] args) {
	new BbsUI();
		
		
		
		
		
		
		
		
	}

}
