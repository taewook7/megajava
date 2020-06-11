package 크롤링;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 네이버증권크롤링4 {

	public static void main(String[] args)  {
		//반드시 예외처리해야되는 경우
		//
		
		String[] codes = {"068270", "009150","028260","095700","207940","005930","017670", "091990","017670"};
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
			String now= list3.get(12).text();
		
			System.out.println("현재가: " + now);	
			

			
			
			try {
				FileWriter file = new FileWriter(name + ".txt");
				file.write(code + "\n");
				file.write(name + "\n");
				file.write(now + "\n");
				file.close();
			} catch (IOException e) {
				System.out.println("파일 저장중 에러발생함");
//				e.printStackTrace();
			}
			
			
			
			System.out.println("------------------");
			

			
			
			
			
		}
		
	}
}
