	package 네트워크;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 메신저A extends JFrame {
	//클래스내 아무곳에서나 사용가능(전역변수) 
	//전역변수로 선언!! 글로벌하게 써야하므로 이곳저곳에서 써야해서  
	//전역변수는 참조형이므로 자동으로 널로 초기화됨 
	JTextArea list;
	JTextField input; //입력하는곳
	DatagramSocket socket;
	//여기까지 변수를 쓸수있는 공간을 만들어준거임! 이제값을 넣어주야야함.
	
	
	
	
	public 메신저A() throws Exception { //생성자메서드 
		socket = new DatagramSocket(5000);
		
		setTitle("메신저 A");
		
		list=new JTextArea(15, 40); //6줄 이고 1줄에 20글자까지 가능 
		input =new JTextField();
		add(list, BorderLayout.CENTER);  //가운데에 넣는다. 
		add(input, BorderLayout.SOUTH); // 아래쪾에 넣는다
		
		pack(); //찌그러져서 나오는걸 방지하려면 
		list.setEditable(false);  // 글씨가안들어가게해준다. 
		list.setBackground(Color.blue);
		list.setForeground(Color.green);
		
		input.setBackground(Color.red);
		input.setForeground(Color.yellow);
		Font font= new Font("궁서체",Font.BOLD,30);
		list.setFont(font);
		input.setFont(font);
		input.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//입력값한 값을 가지고 온다.
				String str=input.getText();
				
				//리스트에 보여지게 올려주고, ex)카톡계속 쌓이듯이
				list.append("A가 입력>> " + str+ "\n");
				input.setText("");
				
				
				//상대방에 보내는 처리 
				DatagramSocket socket;
				try {
					socket = new DatagramSocket();
					byte[] data = str.getBytes();  //바이트 단위로 바꿔서들어가야함 데이터에 
					InetAddress ip = InetAddress.getByName("127.0.0.1"); //아이피를넣어야함
					DatagramPacket packet = new DatagramPacket(data, data.length, ip, 6000);
					socket.send(packet); //보내는거
					socket.close();
				} catch (Exception e1) {
					e1.printStackTrace();
				} //보내는 소켓 
			
				
				
				
				
				
			}
		});
		
		
		setVisible(true);
	}
	
	
	//받는역할을하는 프로세스 만들자 
	public void process () throws Exception {   //일반메서드는 스태틱메서드에서 부를수없음 
 		while (true) { //받아서 리스트에 올리고 올리고 계속 반복 
			//상대방이 보낸 텍스트를 소켓으로 부분 
 			byte[] data= new byte[256];
 			DatagramPacket packet = new DatagramPacket(data,data.length); //받을때는 데이터만 받으면 됨~
 			socket.receive(packet);
 			list.append("B가 입력>> " +new String(data) + "\n");
 			
		}
	}
	public static void main(String[] args)  {
		try {
			메신저A m = new 메신저A();
			m.process();  // 이렇게해야 일반메서드를 호출할수있음 일반메서드는 반드시 이렇게호출해줘야함 .
			//일반메서드는 무조건객체생성후 호출해줘야함. 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
