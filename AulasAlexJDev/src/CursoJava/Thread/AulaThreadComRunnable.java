package CursoJava.Thread;

import javax.swing.JOptionPane;

public class AulaThreadComRunnable {

	public static void main(String[] args) throws InterruptedException {
		// Thread processando em paralelo do envio de email
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();

		Thread threadNFCE = new Thread(thread2);
		threadNFCE.start();

		System.out.println("Chegou ao fim do código");
		// fluxo do sistema - ex um cadastro ou uma emissão de nota fiscal
		JOptionPane.showMessageDialog(null, "Sistema continua executando");
	}

	private static Runnable thread2 = new Runnable() {

		@Override
		public void run() {

			// codigo da rotina
			for (int pos = 0; pos < 10; pos++) {
				// quero executar esse envio com um tempo de parada, ou com um tempo determinado
				System.out.println("Executando algo rotina, por exemplo envio de nota fiscal");

				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} // da um tempo

			}

		}
	};

	private static Runnable thread1 = new Runnable() {

		@Override
		public void run() {
			// codigo da rotina
			for (int pos = 0; pos < 10; pos++) {
				// quero executar esse envio com um tempo de parada, ou com um tempo determinado
				System.out.println("Executando algo rotina, envio de email");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} // da um tempo

			}

		}
	};

}
