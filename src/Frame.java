import javax.swing.JFrame;

public class Frame extends JFrame{
	Panel panel;
	public static int frameWidth = 600;
	public static int frameHeight = 500;
	
	Frame() {
		panel = new Panel();
		this.setSize(Frame.frameWidth, Frame.frameHeight);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Calculator Project");
		
		
		this.add(panel);
		this.setVisible(true);
		
	}
}
