package cursojava.executavel;

import cursojava.classes.Aluno;

public class UmaClassJava {
	
	/* main � um metodo autoexecut�vel em Java*/
	
	public static void main(String[] args) {
		

		Aluno aluno1 = new Aluno();
		
		Aluno aluno2 = new Aluno("Torquato", 64); 
		
		
		System.out.println("Nome do aluno: " + aluno2.nome);
	}
	
		
}
