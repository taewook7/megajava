package db;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class DAO {

	public  void delete(String id) throws Exception {
		
		// 1~3�������� ������� ����  google myBatis
		// 
		// 1. ����̹�(Ŀ����) ���� 
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. ����̹� ���� ok....");
		
		
		// 2. db����(shop, root, 1234)
		String url="jdbc:mysql://localhost:3366/shop";   //ip�� �������־���� �츮�� �츮���ϱ� ����ȣ��Ʈ
		String user="root";
		String password="1234";
		Connection con =DriverManager.getConnection(url, user, password);
		System.out.println("2. DB���� ok....");
		
		
		// 3. sql�� ����
//		String id=JOptionPane.showInputDialog("id");
//		String pw=JOptionPane.showInputDialog("pw");
//		String name=JOptionPane.showInputDialog("name");
//		String tel=JOptionPane.showInputDialog("tel");
		
//		String sql= "insert into member values (?,?,?,?)";
		String sql="delete from member where id= ? ";
		
		
		//SQL������ ����ϴ� ��ü�� �������� �ڹٴ� �ν��Ѵ�. 
		PreparedStatement ps=con.prepareStatement(sql);   //35���̶� 30~33���̶� ��Ī������
		ps.setString(1, id); // �����ϰ� �ε����� 1�� ������ �迭�� 0 
//		ps.setString(2, pw); // �����ϰ� �ε����� 1�� ������ �迭�� 0 
//		ps.setString(3, name); // �����ϰ� �ε����� 1�� ������ �迭�� 0 
//		ps.setString(4, tel); // �����ϰ� �ε����� 1�� ������ �迭�� 0 
 		System.out.println("3. SQL�� ���� ok...");

		// 4. sql�� ����
		ps.executeUpdate();
		System.out.println("4. SQL�� ���� ok....");
		
		ps.close();
 		con.close();		
		
	}



public  void insert(String id,String pw,String name,String tel) throws Exception {
	
	// 1~3�������� ������� ����  google myBatis
	// 
	// 1. ����̹�(Ŀ����) ���� 
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("1. ����̹� ���� ok....");
	
	
	// 2. db����(shop, root, 1234)
	String url="jdbc:mysql://localhost:3366/shop";   //ip�� �������־���� �츮�� �츮���ϱ� ����ȣ��Ʈ
	String user="root";
	String password="1234";
	Connection con =DriverManager.getConnection(url, user, password);
	System.out.println("2. DB���� ok....");
	
	
	// 3. sql�� ����
//	String id=JOptionPane.showInputDialog("id");
//	String pw=JOptionPane.showInputDialog("pw");
//	String name=JOptionPane.showInputDialog("name");
//	String tel=JOptionPane.showInputDialog("tel");
	
	String sql= "insert into member values (?,?,?,?)";
//	String sql="delete from member where id= ? ";
	
	
	//SQL������ ����ϴ� ��ü�� �������� �ڹٴ� �ν��Ѵ�. 
	PreparedStatement ps=con.prepareStatement(sql);   //35���̶� 30~33���̶� ��Ī������
	ps.setString(1, id); // �����ϰ� �ε����� 1�� ������ �迭�� 0 
	ps.setString(2, pw); // �����ϰ� �ε����� 1�� ������ �迭�� 0 
	ps.setString(3, name); // �����ϰ� �ε����� 1�� ������ �迭�� 0 
	ps.setString(4, tel); // �����ϰ� �ε����� 1�� ������ �迭�� 0 
		System.out.println("3. SQL�� ���� ok...");

	// 4. sql�� ����
	ps.executeUpdate();
	System.out.println("4. SQL�� ���� ok....");
	
	ps.close();
		con.close();		
	
}

}
