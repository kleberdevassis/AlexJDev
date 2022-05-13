package CursoJavaExecutavel;

public class Matriz {
	
	public static void main(String[] args) {
		
		int notas[][] = new int[2][3];
		
		notas[0][0] = 80;
		notas[0][1] = 90;
		notas[0][2] = 70;
		
		notas[1][0] = 40;
		notas[1][1] = 60;
		notas[1][2] = 30;
		
		//percorre as linhas
		
		for (int posicaolinha = 0; posicaolinha < notas.length; posicaolinha++) {
			System.out.println("----------------------------------------------------------------------------------------");
			for (int posicaocoluna = 0; posicaocoluna < notas[posicaolinha].length; posicaocoluna++) {
				System.out.println("valor da matriz-> "+ notas[posicaolinha][posicaocoluna]);
			}
		}
		
		
	}

}
