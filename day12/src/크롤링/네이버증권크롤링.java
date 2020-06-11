package 크롤링;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 네이버증권크롤링 {

	public static void main(String[] args)  {
		//반드시 예외처리해야되는 경우
		//
		
		Document doc = null; //지역변수(local변수), 쓰레기값 , 수동으로 초기화해줘야함
		try {
			doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=068270").get();
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("크롤링 하는 중 에러발생함. 수정필요.");
		}
//		System.out.println(doc);
		Elements list = doc.select(".code");
//		System.out.println(list.size());   //1개
		String code = list.get(0).text();
		System.out.println("코드: "+code);
		
		
		Elements list2 = doc.select(".wrap_company a"); 
// .wrap_company a => 한칸띄우면 바로아래가 아니고 아래중  어딘가 있는 a를찾는다
// .wrap_company > a   =>  >를 쓰면 바로밑에있는걸 찾으려면 company > a  로 쓴다.
		
//		System.out.println(list2.size());  
//		for (int i = 0; i < list2.size(); i++) {
//			System.out.println(i + " : " + list2.get(i).text());
//		}
		String name= list2.get(0).text();
		System.out.println("회사명: " +name);
		
	}
}
