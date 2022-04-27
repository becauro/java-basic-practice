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
		String disciplina1 = JOptionPane.showInputDialog("Disc. 1:");
		String nota1 = JOptionPane.showInputDialog("Nota 1: ");
		String disciplina2 = JOptionPane.showInputDialog("Disc. 2:");
		String nota2 = JOptionPane.showInputDialog("Nota 2: ");
		String disciplina3 = JOptionPane.showInputDialog("Disc. 3:");
		String nota3 = JOptionPane.showInputDialog("Nota 3: ");
		String disciplina4 = JOptionPane.showInputDialog("Disc. 4:");
		String nota4 = JOptionPane.showInputDialog("Nota 4: ");
		
		Aluno aluno1 = new Aluno("Michel", 34);
		Aluno aluno2 = new Aluno("Diego", 32);
		
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setNomeEscola(nomeEscola);
		aluno1.setSerieMatriculado(serieMatriculado);
			
		aluno1.setDisciplina1(disciplina1);
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setDisciplina1(disciplina2);
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setDisciplina1(disciplina3);
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setDisciplina1(disciplina4);
		aluno1.setNota4(Double.parseDouble(nota4));

		
		aluno2.setDataNascimento(dataNascimento);
		aluno2.setRegistroGeral(rg);
		aluno2.setNumeroCpf(cpf);
		aluno2.setNomeMae(nomeMae);
		aluno2.setNomePai(nomePai);
		aluno2.setDataMatricula(dataMatricula);
		aluno2.setNomeEscola(nomeEscola);
		aluno2.setSerieMatriculado(serieMatriculado);

		aluno2.setDisciplina1(disciplina1);
		aluno2.setNota1(Double.parseDouble(nota1));
		aluno2.setDisciplina1(disciplina2);
		aluno2.setNota2(Double.parseDouble(nota2));
		aluno2.setDisciplina1(disciplina3);
		aluno2.setNota3(Double.parseDouble(nota3));
		aluno2.setDisciplina1(disciplina4);
		aluno2.setNota4(Double.parseDouble(nota4));

		
		System.out.println("================ Dados Pessoais ================");
				
		System.out.println("ALUNO 1: " + aluno1);
		System.out.println("ALUNO 2: " + aluno2 + "\n");
		
		System.out.println("================ Boletim Acadêmico ================");
		
		System.out.println("======= ALUNO 1 =======");
		
		System.out.println("Nota 1: " + aluno1.getNota1());
		System.out.println("Nota 2: " + aluno1.getNota2());
		System.out.println("Nota 3: " + aluno1.getNota3());
		System.out.println("Nota 4: " + aluno1.getNota4());
		System.out.println("Media: " + aluno1.getMedia());
		System.out.println("Status: " + (aluno1.getAlunoAprovado() ? "Aprovado\n" : "Reprovado\n"));
		
		
		System.out.println("======= ALUNO 2 =======");
		
		System.out.println("Nota 1: " + aluno2.getNota1());
		System.out.println("Nota 2: " + aluno2.getNota2());
		System.out.println("Nota 3: " + aluno2.getNota3());
		System.out.println("Nota 4: " + aluno2.getNota4());
		System.out.println("Media: " + aluno2.getMedia());
		System.out.println("Status: " + (aluno2.getAlunoAprovado() ? "Aprovado\n" : "Reprovado\n"));

		System.out.println("======= Alunos são iguais ? =======");
	
		if (aluno1.equals(aluno2)) {
			System.out.println("SIM");
		} else {
			System.out.println("NÃO");
		}
	}

}
