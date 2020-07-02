package 정리문제;

public class TruckUser {

	public static void main(String[] args) {
		Truck truck=new CoffeeTruck();
		//조그만것(커피트럭) 이 더큰것(트럭) 에 들어갔다고해서 업캐스팅 이라고한다. (자동형변환) 
		//업캐스팅 , 부모(큰) <-- 자식(작)
		
//		Truck truck2=new CoffeeShop();  //오류~ 
		//캐스팅 관계는 상속관계에서만 할수 있다.. 
		
		CoffeeTruck coffee= (CoffeeTruck)truck;
		//다시 큰거를 작은것에 넣어주자.
		// 다운캐스팅, 자식(작은애) <-- 부모(큰)
		
	}

}
