package 우리회사;

public class 직원사용 {

	public static void main(String[] args) {
		직원 e = new 직원();
		
		//보여지지않는것을 가시성이없다 라고 부른다 (visibility)
		//가시성은 접근제어자와 관련된 얘기다.
		System.out.println(e.name);
		System.out.println(e.salary);
		System.out.println(e.address);
//		System.out.println(e.rrn);  rrn 은 보여지지않는다 
		
		
		
	}

}
