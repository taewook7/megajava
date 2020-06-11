package ũ�Ѹ�;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ���̹�����ũ�Ѹ�3 {

	public static void main(String[] args)  {
		//�ݵ�� ����ó���ؾߵǴ� ���
		//
		
		String[] codes = {"068270", "009150","028260"};
		for (int i = 0; i < codes.length; i++) {
			Document doc = null; //��������(local����), �����Ⱚ , �������� �ʱ�ȭ�������
			try {
				doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=" + codes[i]).get();
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
			System.out.println(list3);
			String now= list3.get(12).text();
		
			System.out.println("���簡: " + now);	
			
			String now2= list3.get(16).text();
			System.out.println("�ð�: " + now2);
			
			
			System.out.println("------------------");
			

			
			
			
			
		}
		
	}
}
