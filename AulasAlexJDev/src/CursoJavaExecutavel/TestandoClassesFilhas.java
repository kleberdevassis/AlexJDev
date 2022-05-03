package CursoJavaExecutavel;

import CursoJavaClasses.Aluno;
import CursoJavaClasses.Diretor;
import CursoJavaClasses.Pessoa;
import CursoJavaClasses.Secretario;

public class TestandoClassesFilhas {
	
	public static void main(String[] args) {
		
		
		Aluno aluno = new Aluno();
		aluno.setNome("Alex");
		aluno.setNomeEscola("Jdev");
		aluno.setIdade(24);
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("776689999");
		diretor.setNome("Egidio");
		diretor.setIdade(50);
		
		Secretario  secretario = new Secretario();
		secretario.setExperiencia("Administracao");
		secretario.setNumeroCpf("23456456632");
		secretario.setIdade(18);
		secretario.setNome("joao");
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		System.out.println("         ");
		System.out.println(aluno.pessoaMaiorIdade()+" - "+aluno.msMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println("salario aluno � "+aluno.salario());
		System.out.println("salario diretor � "+diretor.salario());
		System.out.println("salario secretario � "+secretario.salario());
		
	
		teste(aluno);
		teste(diretor);
		teste(secretario);
		
		
	}
	
	public static void teste(Pessoa pessoa) {
		System.out.println("essa pessoa � demais "+pessoa.getNome()
		+ "e salario � de -> "+ pessoa.salario());
	}

}
