package ��Ʈ��ũ;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws Exception {  // Exception �� ����ŭ ����ó������ִ°�
		//���ο� ������ �ʿ�
		//��Ʈ��ũ�� ���� �ܺο����� ������ ����ó��! �ؾ���
		//��ӻ���־���ϹǷ� ���ѷ����� ���ƾ��� 
		//��Ʈ�� ��������������, 5�ڸ��� ������ ��Ʈ�� ���� ����
		//2�ڸ������ǰ� 4�ڸ������� �ٵ� �Ϲ������� 5�ڸ� ���� 
		ServerSocket server = new ServerSocket(9100);
		System.out.println("���� ���� ���۵�..");
		System.out.println("Ŭ���̾�Ʈ�� ������ ��ٸ��� ��...");
	
		
		
		int count =0; //����� Ŭ���̾�Ʈ�� 
		while (true) {
			Socket socket = server.accept(); //������ ���޿� ������
			count++;
			System.out.println("Ŭ���̾�Ʈ�� ���� ����...!!!");
			System.out.println(count+ "�� �� Ŭ���̾�Ʈ�� ����");
		
		}
		
		
	}

}
