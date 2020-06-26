package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class DAO {

	public void insert(String id,String pw, String name, String tel) throws Exception {
		
		//1.����̹�(Ŀ����) ����
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1..����̹� ���� ok...");
		
		//2. db����(shop,root,1234)
		String url="jdbc:mysql://localhost:3306/shop";
		String user="root";
		String password="1234";
		Connection con=DriverManager.getConnection(url,user,password);
		System.out.println("2..DB���� ok....");
		
		//3. sql�� ����
		String sql="insert into member values(?,?,?,?)";
		
		//SQL������ ����ϴ� ��ü�� �������� �ڹٴ� �ν��Ѵ�.
		PreparedStatement ps=con.prepareStatement(sql);  
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		
		System.out.println("3.. SQL�� ���� ok...");
		
		//4. sql�� ����
		ps.executeUpdate();
		System.out.println("4..SQL�� ���� ok..");
		ps.close();
		con.close();
		
	}



public void delete(String id) throws Exception {
	
	//1.����̹�(Ŀ����) ����
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("1..����̹� ���� ok...");
	
	//2. db����(shop,root,1234)
	String url="jdbc:mysql://localhost:3306/shop";
	String user="root";
	String password="1234";
	Connection con=DriverManager.getConnection(url,user,password);
	System.out.println("2..DB���� ok....");
	
	//3. sql�� ����
	String sql="delete from member where id= ?";
	
	//SQL������ ����ϴ� ��ü�� �������� �ڹٴ� �ν��Ѵ�.
	PreparedStatement ps=con.prepareStatement(sql);  
	ps.setString(1, id);
	
	System.out.println("3.. SQL�� ���� ok...");
	
	//4. sql�� ����
	ps.executeUpdate();
	System.out.println("4..SQL�� ���� ok..");
	ps.close();
	con.close();
	
}

}
