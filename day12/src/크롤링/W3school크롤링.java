package 크롤링;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class W3school크롤링 {

	public static void main(String[] args)  {
		//반드시 예외처리해야되는 경우
		//
		Document doc = null; //지역변수(local변수), 쓰레기값 , 수동으로 초기화해줘야함
		try {
			doc = Jsoup.connect("https://www.w3schools.com/").get();
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("크롤링 하는 중 에러발생함. 수정필요.");
		}
//		System.out.println(doc);
		Elements list=doc.select("h1");
		System.out.println(list.size() + "개 있음");
		for (Element e : list) {
			System.out.println(e.text());
		}
		
		for (int i = 0; i < list.size(); i++) {
			if (i==2 | i==5) {
				continue; // skip 2번이면 밑으로안가고 넘어가라 
			}
			System.out.println(list.get(i).text());
		}
		
		Elements list2=doc.select("h3");
		System.out.println(list2.size() + "개 있음");
		for (Element k : list2) {
			System.out.println(k.text());
		}
		
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(i + " : " +list2.get(i).text());
		}
		System.out.println(list2.get(24).text());
	}
}
