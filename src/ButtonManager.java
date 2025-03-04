import java.util.ArrayList;

public class ButtonManager {
	
	Panel p;
	ArrayList<Button> orderSequence;
	ActionHandler ah;
	Output output;
	
	ButtonManager(Panel p, Output output){
		this.p = p;
		this.output = output;
		orderSequence = new ArrayList<Button>();
	}
	
	void addButtonsToScreen() {
		//numbers first.
		Button button;
		int bx = 10, by = 100;
		int num = 1;

		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				button = new Button((num),String.valueOf(num),bx,by,Button.buttonWidth,Button.buttonHeight, this);
				p.add(button);
				bx += Button.buttonWidth;
				num++;
			}
			
			by += Button.buttonHeight;
			bx = 10;
		}
		
		button = new Button(0,"0",85,250,Button.buttonWidth,Button.buttonHeight,this);
		p.add(button);
	}
	
	//check operator in list.
	void checkOperator() {
		
	}
	
	void updateOutput() {
		
	}
}
