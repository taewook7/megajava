package ũ�Ѹ�;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class W3schoolũ�Ѹ� {

	public static void main(String[] args)  {
		//�ݵ�� ����ó���ؾߵǴ� ���
		//
		Document doc = null; //��������(local����), �����Ⱚ , �������� �ʱ�ȭ�������
		try {
			doc = Jsoup.connect("https://www.w3schools.com/").get();
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("ũ�Ѹ� �ϴ� �� �����߻���. �����ʿ�.");
		}
//		System.out.println(doc);
		Elements list=doc.select("h1");
		System.out.println(list.size() + "�� ����");
		for (Element e : list) {
			System.out.println(e.text());
		}
		
		for (int i = 0; i < list.size(); i++) {
			if (i==2 | i==5) {
				continue; // skip 2���̸� �����ξȰ��� �Ѿ�� 
			}
			System.out.println(list.get(i).text());
		}
		
		Elements list2=doc.select("h3");
		System.out.println(list2.size() + "�� ����");
		for (Element k : list2) {
			System.out.println(k.text());
		}
		
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(i + " : " +list2.get(i).text());
		}
		System.out.println(list2.get(24).text());
	}
}
