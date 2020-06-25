package db;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class DB연결3 {

	public static void main(String[] args) throws Exception {
		
		// 1~3번과정을 묶어놓은 것을  google myBatis
		// 
		// 1. 드라이버(커넥터) 설정 
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 설정 ok....");
		
		
		// 2. db연결(shop, root, 1234)
		String url="jdbc:mysql://localhost:3366/shop";   //ip를 연결해주어야함 우리는 우리꺼니까 로컬호스트
		String user="root";
		String password="1234";
		Connection con =DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 ok....");
		
		
		// 3. sql문 생성
		String id=JOptionPane.showInputDialog("id");
		String pw=JOptionPane.showInputDialog("pw");
		String name=JOptionPane.showInputDialog("name");
		String tel=JOptionPane.showInputDialog("tel");
		
		String sql= "insert into member values (?,?,?,?)";
//		String sql="delete from member where id= '700' ";
		
		//SQL문장을 담당하는 객체로 만들어줘야 자바는 인식한다. 
		PreparedStatement ps=con.prepareStatement(sql);   //35행이랑 30~33행이랑 매칭시켜줌
		ps.setString(1, id); // 유일하게 인덱스가 1로 시작함 배열은 0 
		ps.setString(2, pw); // 유일하게 인덱스가 1로 시작함 배열은 0 
		ps.setString(3, name); // 유일하게 인덱스가 1로 시작함 배열은 0 
		ps.setString(4, tel); // 유일하게 인덱스가 1로 시작함 배열은 0 
 		System.out.println("3. SQL문 생성 ok...");
		
		// 4. sql문 전송
		ps.executeUpdate();
		System.out.println("4. SQL문 전송 ok....");
		
		
	}

}
