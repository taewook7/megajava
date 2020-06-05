package 생성자;

public class 계좌 {
	String 이름;
	String 종류;
	int money;
	
	
	
	
	//기본 생성자, 명시적! 
	//파라미터가 있는 생성자가 하나도 없는 경우는 묵시적으로 자동생성이 됨. 
	//public : 접근 제어자
	//접근제어자는: public (제일넓음),protected(상속떄씀), default(기본값,안씀),private
	//디폴트는 같은 패키지내에서만 접근 가능~ 
	
	
	public 계좌() {

	}


	public 계좌(String 이름, String 종류) {
		super();
		this.이름 = 이름;
		this.종류 = 종류;
	}


	public 계좌(String 이름, String 종류, int money) {
		super();
		this.이름 = 이름;
		this.종류 = 종류;
		this.money = money;
	}
	
	
}
