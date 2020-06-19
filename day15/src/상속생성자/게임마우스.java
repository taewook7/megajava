package 상속생성자;

public class 게임마우스 extends 마우스 {
	int speed;

	
	
	

	public 게임마우스(String color, String company, int price, int speed) {
		super(color, company, price);
		this.speed = speed;
	}





	@Override
	public String toString() {
		return "게임마우스 [speed=" + speed + ", color=" + color + ", company=" + company + ", price=" + price + "]";
	}
	
	
}
