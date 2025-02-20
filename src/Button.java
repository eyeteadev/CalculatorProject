import javax.swing.JButton;

public class Button extends JButton{
	
	public int id;
	public String buttonImage;
	
	Button(int id, String buttonImage,int x, int y, int width, int length){
		this.id = id;
		this.buttonImage = buttonImage;
		this.setBounds(x, y, width, length);
	}
}
