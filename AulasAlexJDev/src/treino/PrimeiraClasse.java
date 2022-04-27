package treino;

import javax.swing.JOptionPane;

import CursoJavaClasses.Aluno;
import CursoJavaClasses.Disciplina;

public class PrimeiraClasse {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog(null, "digite o nome do aluno");
		String nascimento = JOptionPane.showInputDialog(null, "digite o nascimento");
		String rg = JOptionPane.showInputDialog(null, "digite o rg");
		String cpf = JOptionPane.showInputDialog(null, "digite o cpf");
		String nomePai = JOptionPane.showInputDialog(null, "digite o nome do pai");
		String nomeMae = JOptionPane.showInputDialog(null, "digite o nome da mãe");
		String nomeEscola = JOptionPane.showInputDialog(null, "digite o nome da escola");
		

		Aluno aluno1 = new Aluno();

		aluno1.setNome(nome);
		aluno1.setDataNascimento(nascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomePai(nomePai);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomeEscola(nomeEscola);

		for (int pos = 1; pos <= 4; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog
					(null,"nome da disciplina"+pos+"?");
			String notaDisciplina = JOptionPane.showInputDialog
					(null,"nota da disciplina"+pos+"?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
			
		}

		System.out.println(aluno1.toString());
		System.out.println("media nota->" + aluno1.getMediaNota());
		System.out.println("resultado ->" + aluno1.getAlunoAprovado2());

//		Aluno aluno1 = new Aluno();
//		aluno1.setNome("kleber");
//		Aluno aluno2 = new Aluno();
//		aluno2.setNome("kleber");
//		
//		if(aluno1.equals(aluno2)) {
//			System.out.println("iguais");
//		}else {
//			System.out.println("diferentes");
//		}

	}

}
