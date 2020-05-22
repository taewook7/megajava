package 그래픽;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class counter {
	static int count =0;  //밖으로 뺄 때는 static을 넣어준다.. 

	public static void main(String[] args) {
		
		
		//전체 틀 부품 복사
		//버튼 2개 부품 복사
		//라벨 부품 복사 => 글씨를 넣을 때 사용 
		
		JFrame f=new JFrame();   // f= 부품 뒤에껀 생성자 
		f.setSize(300, 310);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JButton plus=new JButton("플 러 스");
		JButton minus=new JButton("마이너스");
		
		JLabel number= new JLabel("0");
		
		f.add(plus);
		f.add(number);
		f.add(minus);
		minus.setBackground(Color.orange);
		plus.setBackground(Color.yellow);
		Font font = new Font("궁서", Font.BOLD, 100);
		number.setFont(font);
		Font font2 = new Font("궁서", Font.BOLD, 50);
		minus.setFont(font2);
		plus.setFont(font2);
		
		minus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("마이너스 버튼 누름.");
				count--;
				System.out.println("count: " + count);
				number.setText(count+""); //하나라도 스트링이 되있으면 자동스트링되서 일부로 뒤에 공백쓴거임
			}
		}); //어떤액션을할때 처리함 
		plus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("플러스 버튼 누름.");
				System.out.println("count: " + count);
				number.setText(count+"");
				count++;
			}
		});
		
		f.setVisible(true); // 항상 맨끝에 와야함 이문장은!!! 
	}

}
