package 복습;

import java.awt.Color;
import java.awt.Font;

public class Myroom {

	public static void main(String[] args) {
		Tv myTv = new Tv(7,9,true);
		Tv yourTv = new Tv(9,12,true);
		System.out.println(myTv);
		System.out.println(yourTv);
		
		for (int i = 0; i < 100; i++) {
			Tv tv = new Tv(1,1,true);
			
		}
		System.out.println(myTv.channel);
		System.out.println(yourTv.channel);
		System.out.println("객체 생성 개수는 "+Tv.count);
		System.out.println(Color.green);
		System.out.println(Font.BOLD);
		
		
		
	}

}
