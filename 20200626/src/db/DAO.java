package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class DAO {

	public void insert(String id,String pw, String name, String tel) throws Exception {
		
		//1.드라이버(커넥터) 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1..드라이버 설정 ok...");
		
		//2. db연결(shop,root,1234)
		String url="jdbc:mysql://localhost:3306/shop";
		String user="root";
		String password="1234";
		Connection con=DriverManager.getConnection(url,user,password);
		System.out.println("2..DB연결 ok....");
		
		//3. sql문 생성
		String sql="insert into member values(?,?,?,?)";
		
		//SQL문장을 담당하는 객체로 만들어줘야 자바는 인식한다.
		PreparedStatement ps=con.prepareStatement(sql);  
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		
		System.out.println("3.. SQL문 생성 ok...");
		
		//4. sql문 전송
		ps.executeUpdate();
		System.out.println("4..SQL문 전송 ok..");
		ps.close();
		con.close();
		
	}



public void delete(String id) throws Exception {
	
	//1.드라이버(커넥터) 설정
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("1..드라이버 설정 ok...");
	
	//2. db연결(shop,root,1234)
	String url="jdbc:mysql://localhost:3306/shop";
	String user="root";
	String password="1234";
	Connection con=DriverManager.getConnection(url,user,password);
	System.out.println("2..DB연결 ok....");
	
	//3. sql문 생성
	String sql="delete from member where id= ?";
	
	//SQL문장을 담당하는 객체로 만들어줘야 자바는 인식한다.
	PreparedStatement ps=con.prepareStatement(sql);  
	ps.setString(1, id);
	
	System.out.println("3.. SQL문 생성 ok...");
	
	//4. sql문 전송
	ps.executeUpdate();
	System.out.println("4..SQL문 전송 ok..");
	ps.close();
	con.close();
	
}

}
