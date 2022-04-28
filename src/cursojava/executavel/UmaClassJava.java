package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class UmaClassJava {
	
	/* main é um metodo autoexecutável em Java*/
	
	public static void main(String[] args) {
		
		/* String dataNascimento = JOptionPane.showInputDialog("Data de Nasc.: ");
		String rg = JOptionPane.showInputDialog("RG: ");
		String cpf = JOptionPane.showInputDialog("CPF: ");
		String nomeMae = JOptionPane.showInputDialog("Nome da Mãe: ");
		String nomePai = JOptionPane.showInputDialog("Nome da Pai: ");
		String dataMatricula = JOptionPane.showInputDialog("Data de Matr.: ");
		String nomeEscola = JOptionPane.showInputDialog("Nome da Escola: ");
		String serieMatriculado = JOptionPane.showInputDialog("Série matriculado: "); */
		
		
		Aluno aluno1 = new Aluno("Michel", 34);
		Aluno aluno2 = new Aluno("Diego", 32);
		
		
		/* aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setNomeEscola(nomeEscola);
		aluno1.setSerieMatriculado(serieMatriculado);

		
		aluno2.setDataNascimento(dataNascimento);
		aluno2.setRegistroGeral(rg);
		aluno2.setNumeroCpf(cpf);
		aluno2.setNomeMae(nomeMae);
		aluno2.setNomePai(nomePai);
		aluno2.setDataMatricula(dataMatricula);
		aluno2.setNomeEscola(nomeEscola);
		aluno2.setSerieMatriculado(serieMatriculado); */

		
		for (int pos = 1; pos <=4; pos++) {
			
			String disciplinaName = JOptionPane.showInputDialog("Disc. "+pos+":");
			String nota = JOptionPane.showInputDialog("Nota "+pos+":");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(disciplinaName);
			disciplina.setNota(Double.parseDouble(nota));
			
			
			aluno1.getDisciplinas().add(disciplina);
			aluno2.getDisciplinas().add(disciplina);
		
		}
		

		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");
		
		if (escolha == 0) {
			String resposta = JOptionPane.showInputDialog("Disciplina 1, 2, 3 ou 4 ?");
			
			aluno1.getDisciplinas().remove(Integer.valueOf(resposta).intValue());
			aluno2.getDisciplinas().remove(Integer.valueOf(resposta).intValue());
		}
			
		
		
		System.out.println("================ Dados Pessoais ================");
				
		System.out.println("ALUNO 1: " + aluno1);
		System.out.println("ALUNO 2: " + aluno2 + "\n");
		
		System.out.println("================ Boletim Acadêmico ================");
		
		System.out.println("====== Aluno 1 ======");
		
		System.out.println("Media: " + aluno1.getMedia());
		System.out.println("Status: " + aluno1.getAlunoAprovado());

		System.out.println("====== Aluno 2 ======");
		
		System.out.println("Media: " + aluno2.getMedia());
		System.out.println("Status: " + aluno2.getAlunoAprovado());

		System.out.println("======= Alunos são iguais ? =======");
	
		if (aluno1.equals(aluno2)) {
			System.out.println("SIM");
		} else {
			System.out.println("NÃO");
		}
	}

}
