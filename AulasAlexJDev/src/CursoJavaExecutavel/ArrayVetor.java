package CursoJavaExecutavel;

import java.util.Iterator;

import javax.swing.JOptionPane;

import CursoJavaClasses.Aluno;
import CursoJavaClasses.Disciplina;

public class ArrayVetor {
	
	
	public static void main(String[] args) {
		double[] notas = {8.8,9.7,7.6,6.8};
		
		Aluno aluno = new Aluno();
		aluno.setNome("kleber margarido");
		aluno.setNomeEscola("coder");
		
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("curso de java");
	    disciplina.setNota(notas);
		
	    aluno.getDisciplinas().add(disciplina);
	    
	    
	    Disciplina disciplina2 = new Disciplina();
		disciplina.setDisciplina("logica");
	    disciplina.setNota(notas);
	    
	    System.out.println(aluno.toString());
	    System.out.println(aluno.getMediaNota());
	    System.out.println(aluno.getDisciplinas());
	    System.out.println(notas);
	}

}
