package ����ó��;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ��������ó��1 {

	public static void main(String[] args) {
		// ���� �����
		Scanner sc = new Scanner(System.in);
		System.out.println("���ó�¥:");
		String day=sc.next();
		
		System.out.println("�ϱ�����:");
		String title=sc.next();
		
		System.out.println("�ϱ⳻��: ");
		String content=sc.next();
		
		FileWriter file= null;  //����! �̋� ���� ������� �Ҵ�ȴ�. 
		//������ ��ġ�� ����� �� �ִ� ���� ! 
		//��������, �ʱ�ȭ�� ���� ����.
		//�������� ��� null �� �ʱ�ȭ �����ش�.! 
		
		
		
		try {
			file = new FileWriter(day + ".txt");
			file.write(day+"\n");
			file.write(title+"\n");
			file.write(content+"\n");
			
		} catch (IOException e) {	  //������������ �ؼ� 
			System.out.println("���Ϸ� ����� ������ �߻���. ����ϰ� ó����.");
		} catch (Exception e) {  //ū������ ����.  
			System.out.println("���� ����� �̿��� ������ �߻���. ����ϰ� ó����.");
			
		} finally {
			//�ݵ�� ó���ؾ��� ������ ������ �־��ּ���.
			//�����߻� ������ ������� ������ ó���ؾ��ϴ� �ڵ�
		try {
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		}
	}
}
