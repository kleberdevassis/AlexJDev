package CursoJava.interfaces;

//Essa interface será o nosso contrato de autenticação
public interface PermitirAcesso {
	
	
	
    public boolean Autenticar(String login,String Senha);
    public boolean Autenticar();
}
