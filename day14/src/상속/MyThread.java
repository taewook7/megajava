package 상속;

public class MyThread {

	public static void main(String[] args) {
		Star star = new Star();
		Dia dia = new Dia();
		
		
		//동시에 실행하라고 cpu에 알려줘야 한다.
		
		
		star.start();
		dia.start();
		
		
	
		
		
	}

}
