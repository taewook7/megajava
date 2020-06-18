package 다른회사;

import 우리회사.직원;

public class 직원사용 {

	public static void main(String[] args) {
		
		
		직원 e = new 직원();
		
		//보여지지않는것을 가시성이없다 라고 부른다 (visibility)
		//가시성은 접근제어자와 관련된 얘기다.
		System.out.println(e.name);  // 다른패키지에서도 보임 public 이라서~ 
//		System.out.println(e.salary);  여기패키지에서는 안먹힘 
//		System.out.println(e.address);  여기패키지에서는 안먹힘 
//		System.out.println(e.rrn);  rrn 은 보여지지않는다 
		
		
		
	}

}
