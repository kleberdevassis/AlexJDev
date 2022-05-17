package CursoJava.Thread;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.GridBagConstraints;
import javax.swing.plaf.DimensionUIResource;
import java.awt.GridBagLayout;
public class TelaTimeThread extends JDialog{
	
	private JPanel jpanel = new JPanel(new GridBagLayout());
	
	private JLabel descricaoHora = new JLabel("Time Thread 1");
	
	
	public TelaTimeThread() {
		setTitle("minha tela de time com Thread");
		setSize(new DimensionUIResource(240, 240) );
		setLocationRelativeTo(null);
		setResizable(false);
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints();// controlar posicionamento de componentes
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		
		descricaoHora.setPreferredSize(new DimensionUIResource(WIDTH, HEIGHT));
		jpanel.a
		//primeira parte concluida
		setVisible(true);
		
		
		
		
	}

}
