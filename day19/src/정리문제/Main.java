package 정리문제;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//1.create
		System.out.println("id입력>> ");
		String id= sc.next();
		
		System.out.println("pw입력>> ");
		String pw= sc.next();
		
		//db처리(dao)
		
		
		DAOinterface dao = new DAOinterface() {
			
			@Override
			public void update(String id, String pw) {
				System.out.println(id + "의 비밀번호가" + pw +"로변경되었습니다.");
			}
			
			@Override
			public void read(String id) {
				System.out.println(id+ "의 비밀번호가 1234 입니다.");
			}
			
			@Override
			public void delete(String id) {
				System.out.println(id+"가 삭제되었습니다.");
				
			}
			
			@Override
			public void create(String id, String pw) {
				System.out.println(id + ", "+pw+"로 가입완료!");
				
			}
		};
		dao.create(id, pw);
		dao.update(id, pw);
		dao.read(id);
		dao.delete(id);
		
		
		
		
	}

}
