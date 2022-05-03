package CursoJavaClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import CursoJava.constantes.StatusAluno;

public class Aluno extends Pessoa{

	public Aluno() {

	}

	public Aluno(String nome) {
		this.nome = nome;
	}

	
	private String DataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	List<Disciplina> disciplinas = new ArrayList<>();

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	/*public String getDataMatricula() {
		return DataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		DataMatricula = dataMatricula;
	}*/

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	/*public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}*/

	public double getMediaNota() {
		double somaNotas = 0.0;

		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota();
		}

		return somaNotas / disciplinas.size();
	}

	public boolean Resultado() {
		double media = this.getMediaNota();
		if (media >= 70) {
			return true;
		} else {
			return false;
		}
	}

	public String getAlunoAprovado2() {
		double media = this.getMediaNota();
		
		if(media >= 50) {
			if(media >= 70) {
				return StatusAluno.APROVADO;
			}else {
				return StatusAluno.RECUPERACAO;
			}
		}else {
			return StatusAluno.REPROVADO;
		}
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", DataMatricula=" +  ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+  "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome);
	}
	
	@Override   // identifica método sobreescrito
	public boolean pessoaMaiorIdade() {
		return idade >= 21;
	}
	
	public String msMaiorIdade() {
		return this.pessoaMaiorIdade()? "Maior de idade":"menor de idade";
	}

	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 1500;
	}

}
