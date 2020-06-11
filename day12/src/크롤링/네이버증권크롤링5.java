package 크롤링;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링5 {

	public String[] naver(String data)  {
		//반드시 예외처리해야되는 경우
		//
		

		
			Document doc = null; //지역변수(local변수), 쓰레기값 , 수동으로 초기화해줘야함
			try {
				doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=" + data).get();
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
			String now= list3.get(12).text();
		
			System.out.println("현재가: " + now);	
			
			Elements list4 = doc.select("no_down");
			String now2= list3.get(12).text();
			System.out.println("시가: " + now2);
			
			
			System.out.println("------------------");
			
			String[] values = {now,now2};
			return values;

			
			
			
			
		
		
	}
}
