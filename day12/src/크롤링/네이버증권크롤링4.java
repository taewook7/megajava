package ũ�Ѹ�;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class ���̹�����ũ�Ѹ�4 {

	public static void main(String[] args)  {
		//�ݵ�� ����ó���ؾߵǴ� ���
		//
		
		String[] codes = {"068270", "009150","028260","095700","207940","005930","017670", "091990","017670"};
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
			String now= list3.get(12).text();
		
			System.out.println("���簡: " + now);	
			

			
			
			try {
				FileWriter file = new FileWriter(name + ".txt");
				file.write(code + "\n");
				file.write(name + "\n");
				file.write(now + "\n");
				file.close();
			} catch (IOException e) {
				System.out.println("���� ������ �����߻���");
//				e.printStackTrace();
			}
			
			
			
			System.out.println("------------------");
			

			
			
			
			
		}
		
	}
}
