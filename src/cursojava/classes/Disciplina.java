package cursojava.classes;

public class Disciplina {
	
	double nota;
	String disciplina;

	public double getNota1() {
		return nota;
	}

	public void setNota1(double nota) {
		this.nota = nota;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public String toString() {
		return "Disciplina [nota=" + nota + ", disciplina=" + disciplina + "]";
	}
	
	

}
