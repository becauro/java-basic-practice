package cursojava.classes;

import java.util.ArrayList;
import java.util.List;

import cursojava.constantes.StatusAluno;

public class Aluno extends Pessoa {


	String dataMatricula;
	String nomeEscola;
	String country;
	String serieMatriculado;

	List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public Aluno(String nomeEscola, String country) {
		this.nomeEscola = nomeEscola;
		this.country = country;
	}
	


	public String getDataMatricula() {
		return dataMatricula;
	}



	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}



	public String getNomeEscola() {
		return nomeEscola;
	}



	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public String getSerieMatriculado() {
		return serieMatriculado;
	}



	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}



	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}


	public double getMedia() {
		
		double sumNota = 0.0;
		
		for (Disciplina disc : disciplinas ) {
			
			/* sumNota += disc.nota; /* This also works because "disciplinas" is public */
			sumNota += disc.getNota(); 
		}
		
		return sumNota / disciplinas.size(); /* size() return the length of an array */
	}
	
	public String getAlunoAprovado() {
		
		double media = this.getMedia();
		
		if (media >= 50.0) {
			if (media >=70) {
				return StatusAluno.APROVADO;
			} else {
				return StatusAluno.RECUPERACAO;
			}
		} else {
			
			return StatusAluno.REPROVADO;
		}
	}



	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", country=" + country
				+ ", serieMatriculado=" + serieMatriculado + ", disciplinas=" + disciplinas + "]";
	}

	
}
