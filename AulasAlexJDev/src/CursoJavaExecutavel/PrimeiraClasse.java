package CursoJavaExecutavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import CursoJava.constantes.StatusAluno;
import CursoJavaClasses.Aluno;
import CursoJavaClasses.Disciplina;

public class PrimeiraClasse {

	public static void main(String[] args) {
		
		
		String login = JOptionPane.showInputDialog("informe o login");
		String senha = JOptionPane.showInputDialog("Digite a senha");
		
		if(login.equalsIgnoreCase("adm") && senha.equalsIgnoreCase("adm")) {
		

		List<Aluno> alunos = new ArrayList<>();
		
		
	    HashMap<String, List<Aluno>> maps = new HashMap<>();
		
		
		

		for (int qtd = 1; qtd <= 5; qtd++) {

			String nome = JOptionPane.showInputDialog(null, "digite o nome do aluno" + qtd + "?");
			/*String nascimento = JOptionPane.showInputDialog(null, "digite o nascimento");
			String rg = JOptionPane.showInputDialog(null, "digite o rg");
			String cpf = JOptionPane.showInputDialog(null, "digite o cpf");
			String nomePai = JOptionPane.showInputDialog(null, "digite o nome do pai");
			String nomeMae = JOptionPane.showInputDialog(null, "digite o nome da mãe");
			String nomeEscola = JOptionPane.showInputDialog(null, "digite o nome da escola");*/

			Aluno aluno1 = new Aluno();

			aluno1.setNome(nome);
			/*aluno1.setDataNascimento(nascimento);
			aluno1.setRegistroGeral(rg);
			aluno1.setNumeroCpf(cpf);
			aluno1.setNomePai(nomePai);
			aluno1.setNomeMae(nomeMae);
			aluno1.setNomeEscola(nomeEscola);*/

			for (int pos = 1; pos <= 1; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog(null, "nome da disciplina" + pos + "?");
				String notaDisciplina = JOptionPane.showInputDialog(null, "nota da disciplina" + pos + "?");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno1.getDisciplinas().add(disciplina);

			}

			int escolha = JOptionPane.showConfirmDialog(null, "voce deseja remover a disciplina?");

			if (escolha == 0) {
				int continuarRemover = 0;
				int posicao = 1;
				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog("qual é a disciplina? 1 2 3 ou 4 ?");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
				}

			}

			alunos.add(aluno1);
		}

		
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		
		
		for (Aluno aluno : alunos) {
			if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);
			} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				maps.get(StatusAluno.RECUPERACAO).add(aluno);
			} else {
				maps.get(StatusAluno.REPROVADO).add(aluno);
			}
		}

		System.out.println(" lista dos aprovados ---------------------------------------------------------------");
		for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
			System.out.println("Resultado -> " + aluno.getAlunoAprovado2() + " com media de " + aluno.getMediaNota());
		}
		System.out.println(" lista em recuperação ---------------------------------------------------------------");
		for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println("Resultado -> " + aluno.getAlunoAprovado2() + " com media de " + aluno.getMediaNota());
		}
		System.out.println(" lista dos reprovados ---------------------------------------------------------------");
		for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
			System.out.println("Resultado -> " + aluno.getAlunoAprovado2() + "com media de " + aluno.getMediaNota());
		}
		
		}

	}

}
