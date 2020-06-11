package ũ�Ѹ�;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class ���̹�����ũ�Ѹ� {

	public static void main(String[] args)  {
		//�ݵ�� ����ó���ؾߵǴ� ���
		//
		
		Document doc = null; //��������(local����), �����Ⱚ , �������� �ʱ�ȭ�������
		try {
			doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=068270").get();
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("ũ�Ѹ� �ϴ� �� �����߻���. �����ʿ�.");
		}
//		System.out.println(doc);
		Elements list = doc.select(".code");
//		System.out.println(list.size());   //1��
		String code = list.get(0).text();
		System.out.println("�ڵ�: "+code);
		
		
		Elements list2 = doc.select(".wrap_company a"); 
// .wrap_company a => ��ĭ���� �ٷξƷ��� �ƴϰ� �Ʒ���  ��� �ִ� a��ã�´�
// .wrap_company > a   =>  >�� ���� �ٷιؿ��ִ°� ã������ company > a  �� ����.
		
//		System.out.println(list2.size());  
//		for (int i = 0; i < list2.size(); i++) {
//			System.out.println(i + " : " + list2.get(i).text());
//		}
		String name= list2.get(0).text();
		System.out.println("ȸ���: " +name);
		
	}
}
