package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class UmaClassJava {
	
	/* main é um metodo autoexecutável em Java*/
	
	public static void main(String[] args) {
		
		String dataNascimento = JOptionPane.showInputDialog("Data de Nasc.: ");
		String rg = JOptionPane.showInputDialog("RG: ");
		String cpf = JOptionPane.showInputDialog("CPF: ");
		String nomeMae = JOptionPane.showInputDialog("Nome da Mãe: ");
		String nomePai = JOptionPane.showInputDialog("Nome da Pai: ");
		String dataMatricula = JOptionPane.showInputDialog("Data de Matr.: ");
		String nomeEscola = JOptionPane.showInputDialog("Nome da Escola: ");
		String serieMatriculado = JOptionPane.showInputDialog("Série matriculado: ");
		String nota1 = JOptionPane.showInputDialog("Nota 1: ");
		String nota2 = JOptionPane.showInputDialog("Nota 2: ");
		String nota3 = JOptionPane.showInputDialog("Nota 3: ");
		String nota4 = JOptionPane.showInputDialog("Nota 4: ");
		
		Aluno aluno1 = new Aluno("Michel", 34);
		
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setNomeEscola(nomeEscola);
		aluno1.setSerieMatriculado(serieMatriculado);

		
		
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));
		
		
		/* System.out.println("================ Dados Pessoais ================ \n");
		
		System.out.println("Nome do aluno: " + aluno1.getNome());
		System.out.println("Idade do aluno: " + aluno1.getIdade());
		System.out.println("Data Nasc. do aluno: " + aluno1.getDataNascimento());
		System.out.println("RG do aluno: " + aluno1.getRegistroGeral());
		System.out.println("CPF do aluno: " + aluno1.getNumeroCpf());
		System.out.println("Mãe do aluno: " + aluno1.getNomeMae());
		System.out.println("Pai do aluno: " + aluno1.getNomePai());
		System.out.println("Matricula do aluno: " + aluno1.getDataMatricula());
		System.out.println("Escola do aluno: " + aluno1.getNomeEscola());
		System.out.println("Serie do aluno: " + aluno1.getSerieMatriculado());
		System.out.println("Data Matricula do aluno: " + aluno1.getDataMatricula()); */
		
		System.out.println(aluno1 + "\n");
		
		System.out.println("\n================ Boletim Acadêmico ================\n");
		
		System.out.println("Nota 1: " + aluno1.getNota1());
		System.out.println("Nota 2: " + aluno1.getNota2());
		System.out.println("Nota 3: " + aluno1.getNota3());
		System.out.println("Nota 4: " + aluno1.getNota4() + "\n");
		System.out.println("Media do aluno: " + aluno1.getMedia());
		System.out.println("Status do aluno: " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
	}
	
		
}
