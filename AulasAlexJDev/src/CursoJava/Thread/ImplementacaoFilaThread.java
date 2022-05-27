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
		
		
		run
		
		
		
	}

}
