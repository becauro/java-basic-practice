package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Secretario;

public class TesteClassesFilhas {

	public static void main(String[] args) {
		
		
		Aluno aluno1 = new Aluno("ISERJ", "Brasil");
		
		aluno1.setNome("Michel");
		
		
		Diretor diretor1 = new Diretor();
		
		diretor1.setNome("Ana");
		diretor1.setTempoDirecao(3);
		
		
		Secretario sec1 = new Secretario();
		
		sec1.setNome("José");
		sec1.setExperiencia("Administração");
		
		
		
	 System.out.println(aluno1);
	 
	 System.out.println(diretor1);
	 
	 System.out.println(sec1);
	 
		
	}
}
