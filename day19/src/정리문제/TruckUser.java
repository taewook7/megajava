package ��������;

public class TruckUser {

	public static void main(String[] args) {
		Truck truck=new CoffeeTruck();
		//���׸���(Ŀ��Ʈ��) �� ��ū��(Ʈ��) �� ���ٰ��ؼ� ��ĳ���� �̶���Ѵ�. (�ڵ�����ȯ) 
		//��ĳ���� , �θ�(ū) <-- �ڽ�(��)
		
//		Truck truck2=new CoffeeShop();  //����~ 
		//ĳ���� ����� ��Ӱ��迡���� �Ҽ� �ִ�.. 
		
		CoffeeTruck coffee= (CoffeeTruck)truck;
		//�ٽ� ū�Ÿ� �����Ϳ� �־�����.
		// �ٿ�ĳ����, �ڽ�(������) <-- �θ�(ū)
		
	}

}
