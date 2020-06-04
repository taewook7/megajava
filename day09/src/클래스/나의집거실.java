package 클래스;

public class 나의집거실 {

	public static void main(String[] args) {
		Tv tv1 = new Tv(100,false); //지역변수, 초기화 되지않아요 
//		tv1.ch=100;
//		tv1.onoff=false;
		tv1.on();
		
		Tv tv2 = new Tv(0, false);
		tv1.ch=200;
		tv1.onoff=true;
		tv1.off();
		System.out.println(tv1);
		
		
		전화기 전화기1 = new 전화기();
		전화기 전화기2 = new 전화기();
		
		전화기1.색상="빨강";
		전화기1.울리다();
		System.out.println(전화기1.색상);
		
		전화기2.off = false;
		전화기1.on=true;
		System.out.println(전화기2.off);
		
		
	}

}
