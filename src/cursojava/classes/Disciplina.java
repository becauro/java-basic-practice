package cursojava.classes;

public class Disciplina {
	
	double nota;
	String disciplina;

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
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
		return "( disciplina=" + disciplina + ", " + "nota=" + nota + " )";
	}
	
	

}
