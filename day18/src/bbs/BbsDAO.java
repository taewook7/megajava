package bbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BbsDAO {
	public void create(BbsBag bag) {
		try {
			System.out.println("게시물 db에 저장처리됨.");
			//입력값 넘어오면 DB처리하자 
			// 1. 드라이버 설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공");
			// 2. DB연결
			String url = "jdbc:mysql://localhost:3366/shop";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB연결 성공....");
			// 3. SQL 작성
			
			String sql="insert into bbs values (?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);  //SQL문 나타내는 부품임 
			ps.setString(1,  bag.getId());  //1번 물음표에는 id 갖고와 
			ps.setString(2, bag.getTitle());  //2번자리에는 타이틀이 들어감 
			ps.setString(3,bag.getContent()); 
			ps.setString(4, bag.getWriter());
			System.out.println("3. SQL작성 성공....");		
			
			
			// 4. SQL 전달
			ps.executeUpdate();
			System.out.println("4.. SQL전달 성공....");
			
			
			
		} catch (Exception e) {
		}
		
	
		
		
	}
	
	
	public BbsBag read(String id) {
		
		BbsBag bag = null;	
		try {
			System.out.println("게시물 db에 읽기처리됨.");
			//입력값 넘어오면 DB처리하자 
			// 1. 드라이버 설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공");
			// 2. DB연결
			String url = "jdbc:mysql://localhost:3366/shop";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB연결 성공....");
			// 3. SQL 작성
			
			String sql= "select * from bbs where id= (?)";
			PreparedStatement ps = con.prepareStatement(sql);  //SQL문 나타내는 부품임 
			
			ps.setString(1,  id); 
			System.out.println("3. SQL작성 성공....");		
			
			
			// 4. SQL 전달후 검색결과를 가지고오야함
			ResultSet rs=ps.executeQuery();
			System.out.println("4.. SQL전달 성공....");
			

			if (rs.next()) { // 있으면 true 없으면 false
				bag =new BbsBag();
				String id2=rs.getString(1);
				String title=rs.getString(2);
				String content=rs.getString(3);
				String writer=rs.getString(4);
				
				bag.setId(id2);
				bag.setTitle(title);
				bag.setContent(content);
				bag.setWriter(writer);
				
			}
			
			
			} catch (Exception e) {
			}
		
		return bag;
	}
	
	public void update() {
		
			System.out.println("게시물 db에 수정처리됨.");
	}
	
	public void delete(String id) {
		try {
		System.out.println("게시물 db에 삭제처리됨.");
		//입력값 넘어오면 DB처리하자 
		// 1. 드라이버 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 설정 성공");
		// 2. DB연결
		String url = "jdbc:mysql://localhost:3366/shop";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 성공....");
		// 3. SQL 작성
		
		String sql="delete from bbs where id = (?)";
		PreparedStatement ps = con.prepareStatement(sql);  //SQL문 나타내는 부품임 
		ps.setString(1,  id);  //1번 물음표에는 id 갖고와 
		System.out.println("3. SQL작성 성공....");		
		
		
		// 4. SQL 전달
		ps.executeUpdate();
		System.out.println("4.. SQL전달 성공....");
		
		
		
		
		} catch (Exception e) {
		}
		
	}
}
