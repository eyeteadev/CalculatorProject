import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener{
	
	Button b;
	boolean click = false;
	
	ActionHandler(Button b){
		this.b = b;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == b) {
			b.addToSequence();
			System.out.println(b.id);
		}
	}

}
