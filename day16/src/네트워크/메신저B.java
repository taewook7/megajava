	package ��Ʈ��ũ;

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

public class �޽���B extends JFrame {
	//Ŭ������ �ƹ��������� ��밡��(��������) 
	//���������� ����!! �۷ι��ϰ� ����ϹǷ� �̰��������� ����ؼ�  
	//���������� �������̹Ƿ� �ڵ����� �η� �ʱ�ȭ�� 
	JTextArea list;
	JTextField input; //�Է��ϴ°�
	DatagramSocket socket;
	//������� ������ �����ִ� ������ ������ذ���! �������� �־��־߾���.
	
	
	
	
	public �޽���B() throws Exception { //�����ڸ޼��� 
		socket = new DatagramSocket(6000);
		
		setTitle("�޽��� B");
		
		list=new JTextArea(15, 40); //6�� �̰� 1�ٿ� 20���ڱ��� ���� 
		input =new JTextField();
		add(list, BorderLayout.CENTER);  //����� �ִ´�. 
		add(input, BorderLayout.SOUTH); // �Ʒ��U�� �ִ´�
		
		pack(); //��׷����� �����°� �����Ϸ��� 
		list.setEditable(false);  // �۾����ȵ������ش�. 
		list.setBackground(Color.pink);
		list.setForeground(Color.green);
		
		input.setBackground(Color.red);
		input.setForeground(Color.yellow);
		Font font= new Font("�ü�ü",Font.BOLD,30);
		list.setFont(font);
		input.setFont(font);
		input.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//�Է°��� ���� ������ �´�.
				String str=input.getText();
				
				//����Ʈ�� �������� �÷��ְ�, ex)ī���� ���̵���
				list.append("B�� �Է�>> " + str+ "\n");
				input.setText("");
				//���濡 ������ ó�� 
				DatagramSocket socket;
				try {
					socket = new DatagramSocket();
					byte[] data = str.getBytes();  //����Ʈ ������ �ٲ㼭������ �����Ϳ� 
					InetAddress ip = InetAddress.getByName("127.0.0.1"); //�����Ǹ��־����
					DatagramPacket packet = new DatagramPacket(data, data.length, ip, 5000);
					socket.send(packet); //�����°�
					socket.close();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} //������ ���� 
			
				
				
				
				
				
			}
		});
		
		
		setVisible(true);
	}
	
	
	//�޴¿������ϴ� ���μ��� ������ 
	public void process () throws Exception {   //�Ϲݸ޼���� ����ƽ�޼��忡�� �θ������� 
 		while (true) { //�޾Ƽ� ����Ʈ�� �ø��� �ø��� ��� �ݺ� 
			//������ ���� �ؽ�Ʈ�� �������� �κ� 
 			byte[] data= new byte[256];
 			DatagramPacket packet = new DatagramPacket(data,data.length); //�������� �����͸� ������ ��~
 			socket.receive(packet);
 			list.append("A�� �Է�>> " +new String(data) + "\n");
 			
		}
	}
	public static void main(String[] args)  {
		try {
			�޽���B m = new �޽���B();
			m.process();  // �̷����ؾ� �Ϲݸ޼��带 ȣ���Ҽ����� �Ϲݸ޼���� �ݵ�� �̷���ȣ��������� .
			//�Ϲݸ޼���� �����ǰ�ü������ ȣ���������. 
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
