package 정적멤버;

public class WorkerTest {

	public static void main(String[] args) {
		Worker wk1 = new Worker("임아무개","남",24);
		Worker wk2 = new Worker("김아무개","여",23);
		Worker wk3 = new Worker("박아무개","남",25);
		System.out.println(wk1);
		System.out.println(wk2);
		System.out.println(wk3);
		
		System.out.println("전체 직원수는 : " + Worker.count);
		System.out.println("직원들의 평균 나이는" +Worker.sumAge/Worker.count);
		
		
		System.out.println("전체 직원수는 " + Worker.getCount());
		System.out.println("평균 나이는 " + Worker.getSumAge()/Worker.getCount());
		
		
		
		
		
	}

}
