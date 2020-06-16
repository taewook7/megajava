package 전달용클래스;

import java.util.Scanner;

public class 회원가입 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("회원id: ");
		String id=sc.next();
		
		System.out.println("회원pw: ");
		String pw=sc.next();
		
		System.out.println("회원name: ");
		String name=sc.next();
		
		System.out.println("회원tel: ");
		String tel=sc.next();
		
		MemberDAO dao = new MemberDAO();
		
		MemberDTO bag = new MemberDTO();
		bag.setId(id);
		bag.setPw(pw);
		bag.setName(name);
		bag.setTel(tel);
		
		
		
		dao.insert(bag);
		
	}

}
