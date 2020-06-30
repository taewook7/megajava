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
		setTitle("게시판");
		setSize(500, 700);
 
		
		
		JLabel l1 = new JLabel("나의 게시판");
		JLabel l2 = new JLabel("게시판 ID");
		JLabel l3= new JLabel("게시판 제목");
		JLabel l4 = new JLabel("게시판 내용");
		JLabel l5 = new JLabel("게시판 작성자");
		
		Font font1 = new Font("궁서체",Font.BOLD,65);
		Font font2 = new Font("궁서체",Font.BOLD,30);
		
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
		
		JButton b = new JButton ("게시물 작성완료");
		JButton b2 = new JButton ("게시물 삭제완료");
		JButton b3 = new JButton ("게시물 검색완료");
		
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
				//입력한값 가지고 와서 DAO 에 처리하도록 전달 
				String id = t1.getText();
				String title = t2.getText();
				String content = t3.getText();
				String writer = t4.getText();
				// DAo 에 처리하도록 전달
				BbsDAO dao = new BbsDAO();
				
				//가방을 만든 이유는 ? 넣을떄는 set메소드를 이용했고 
				// 붙일때는 get 을 이용했는데 왜만들었냐? 
				// 많은 양의 데이터를 가방에 넣어서 전달하려고 만듬 
				//가방 역할의 클래스를 Data Transfer Object 라고 한다 DTO 
				//DTO, 값만 넣었다 뺐다 한다고해서 VALUE Object 라고 부른다 짧게(vo)

				
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
				// DAo 에 처리하도록 전달
				BbsDAO dao = new BbsDAO();
				dao.delete(id);
				
				
				
			}
		});
		
		b3.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						String id = t1.getText();
						// DAo 에 처리하도록 전달
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
