package 순차문;

import javax.swing.JOptionPane;

public class 성인판별 {

	public static void main(String[] args) {
		//이름을 입력해서, 출력.
		String name = JOptionPane.showInputDialog("이름을 입력하세요.");
		String age = JOptionPane.showInputDialog("나이를 입력하세요.");  //외부에서 가져올땐 전부 String 
		
		// age를 int 로 바꿔줘야함
		int age2= Integer.parseInt(age);   //pasre=분석하다  분석해서 괜찮으면 int로 바꿀게 
		
		JOptionPane.showMessageDialog(null, "당신의 이름은 " +name);
		JOptionPane.showMessageDialog(null, "당신의 나이는 "+age2);
		//조건문
		if (age2>=18) {
		//	System.out.println(name + "님은 성인입니다");
			JOptionPane.showMessageDialog(null, name+ "님은 성인입니다.");
		} else {
//			System.out.println(name + "님은 성인이 아닙니다.");
			JOptionPane.showMessageDialog(null, name+ "님은 미성년자입니다.");

		}
	
	}

}
