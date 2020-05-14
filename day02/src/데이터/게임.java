package 데이터;

public class 게임 {

	public static void main(String[] args) {
		//선언의 위치가 생존의범위. 
		
		
		int x = 300;

		int move = 50;
		x= x-move; // 뒤에서부터 읽어서 x에 넣는다.
		System.out.println("움직인 x자리값 "+x);
		x= x-move;
		System.out.println("움직인 x자리값 "+x);
		
		
		long a = 222222222222L;
		float weight =5.5f;  //나 소수점 첫째 자리 까지만 쓸거다 라고해서 f 로 마감표시를 해준다. 실무에서는 줄이는게 중요
		short book=300;
		
		
	}

}
