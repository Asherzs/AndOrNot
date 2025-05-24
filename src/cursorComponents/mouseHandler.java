package cursorComponents;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class mouseHandler extends Cursor implements MouseListener{
	
	public boolean clicked;
	public boolean entered;
	public boolean clickedOnce;
	public int index;
	
	
	

	@Override
	public void mouseClicked(MouseEvent e) {	
	}

	@Override
	public void mousePressed(MouseEvent e) {
		clicked = true;
		index = 1;
		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		clicked = false;
		index = 1;
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
		
	}

}
