import java.awt.Color;

import javax.swing.JPanel;

public class Panel extends JPanel{
	
	Button button;
	ButtonManager bm;
	Output output;
	
	Panel(){
		output = new Output();
		this.bm = new ButtonManager(this, output);
		
		this.setSize(Frame.frameWidth,Frame.frameHeight);
		this.setLayout(null);
		this.setBackground(Color.LIGHT_GRAY);
		
		bm.addButtonsToScreen();
		
		//button = new Button(1,"1",10,10,50,50);
		
		//this.add(button);
		this.add(output);
		this.setOpaque(true);
	}
	
	
}
