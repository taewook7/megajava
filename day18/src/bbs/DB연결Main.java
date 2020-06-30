package bbs;

import javax.swing.JOptionPane;

public class DBø¨∞·Main {

	public static void main(String[] args) throws Exception {
		
		String id=JOptionPane.showInputDialog("id");
		String title=JOptionPane.showInputDialog("title");
		String content=JOptionPane.showInputDialog("content");
		String writer=JOptionPane.showInputDialog("writer");
		
		BbsDAO dao = new BbsDAO();
		
		BbsBag bag = new BbsBag();
		bag.setId(id);
		bag.setTitle(title);
		bag.setContent(content);
		bag.setWriter(writer);
		
		
		dao.create(bag);
		
		
	}

}
