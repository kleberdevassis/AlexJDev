package CursoJava.Thread;
import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.awt.*;
import javax.swing.*;
public class ImplementacaoFilaThread extends Thread {
	
	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila =
			new ConcurrentLinkedQueue<ObjetoFilaThread>();
	
	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_fila.add(objetoFilaThread);
		
		}
	
	@Override
	public void run() {
		
		System.out.println("Fila rodando");
		
		
		
		while(true) {
		
		synchronized (pilha_fila) { /*Bloquear o acesso a esta lista por outros processos*/
			
			Iterator iteracao = pilha_fila.iterator();
			
			while(iteracao.hasNext()) { // enquanto conter dados na lista vai processar
				
				ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();//pega o objeto atual
				//Processar 10 mil notas fiscais
				//Gerar uma lista enorme de PDF
				//Gerar um envio em massa de email
				System.out.println("----------------------");
				
				System.out.println(processar.getEmail());
				System.out.println(processar.getNome());
				
				iteracao.remove();
				
				try {
					Thread.sleep(1000); // dar um tempo para descarga de memoria
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		
	}

}
