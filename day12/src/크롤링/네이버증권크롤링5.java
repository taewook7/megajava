package ũ�Ѹ�;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ���̹�����ũ�Ѹ�5 {

	public String[] naver(String data)  {
		//�ݵ�� ����ó���ؾߵǴ� ���
		//
		

		
			Document doc = null; //��������(local����), �����Ⱚ , �������� �ʱ�ȭ�������
			try {
				doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=" + data).get();
			} catch (IOException e) {
				System.out.println("ũ�Ѹ� �ϴ� �� �����߻���. �����ʿ�.");
			
			}
			
			Elements list = doc.select(".code");
			String code = list.get(0).text();
			System.out.println("�ڵ�: " + code);
			
			Elements list2 = doc.select(".wrap_company a");
			String name = list2.get(0).text();
			System.out.println("ȸ���: " + name);
			
			Elements list3 = doc.select("span.blind");
			String now= list3.get(12).text();
		
			System.out.println("���簡: " + now);	
			
			Elements list4 = doc.select("no_down");
			String now2= list3.get(12).text();
			System.out.println("�ð�: " + now2);
			
			
			System.out.println("------------------");
			
			String[] values = {now,now2};
			return values;

			
			
			
			
		
		
	}
}
