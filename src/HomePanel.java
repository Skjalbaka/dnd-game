import java.awt.*;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class HomePanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private final int width = 1200, height = 800;
	int w = width, h = height;
	
	public HomePanel () {
		
		init();
	}
	
	private void init() {
		
		GridLayout layout = new GridLayout(0, 1, 0, 50);
		EmptyBorder border = new EmptyBorder(250, 200, 250, 200);
		
		setLayout(layout);
		setBorder(border);
				
		createButtons();
		repaint();
	}
	
	private void createButtons() {
		
		createButton("Play");
		createButton("Exit");
	}
	
	private JButton createButton(String name) {
		
		JButton button = new JButton();
		button.setText(name);
		button.setAlignmentX(CENTER_ALIGNMENT);
		add(button);
		return button;
	}
	
	@Override
	public Dimension getPreferredSize() {
		
		return new Dimension(width, height);
	}
	
	@Override
	public void paintComponent(Graphics g){
	
		h = getHeight(); w = getWidth();
		
		g.setColor(Color.black);
		g.fillRect(0, 0, w, h);
	}
}