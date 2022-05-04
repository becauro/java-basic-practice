package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class UmaClassJava {
	
	/* main é um metodo autoexecutável em Java*/
	
	public static void main(String[] args) {
		
		int newAluno = 0;
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		while (newAluno == 0) {
			
			Aluno aluno = new Aluno("ISERJ", "");
			
			String nome = JOptionPane.showInputDialog("Nome: ");
			String idade = JOptionPane.showInputDialog("Idade: ");

			/*
			String nome = JOptionPane.showInputDialog("Seu Nome: ");
			String idade = JOptionPane.showInputDialog("Idade: ");
			String dataNascimento = JOptionPane.showInputDialog("Data de Nasc.: ");
			String rg = JOptionPane.showInputDialog("RG: ");
			String cpf = JOptionPane.showInputDialog("CPF: ");
			String nomeMae = JOptionPane.showInputDialog("Nome da Mãe: ");
			String nomePai = JOptionPane.showInputDialog("Nome da Pai: ");
			String dataMatricula = JOptionPane.showInputDialog("Data de Matr.: ");
			String serieMatriculado = JOptionPane.showInputDialog("Série matriculado: "); */	

			aluno.setNome(nome);
			aluno.setIdade(Integer.parseInt(idade));
			/*
			aluno.setDataNascimento(dataNascimento);
			aluno.setRegistroGeral(rg);
			aluno.setNumeroCpf(cpf);
			aluno.setNomeMae(nomeMae);
			aluno.setNomePai(nomePai);
			aluno.setDataMatricula(dataMatricula);
			aluno.setSerieMatriculado(serieMatriculado);  */


			
			for (int pos = 1; pos <=4; pos++) {
				
				String disciplinaName = JOptionPane.showInputDialog("Disc. "+pos+":");
				String nota = JOptionPane.showInputDialog("Nota "+pos+":");
				
				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(disciplinaName);
				disciplina.setNota(Double.parseDouble(nota));

				aluno.getDisciplinas().add(disciplina);
			
			}
			

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");
			
			if (escolha == 0) {
			
				String resposta = JOptionPane.showInputDialog("Disciplina 1, 2, 3 ou 4 ?");
				/* I've looked at the showInputDiolog return. That's why I handle with it bellow*/
					if (resposta != null) {
						aluno.getDisciplinas().remove(Integer.valueOf(resposta).intValue());
					}
			}
			
			alunos.add(aluno);
			
			newAluno = JOptionPane.showConfirmDialog(null, "Deseja cadastrar mais algum aluno ?");
		}


		int searchByName = JOptionPane.showConfirmDialog(null, "Deseja pesquisar por Nome ?");
		
		String searchWord = "";
		if (searchByName == 0) {
			searchWord = JOptionPane.showInputDialog("Digite o nome para pesquisa?");			
		}
		
		/* SAÌDAS */
		
		/* System.out.println("================ Dados De Cada Aluno ================"); */

		if (searchByName == 0 && searchWord != null) {
			boolean nameFound = false;
		
			for (int pos = 0; pos <alunos.size(); pos++) {
				int getIndex = pos + 1;
					
				if ( alunos.get(pos).getNome().equalsIgnoreCase(searchWord)) {
					System.out.println("ALUNO "+ getIndex +": " + alunos.get(pos));

					/* System.out.println("================ Boletim Acadêmico ================"); */
					
					/* System.out.println("====== Aluno 1 ======"); */
					
					System.out.println("Media: " + alunos.get(pos).getMedia());
					System.out.println("Status: " + alunos.get(pos).getAlunoAprovado() + "\n");
					nameFound = true;
					break;
				}

				
			}
			
			if (nameFound == false) {
				
				System.out.println("Aluno não encontrado!");
			}
			
			
		} else {
				
			for (int pos = 0; pos <alunos.size(); pos++) {
				int getIndex = pos + 1;

					System.out.println("ALUNO "+ getIndex +": " + alunos.get(pos));

					/* System.out.println("================ Boletim Acadêmico ================"); */
					
					/* System.out.println("====== Aluno 1 ======"); */
					
					System.out.println("Media: " + alunos.get(pos).getMedia());
					System.out.println("Status: " + alunos.get(pos).getAlunoAprovado() + "\n");
			}
		
		}
		
		/* System.out.println("======= Alunos são iguais ? =======");
		
		if (aluno1.equals(aluno2)) {
			System.out.println("SIM");
		} else {
			System.out.println("NÃO");
		} */
		
		
	}

}
