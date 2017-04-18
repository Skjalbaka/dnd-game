import java.awt.*;
import javax.swing.JPanel;

public class HomePanel extends JPanel {

	private static final long serialVersionUID = 1L;

	public HomePanel () {
		
		init();
	}
	
	public void init() {
		
		repaint();
	}
	
	@Override
	public Dimension getPreferredSize() {
		
		return new Dimension(1200, 800);
	}
	
	@Override
	public void paint(Graphics g){
		
		int h = getHeight(), w = getWidth();
		
		g.setColor(Color.black);
		g.fillRect(0, 0, w, h);
	}
}