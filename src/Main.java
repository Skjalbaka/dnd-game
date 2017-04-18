import javax.swing.JFrame;

public class Main {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		HomePanel c = new HomePanel();
		
		frame.add(c);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.pack();
		
		frame.setVisible(true);
		c.setVisible(true);
	}
}
 