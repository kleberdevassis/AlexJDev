package CursoJava.interfaces;

//Essa interface ser� o nosso contrato de autentica��o
public interface PermitirAcesso {
	
	
	
    public boolean Autenticar(String login,String Senha);
    public boolean Autenticar();
}
