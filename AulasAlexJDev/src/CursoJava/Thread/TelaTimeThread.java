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

	private JLabel descricaoHora = new JLabel("Time Thread 1");// Label
	private JTextField mostraTempo = new JTextField();// campo de texto

	private JLabel descricaoHora2 = new JLabel("Time Thread 2");
	private JTextField mostraTempo2 = new JTextField();

	private JButton jButton = new JButton("Start");
	private JButton jButton2 = new JButton("Stop");

	private Runnable thread1 = new Runnable() {

		@Override
		public void run() {
			while (true) { /* Fica sempre rodando */
				mostraTempo.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss")
						.format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	};
	

	private Runnable thread2 = new Runnable() {

		@Override
		public void run() {
			while (true) { /* Fica sempre rodando */
				mostraTempo2.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").
						format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	};

	private Thread thread1Time;
	private Thread thread2Time;

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
		mostraTempo.setEditable(false);// deixando o campo de texto não editável
		jpanel.add(mostraTempo, gridBagConstraints);

		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jpanel.add(descricaoHora2, gridBagConstraints);

		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		mostraTempo2.setEditable(false);// deixando o campo de texto não editável
		jpanel.add(mostraTempo2, gridBagConstraints);

		gridBagConstraints.gridwidth = 1;

		jButton.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridy++;
		jpanel.add(jButton, gridBagConstraints);

		jButton2.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridx++;
		jpanel.add(jButton2, gridBagConstraints);

		jButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				thread1Time = new Thread(thread1);
				thread1Time.start();

				thread2Time = new Thread(thread2);
				thread2Time.start();

				jButton.setEnabled(false);
				jButton2.setEnabled(true);

			}

		} );

		jButton2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				thread1Time.stop();
				thread2Time.stop();

				jButton.setEnabled(true);
				jButton2.setEnabled(false);

			}

		});

		jButton2.setEnabled(false);

		add(jpanel, BorderLayout.WEST);
		setVisible(true);

	}

}
