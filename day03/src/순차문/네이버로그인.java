package 순차문;

import javax.swing.JOptionPane;

public class 네이버로그인 {

	public static void main(String[] args) {
		String id = "root";  //회원가입했을 때의 id
		String id2= JOptionPane.showInputDialog("id를 입력하세요."); 
		
		System.out.println(id.equals(id2));
		if (id.equals(id2)) {
			System.out.println("로그인성공");
		} else {
			System.out.println("로그인실패");
		}
		
		String pw ="1111";
		String pw2 = "1111";
		
		if (id.equals(id2) && pw.equals(pw2)) {  // 이미앞에서 false 가 나와버렸으니 뒤에 계산은 하지도않는다.(연산의특징)
			System.out.println("로그인성공");
		} else {
			System.out.println("로그인실패");
		}
		
		
		
	}

}
