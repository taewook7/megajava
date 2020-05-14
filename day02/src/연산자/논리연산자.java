package 연산자;

public class 논리연산자 {

	public static void main(String[] args) {
		// 논리적인 판단을 하려고 할 때 
		// 조건이 2개 이상인 경우.
		// 조건이 2개다 만족해야하는지: and조건 (&&)   ex) 로그인처리 (아이디,비번 둘다맞아야함) 
		// 조건이 2개 중 하나만 만족해도 괜찮은지 : or조건 (||)
		int id=1111;  //회원가입시 id 
		int pw=2222;
		int id2=1000;  // 입력한id
		int pw2=2222;
		// 비교연산자는 기본데이터만 비교가능!  정수,실수,문자,논리  
		// 부품(class) 는 비교연산자 사용 불가! 
		
		if ( id == id2 && pw==pw2 ) {          // 기본형은 비교연산자를 쓸수있어서 == 쓸수있음 
			System.out.println("로그인성공");
		} else {
			System.out.println("로그인실패..!");
		}
		
		
		
	}

}
