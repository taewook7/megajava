package 인터페이스;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

public class 버튼클릭처리 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getSource());
		
		
		System.out.println("버튼을 눌렀음.");
	}

}
