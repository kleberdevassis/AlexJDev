package CursoJava.Thread;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import javax.swing.*;
import java.awt.GridBagConstraints;
import javax.swing.plaf.DimensionUIResource;
import java.awt.GridBagLayout;
public class TelaTimeThread extends JDialog{
	
	private JPanel jpanel = new JPanel(new GridBagLayout());//Painel de componentes
	
	private JLabel descricaoHora = new JLabel("Time Thread 1");
	private JTextField mostaTempo = new JTextField();
	
	private JLabel descricaoHora2 = new JLabel("Time Thread 2");
	private JTextField mostaTempo2 = new JTextField();
	
	
	public TelaTimeThread() {
		setTitle("minha tela de time com Thread");
		setSize(new DimensionUIResource(240, 240) );
		setLocationRelativeTo(null);
		setResizable(false);
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints();// controlar posicionamento de componentes
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		
		descricaoHora.setPreferredSize(new Dimension(200, 25));
		jpanel.add(descricaoHora, gridBagConstraints);
		
		mostaTempo.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jpanel.add(mostaTempo, gridBagConstraints);
		
		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jpanel.add(descricaoHora2, gridBagConstraints);
		
		mostaTempo2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jpanel.add(mostaTempo2, gridBagConstraints);
		
		add(jpanel, BorderLayout.WEST);
		setVisible(true);
		
		
		
		
	}

}
