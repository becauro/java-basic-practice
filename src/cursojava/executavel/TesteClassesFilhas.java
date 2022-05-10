package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TesteClassesFilhas {

	public static void main(String[] args) {
		
		/* I've set idade just for test the overrider in Aluno class */
		
		Aluno aluno1 = new Aluno("ISERJ", "Brasil");
		
		aluno1.setNome("Michel");
		aluno1.setIdade(16);
		
		
		Diretor diretor1 = new Diretor();
		
		diretor1.setNome("Ana");
		diretor1.setTempoDirecao(3);
		diretor1.setIdade(16);
		
		
		Secretario sec1 = new Secretario();
		
		sec1.setNome("Jos�");
		sec1.setExperiencia("Administra��o");
		sec1.setIdade(20);
		
		
	 System.out.println("Aluno: " + aluno1.getNome() + " | Maior idade: " + aluno1.maiorIdade());
	 
	 System.out.println("Diretor: " + diretor1.getNome() + " | Maior idade: " + diretor1.maiorIdade());
	 
	 System.out.println("Secret�rio: " + sec1.getNome() + " | Maior idade: " + sec1.maiorIdade());
	 
	}
}
