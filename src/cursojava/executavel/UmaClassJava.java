package cursojava.executavel;

import cursojava.classes.Aluno;

public class UmaClassJava {
	
	/* main é um metodo autoexecutável em Java*/
	
	public static void main(String[] args) {
		

		Aluno aluno1 = new Aluno();
		
		aluno1.setNome("Michel");
		aluno1.setDataMatricula("123456");
		
		
		System.out.println("Nome do aluno: " + aluno1.getNome());
		System.out.println("Nome do aluno: " + aluno1.getDataMatricula());
		
	}
	
		
}
