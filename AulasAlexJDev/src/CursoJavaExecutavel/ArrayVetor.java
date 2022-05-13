package CursoJavaExecutavel;

import java.util.Iterator;

import javax.swing.JOptionPane;

import CursoJavaClasses.Aluno;
import CursoJavaClasses.Disciplina;

public class ArrayVetor {
	
	
	public static void main(String[] args) {
		double[] notas = {8.8,9.7,7.6,6.8};
		double[] notasLogica = {8.7,9.3,7.6,6.9};
		Aluno aluno = new Aluno();
		aluno.setNome("kleber margarido");
		aluno.setNomeEscola("coder");
		
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("curso de java");
	    disciplina.setNota(notas);
	    
	    Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("logica");
	    disciplina2.setNota(notasLogica);
		
	    aluno.getDisciplinas().add(disciplina);
	    aluno.getDisciplinas().add(disciplina2);
	    
	    Aluno aluno2 = new Aluno();
		aluno2.setNome("kleber margarido");
		aluno2.setNomeEscola("coder");
		
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("curso de java");
	    disciplina3.setNota(notas);
	    
	    Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("logica");
	    disciplina4.setNota(notasLogica);
		
	    aluno2.getDisciplinas().add(disciplina3);
	    aluno2.getDisciplinas().add(disciplina4);
	    
	    
	    
	  ///-------------------------------------------------------------------------------------------------------------------
	    
	   Aluno[] arrayAlunos = new Aluno[2];
	   arrayAlunos[0] = aluno;
	   arrayAlunos[1] = aluno2;
	   
	   for (int pos = 0; pos < arrayAlunos.length; pos++) {
		System.out.println("nome do aluno -> "+ arrayAlunos[pos].getNome());
		for(Disciplina d: arrayAlunos[pos].getDisciplinas()) {
			System.out.println("disciplina -> "+ d.getDisciplina());
			for (int posnota = 0; posnota < d.getNota().length; posnota++) {
				System.out.println("nota numero "+ (posnota+1)+ " é " + d.getNota()[posnota]);
			}
			
		}
		
	}
		
		
	}
	    
	    
	}


