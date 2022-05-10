package cursojava.executavel;

import cursojava.classes.Pessoa;
import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
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
		
		sec1.setNome("José");
		sec1.setExperiencia("Administração");
		sec1.setIdade(20);
		
		
		/* For polimosphism test I've instantiated a Pessoa class using one of its subclass*/
		Pessoa aluno2 = new Aluno("ISERJ", "Brasil");
		aluno2.setNome("Diego");
		

		System.out.println("Aluno: " + aluno1.getNome() + " | Maior idade: " + aluno1.maiorIdade() + " | Salário: " + aluno1.salario());
		System.out.println("Aluno: " + aluno2.getNome() + " | Maior idade: " + aluno2.maiorIdade() + " | Salário: " + aluno2.salario());
		
		 
		 /* For polimosphism test */
		 forPolimorphismTest(diretor1);
		 forPolimorphismTest(sec1);
		 
	}
	
	/* For polimosphism test */
	public static void forPolimorphismTest(Pessoa pessoa) {
		
		System.out.println(pessoa.getNome() + " | Maior idade: " + pessoa.maiorIdade() + " | Salário: " + pessoa.salario());
		 
	}
	
}
