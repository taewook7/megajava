package 크롤링;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링3 {

	public static void main(String[] args)  {
		//반드시 예외처리해야되는 경우
		//
		
		String[] codes = {"068270", "009150","028260"};
		for (int i = 0; i < codes.length; i++) {
			Document doc = null; //지역변수(local변수), 쓰레기값 , 수동으로 초기화해줘야함
			try {
				doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=" + codes[i]).get();
			} catch (IOException e) {
				System.out.println("크롤링 하는 중 에러발생함. 수정필요.");
			}

			
			Elements list = doc.select(".code");
			String code = list.get(0).text();
			System.out.println("코드: " + code);
			
			Elements list2 = doc.select(".wrap_company a");
			String name = list2.get(0).text();
			System.out.println("회사명: " + name);
			
			Elements list3 = doc.select("span.blind");
			System.out.println(list3);
			String now= list3.get(12).text();
		
			System.out.println("현재가: " + now);	
			
			String now2= list3.get(16).text();
			System.out.println("시가: " + now2);
			
			
			System.out.println("------------------");
			

			
			
			
			
		}
		
	}
}
