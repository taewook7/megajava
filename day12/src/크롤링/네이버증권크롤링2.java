package ũ�Ѹ�;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class ���̹�����ũ�Ѹ�2 {

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
			String name = list2.get(0).ownText();
			System.out.println("ȸ���: " + name);
			System.out.println("------------------");
		}
		
	}
}
