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
	    
	    
	    
	    System.out.println("nome do aluno = "+ aluno.getNome()+ " inscrito no curso -> "+aluno.getNomeEscola());
	    System.out.println("\ndisciplinas do aluno");
	    for(Disciplina d : aluno.getDisciplinas()) {
	    	System.out.println("\nDisciplina -> "+ d.getDisciplina());
	    	System.out.println("Notas  ");
	    for (int pos = 0; pos < d.getNota().length; pos++) {
	    	System.out.println("Nota ->"+ (pos+1) + "é igual ->"+d.getNota()[pos] );
			
		}
	    }
	    
	    
	}

}
