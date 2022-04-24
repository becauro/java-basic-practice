package cursojava.executavel;

import cursojava.classes.Aluno;

public class UmaClassJava {
	
	/* main é um metodo autoexecutável em Java*/
	
	public static void main(String[] args) {
		

		Aluno aluno1 = new Aluno("Michel", 34);
		
		aluno1.setDataMatricula("123456");
		aluno1.setNota1(50);
		aluno1.setNota2(28.4);
		aluno1.setNota3(77.6);
		aluno1.setNota4(60.8);
		
		System.out.println("Nome do aluno: " + aluno1.getNome());
		System.out.println("Matricula do aluno: " + aluno1.getDataMatricula());
		System.out.println("Media do aluno: " + aluno1.getMedia());
		System.out.println("Status do aluno: " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
	}
	
		
}
