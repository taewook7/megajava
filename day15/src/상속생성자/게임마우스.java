package ��ӻ�����;

public class ���Ӹ��콺 extends ���콺 {
	int speed;

	
	
	

	public ���Ӹ��콺(String color, String company, int price, int speed) {
		super(color, company, price);
		this.speed = speed;
	}





	@Override
	public String toString() {
		return "���Ӹ��콺 [speed=" + speed + ", color=" + color + ", company=" + company + ", price=" + price + "]";
	}
	
	
}
