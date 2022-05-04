package CursoJavaClasses.Auxiliares;

import CursoJava.interfaces.PermitirAcesso;

public class FuncaoAutenticacao {
	
	private PermitirAcesso permitirAcesso;
	
	
	public boolean autenticar() {
		return permitirAcesso.Autenticar();
	}
	
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}
    
}
