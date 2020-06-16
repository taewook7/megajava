package 복습;

public class Account {
	String no; //계좌번 호
	String name; //계좌이름
	int money; //초기 입금액
	
		//객체 생성시 자동호출되는 메소드: 생성자 메소드
		//입력값에 따라 메소드가 호출된다.
		//파라메터 있는 생성자를 만들어놓으면
		//객체 생성시 반드시 필요한 항목들을 지정할 수 있다.
		//멤버변수에 값을 넣을때는 생성자를 사용.!! 
	
	public Account(String no, String name, int money) {
		//super(); //default! 
		//super를 쓸때는 맨위에 오게 해야함.
		
		this.no = no;
		this.name = name;
		this.money = money;
	}

	
		//멤버변수의 값을 출력할때는 toString을 사용!!! 
	@Override
	public String toString() {
		return "Account [no=" + no + ", name=" + name + ", money=" + money + "]";
	}
	
	
	
	
	
	
	
}
