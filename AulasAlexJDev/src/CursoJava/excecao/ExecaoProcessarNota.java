package CursoJava.excecao;

public class ExecaoProcessarNota extends Exception{
	
	public ExecaoProcessarNota(String erro) {
		super("vixi aconteceu um erro foi mal arquivo n�o encontrado"+erro);
	}
	

}
