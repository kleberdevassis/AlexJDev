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
	
	private JButton jButton =  new JButton("Start");
	private JButton jButton2 =  new JButton("Stop");
	
	public TelaTimeThread() {
		setTitle("minha tela de time com Thread");
		setSize(new DimensionUIResource(240, 240) );
		setLocationRelativeTo(null);
		setResizable(false);
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints();// controlar posicionamento de componentes
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new Insets(5,10,5,5);
        gridBagConstraints.anchor = GridBagConstraints.WEST;
		
		descricaoHora.setPreferredSize(new Dimension(200, 25));
		jpanel.add(descricaoHora, gridBagConstraints);
		
		mostaTempo.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		mostaTempo.setEditable(false);
		jpanel.add(mostaTempo, gridBagConstraints);
		
		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jpanel.add(descricaoHora2, gridBagConstraints);
		
		mostaTempo2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		mostaTempo2.setEditable(false);
		jpanel.add(mostaTempo2, gridBagConstraints);
		
		gridBagConstraints.gridwidth = 1;
		
		jButton.setPreferredSize(new Dimension (92,25));
		gridBagConstraints.gridy++;
		jpanel.add(jButton, gridBagConstraints);
		
		jButton2.setPreferredSize(new Dimension(92,25));
		gridBagConstraints.gridx++;
		jpanel.add(jButton2, gridBagConstraints);
		
		add(jpanel, BorderLayout.WEST);
		setVisible(true);
		
		
		
		
	}

}
