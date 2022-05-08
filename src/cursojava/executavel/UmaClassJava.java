package cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;

public class UmaClassJava {
	
	/* main é um metodo autoexecutável em Java*/
	
	public static void main(String[] args) {
		
		int newAluno = 0;
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		
		List<Aluno> aprovados = new ArrayList<Aluno>();
		List<Aluno> reprovados = new ArrayList<Aluno>();
		
		
		HashMap<String, List<Aluno>> myMaps = new HashMap<String, List<Aluno>>();
		
		myMaps.put(StatusAluno.APROVADO, aprovados);
		myMaps.put(StatusAluno.REPROVADO, reprovados);
		myMaps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>()); /* Different way */
		
		
		while (newAluno == 0) {
			
			Aluno aluno = new Aluno("ISERJ", "Brasil");
			
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

		int removeSomeone = JOptionPane.showConfirmDialog(null, "Deseja remover algum aluno ?");
				
		String nameToRemove = "";
		if (removeSomeone == 0) {
			nameToRemove = JOptionPane.showInputDialog("Digite o nome para remover?");
			
			for (Aluno item : alunos) {
				if (item.getNome().equalsIgnoreCase(nameToRemove)) {
					alunos.remove(item);
					break; /* Without this break the code "breaks" :-) */
				}
			}
		}
		
		
		int replaceSomeone = JOptionPane.showConfirmDialog(null, "Deseja subtituir algum aluno ?");
		
		String nameToReplace = "";
		if (replaceSomeone == 0) {
			nameToReplace = JOptionPane.showInputDialog("Digite o nome a ser substituido ?");
			
			Aluno newbieAluno = new Aluno("ISERJ", "Brasil");
			
			newbieAluno.setNome("Newbie");
			newbieAluno.setIdade(Integer.parseInt("32"));
			newbieAluno.setDataNascimento("22-07-89");
			newbieAluno.setRegistroGeral("1234567");
			newbieAluno.setNumeroCpf("109.444.444-45");
			newbieAluno.setNomeMae("Madalena");
			newbieAluno.setNomePai("Torquato");
			newbieAluno.setDataMatricula("22-07-2020");
			newbieAluno.setSerieMatriculado("9");
			
			Disciplina disciplina1 = new Disciplina();
			disciplina1.setDisciplina("Matemática");
			disciplina1.setNota(Double.parseDouble("90"));

			newbieAluno.getDisciplinas().add(disciplina1);
			
			Disciplina disciplina2 = new Disciplina();
			disciplina2.setDisciplina("Português");
			disciplina2.setNota(Double.parseDouble("77"));

			newbieAluno.getDisciplinas().add(disciplina2);
			
			Disciplina disciplina3 = new Disciplina();
			disciplina3.setDisciplina("Geografia");
			disciplina3.setNota(Double.parseDouble("77"));

			newbieAluno.getDisciplinas().add(disciplina3);
			
			Disciplina disciplina4 = new Disciplina();
			disciplina4.setDisciplina("Historia");
			disciplina4.setNota(Double.parseDouble("87"));

			newbieAluno.getDisciplinas().add(disciplina4);
			
			for (int index = 0; index < alunos.size(); index++) {
				if (alunos.get(index).getNome().equalsIgnoreCase(nameToReplace)) {
					alunos.set(index, newbieAluno);
					break; /* Without this break the code "breaks" :-) */
				}
			}
		}
		
		
		
		
		int searchByName = JOptionPane.showConfirmDialog(null, "Deseja pesquisar por Nome ?");
		
		String searchWord = "";
		if (searchByName == 0) {
			searchWord = JOptionPane.showInputDialog("Digite o nome para pesquisa?");			
		}
		
		/* SA�DAS */
		
		/* System.out.println("================ Dados De Cada Aluno ================"); */

		if (searchByName == 0 && searchWord != null) {
			boolean nameFound = false;
		
			for (int pos = 0; pos <alunos.size(); pos++) {
				int getIndex = pos + 1;
					
				if ( alunos.get(pos).getNome().equalsIgnoreCase(searchWord)) {
					System.out.println("ALUNO "+ getIndex +": " + alunos.get(pos));

					/* System.out.println("================ Boletim Acad�mico ================"); */
					
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
			
			for (Aluno aluno : alunos) {
				
				/* if (aluno.getAlunoAprovado() == "Aprovado") {
					aprovados.add(aluno);
				} else if (aluno.getAlunoAprovado() == "Recuperação") {
					recuperacao.add(aluno);
				} else {
					reprovados.add(aluno);
				} */
				
				if (aluno.getAlunoAprovado() == StatusAluno.APROVADO) {
					myMaps.get(StatusAluno.APROVADO).add(aluno);
				} else if (aluno.getAlunoAprovado() == StatusAluno.RECUPERACAO) {
					myMaps.get(StatusAluno.RECUPERACAO).add(aluno);
				} else {
					myMaps.get(StatusAluno.REPROVADO).add(aluno);
				}
				
			}
			
			System.out.println("===============APROVADOS=====================");
			for (int pos = 0; pos <aprovados.size(); pos++) {
				int getIndex = pos + 1;
					
					System.out.println("ALUNO "+ getIndex +": " + aprovados.get(pos));
					System.out.println("Media: " + aprovados.get(pos).getMedia());
					System.out.println("Status: " + aprovados.get(pos).getAlunoAprovado() + "\n");	
			}
			
			System.out.println("===============REPROVADOS=====================");
			for (int pos = 0; pos <reprovados.size(); pos++) {
				int getIndex = pos + 1;
					
					System.out.println("ALUNO "+ getIndex +": " + reprovados.get(pos));
					System.out.println("Media: " + reprovados.get(pos).getMedia());
					System.out.println("Status: " + reprovados.get(pos).getAlunoAprovado() + "\n");	
			}
			
			System.out.println("===============RECUPERAÇÃO====================="); /* Different way */
			for (int pos = 0; pos <myMaps.get(StatusAluno.RECUPERACAO).size(); pos++) {
				int getIndex = pos + 1;
					
					System.out.println("ALUNO "+ getIndex +": " + myMaps.get(StatusAluno.RECUPERACAO).get(pos));
					System.out.println("Media: " + myMaps.get(StatusAluno.RECUPERACAO).get(pos).getMedia());
					System.out.println("Status: " + myMaps.get(StatusAluno.RECUPERACAO).get(pos).getAlunoAprovado() + "\n");	
			}
		
		/* System.out.println("======= Alunos são iguais ? =======");
		
		if (aluno1.equals(aluno2)) {
			System.out.println("SIM");
		} else {
			System.out.println("NÃO");
		} */
		
		
		}
	}

}
