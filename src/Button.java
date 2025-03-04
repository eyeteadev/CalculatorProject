import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Button extends JButton{
	
	public int id;
	boolean click;
	public String buttonImage;
	static int buttonWidth = 75, buttonHeight = 50;
	ButtonManager bm;
	ActionHandler ah;
	
	Button(int id, String buttonImage,int x, int y, int width, int length, ButtonManager bm){
		this.bm = bm;
		this.id = id;
		
		ah = new ActionHandler(this);
		this.addActionListener(ah);
		
		this.buttonImage = buttonImage;
		this.setBounds(x, y, width, length);
		this.setBackground(Color.gray);
		
		this.setText(buttonImage);
		this.setFocusable(false);

	}
	
	public void addToSequence() {
		bm.orderSequence.add(this);
		bm.checkOperator();
		bm.updateOutput();
	}

	
	
	public void setIDandImage(int id, String buttonImage) {
		this.id = id;
		this.buttonImage = buttonImage;
	}
}
