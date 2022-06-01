package CursoJava.Thread;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import javax.swing.*;
import java.awt.GridBagConstraints;
import javax.swing.plaf.DimensionUIResource;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.*;

public class TelaTimeThread extends JDialog {

	private JPanel jpanel = new JPanel(new GridBagLayout());// Painel de componentes

	private JLabel descricaoHora = new JLabel("Nome");// Label
	private JTextField mostraTempo = new JTextField();// campo de texto

	private JLabel descricaoHora2 = new JLabel("E-mail");
	private JTextField mostraTempo2 = new JTextField();

	private JButton jButton = new JButton("Gerar");
	private JButton jButton2 = new JButton("Stop");
	
	ImplementacaoFilaThread fila = new ImplementacaoFilaThread();

	public TelaTimeThread() {
		setTitle("minha tela de time com Thread");
		setSize(new DimensionUIResource(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);

		GridBagConstraints gridBagConstraints = new GridBagConstraints();// controlar posicionamento de componentes
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2; // definindo o espaço utilizado na grade
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);// inserindo espaço entre os componentes
		gridBagConstraints.anchor = GridBagConstraints.WEST; // ancorando todos os componentes á esquerda

		descricaoHora.setPreferredSize(new Dimension(200, 25));
		jpanel.add(descricaoHora, gridBagConstraints);

		mostraTempo.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;

		jpanel.add(mostraTempo, gridBagConstraints);

		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jpanel.add(descricaoHora2, gridBagConstraints);

		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;

		jpanel.add(mostraTempo2, gridBagConstraints);

		gridBagConstraints.gridwidth = 1;

		jButton.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridy++;
		jpanel.add(jButton, gridBagConstraints);

		jButton2.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridx++;
		jpanel.add(jButton2, gridBagConstraints);

		jButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) { // executa o click no botao
				
				
				if(fila == null) {
					fila = new ImplementacaoFilaThread();
					fila.start();
				}
				
				for (int qtd = 0; qtd < 100; qtd++) {
					
				
				
				ObjetoFilaThread filaThread = new ObjetoFilaThread();
                filaThread.setNome(mostraTempo.getText());
                filaThread.setEmail(mostraTempo2.getText()+" - "+qtd);
                
                fila.add(filaThread);
				}
			}

		});

		jButton2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				fila.stop();
				fila = null;

			}

		});

		
        fila.start();
		add(jpanel, BorderLayout.WEST);
		setVisible(true);

	}

}
