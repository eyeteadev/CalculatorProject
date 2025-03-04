import javax.swing.JFrame;

public class Frame extends JFrame{
	Panel panel;
	public static int frameWidth = 450;
	public static int frameHeight = 350;
	
	Frame() {
		panel = new Panel();
		this.setLayout(null);
		this.setSize(Frame.frameWidth, Frame.frameHeight);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Calculator Project");
		
		
		this.add(panel);
		this.setVisible(true);
		
	}
}
