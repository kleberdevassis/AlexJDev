package CursoJava.Thread;

import javax.swing.JDialog;
import javax.swing.plaf.DimensionUIResource;

public class TelaTimeThread extends JDialog{
	
	
	
	public TelaTimeThread() {
		setTitle("minha tela de time com Thread");
		setSize(new DimensionUIResource(240, 240) );
		setLocationRelativeTo(null);
		setResizable(false);
		//primeira parte concluida
		
		
		
		setVisible(true);
	}

}
