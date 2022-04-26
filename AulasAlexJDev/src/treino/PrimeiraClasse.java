package treino;

import javax.swing.JOptionPane;

import CursoJavaClasses.Aluno;

public class PrimeiraClasse {
	
	
	public static void main(String[] args) {
		
		
		
		String nome = JOptionPane.showInputDialog(null,"digite o nome do aluno");
		String nascimento = JOptionPane.showInputDialog(null,"digite o nascimento");
		String rg = JOptionPane.showInputDialog(null,"digite o rg");
		String cpf = JOptionPane.showInputDialog(null,"digite o cpf");
		String nomePai = JOptionPane.showInputDialog(null,"digite o nome do pai");
		String nomeMae = JOptionPane.showInputDialog(null,"digite o nome da mãe");
		String nomeEscola = JOptionPane.showInputDialog(null,"digite o nome da escola");
		
		String disciplina1 = JOptionPane.showInputDialog(null,"nome da disciplina1 ?");
		String nota1 = JOptionPane.showInputDialog(null,"digite a primeira nota");
		
		String disciplina2 = JOptionPane.showInputDialog(null,"nome da disciplina2 ?");
		String nota2 = JOptionPane.showInputDialog(null,"digite a segunda nota");
		
		String disciplina3 = JOptionPane.showInputDialog(null,"nome da disciplina3 ?");
		double nota3 = Double.parseDouble(JOptionPane.showInputDialog(null,"digite a terceira nota"));
		
		String disciplina4 = JOptionPane.showInputDialog(null,"nome da disciplina4");
		double nota4 = Double.parseDouble(JOptionPane.showInputDialog(null,"digite a quarta nota"));
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome(nome);
		aluno1.setDataNascimento(nascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomePai(nomePai);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomeEscola(nomeEscola);
		
		
		aluno1.getDisciplina().setNota1(Double.parseDouble(nota1));
		aluno1.getDisciplina().setNota2(Double.parseDouble(nota2));
		aluno1.getDisciplina().setNota3(nota3);
		aluno1.getDisciplina().setNota4(nota4);
		
		aluno1.getDisciplina().setDisciplina1(disciplina1);
		aluno1.getDisciplina().setDisciplina2(disciplina2);
		aluno1.getDisciplina().setDisciplina3(disciplina3);
		aluno1.getDisciplina().setDisciplina4(disciplina4);
		
		
		System.out.println(aluno1.toString());
		System.out.println("media nota->"+ aluno1.getMediaNota());
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
