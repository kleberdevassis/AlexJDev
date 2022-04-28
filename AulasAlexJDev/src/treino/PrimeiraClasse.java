package treino;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import CursoJavaClasses.Aluno;
import CursoJavaClasses.Disciplina;

public class PrimeiraClasse {

	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<>();
		
		for (int qtd = 1; qtd <= 2; qtd++) {
			
		
		
		String nome = JOptionPane.showInputDialog(null, "digite o nome do aluno"+qtd+"?");
		String nascimento = JOptionPane.showInputDialog(null, "digite o nascimento");
		String rg = JOptionPane.showInputDialog(null, "digite o rg");
		String cpf = JOptionPane.showInputDialog(null, "digite o cpf");
		String nomePai = JOptionPane.showInputDialog(null, "digite o nome do pai");
		String nomeMae = JOptionPane.showInputDialog(null, "digite o nome da m�e");
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
			String nomeDisciplina = JOptionPane.showInputDialog(null, "nome da disciplina" + pos + "?");
			String notaDisciplina = JOptionPane.showInputDialog(null, "nota da disciplina" + pos + "?");

			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));

			aluno1.getDisciplinas().add(disciplina);

		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "voce deseja remover a disciplina?");
		
		
		
		if(escolha == 0) {
			int continuarRemover = 0;
			int posicao = 1;
			while(continuarRemover ==0) {
				String disciplinaRemover = JOptionPane.showInputDialog("qual � a disciplina? 1 2 3 ou 4 ?");
				aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao); 
				posicao++;
				continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
			}
			
			
			
		}
		
		alunos.add(aluno1);
		}

		for (Aluno aluno : alunos) {
			System.out.println(aluno);
			System.out.println("media nota->" + aluno.getMediaNota());
			System.out.println("resultado ->" + aluno.getAlunoAprovado2());
            System.out.println("-----------------------------");
		}
		
		


	}

}
