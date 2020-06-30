package bbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BbsDAO {
	public void create(BbsBag bag) {
		try {
			System.out.println("�Խù� db�� ����ó����.");
			//�Է°� �Ѿ���� DBó������ 
			// 1. ����̹� ����
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. ����̹� ���� ����");
			// 2. DB����
			String url = "jdbc:mysql://localhost:3366/shop";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB���� ����....");
			// 3. SQL �ۼ�
			
			String sql="insert into bbs values (?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);  //SQL�� ��Ÿ���� ��ǰ�� 
			ps.setString(1,  bag.getId());  //1�� ����ǥ���� id ����� 
			ps.setString(2, bag.getTitle());  //2���ڸ����� Ÿ��Ʋ�� �� 
			ps.setString(3,bag.getContent()); 
			ps.setString(4, bag.getWriter());
			System.out.println("3. SQL�ۼ� ����....");		
			
			
			// 4. SQL ����
			ps.executeUpdate();
			System.out.println("4.. SQL���� ����....");
			
			
			
		} catch (Exception e) {
		}
		
	
		
		
	}
	
	
	public BbsBag read(String id) {
		
		BbsBag bag = null;	
		try {
			System.out.println("�Խù� db�� �б�ó����.");
			//�Է°� �Ѿ���� DBó������ 
			// 1. ����̹� ����
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. ����̹� ���� ����");
			// 2. DB����
			String url = "jdbc:mysql://localhost:3366/shop";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB���� ����....");
			// 3. SQL �ۼ�
			
			String sql= "select * from bbs where id= (?)";
			PreparedStatement ps = con.prepareStatement(sql);  //SQL�� ��Ÿ���� ��ǰ�� 
			
			ps.setString(1,  id); 
			System.out.println("3. SQL�ۼ� ����....");		
			
			
			// 4. SQL ������ �˻������ �����������
			ResultSet rs=ps.executeQuery();
			System.out.println("4.. SQL���� ����....");
			

			if (rs.next()) { // ������ true ������ false
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
		
			System.out.println("�Խù� db�� ����ó����.");
	}
	
	public void delete(String id) {
		try {
		System.out.println("�Խù� db�� ����ó����.");
		//�Է°� �Ѿ���� DBó������ 
		// 1. ����̹� ����
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. ����̹� ���� ����");
		// 2. DB����
		String url = "jdbc:mysql://localhost:3366/shop";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB���� ����....");
		// 3. SQL �ۼ�
		
		String sql="delete from bbs where id = (?)";
		PreparedStatement ps = con.prepareStatement(sql);  //SQL�� ��Ÿ���� ��ǰ�� 
		ps.setString(1,  id);  //1�� ����ǥ���� id ����� 
		System.out.println("3. SQL�ۼ� ����....");		
		
		
		// 4. SQL ����
		ps.executeUpdate();
		System.out.println("4.. SQL���� ����....");
		
		
		
		
		} catch (Exception e) {
		}
		
	}
}
