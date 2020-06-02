package 클래스;

public class 내방 {

	public static void main(String[] args) {
		강아지 강1 = new 강아지();
		강아지 강2 = new 강아지();
		강1.color="황색";
		강2.color="녹색";
		강1.name="메리";
		강2.name="뚜비";
		강1.bark();   // 함수사용! 
		강1.shake();
		System.out.println("이름은 "+강1.name + "색깔은 "+강1.color);
		System.out.println("이름은 " +강2.name + "색깔은 " + 강2.color);
		
		사람  사람1 = new 사람 ();
		사람1.name="지수";
		사람1.read();
		사람1.haircolor="갈색";
		System.out.println("이름은 "+사람1.name + " 그리고 머리색갈은" + 사람1.haircolor  );
		
		TV tv = new TV();
		tv.on();
		
		
		
	}

	
}
