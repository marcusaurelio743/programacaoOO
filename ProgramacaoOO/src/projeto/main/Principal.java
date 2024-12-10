package projeto.main;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import projeto.classes.Aluno;
import projeto.classes.Disciplina;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o nome:");
		String nome = sc.nextLine();
		
		System.out.println("Informe a idade");
		Integer idade = sc.nextInt();
		
		System.out.println("informe a data de nascimento");
		String dataNascimento = sc.nextLine();
		sc.nextLine();
		System.out.println("informe O RG");
		String registroGeral = sc.nextLine();
		System.out.println("informe O cpf");
		String cpf = sc.nextLine();
		/*
		System.out.println("informe O nome da mãe");
		String nomeMae = sc.nextLine();
		System.out.println("informe O nome do pai");
		String nomePai = sc.nextLine();
		System.out.println("informe a data de Matricula");
		String dataMatricula = sc.nextLine();
		System.out.println("informe a serie");
		String serie = sc.nextLine();
		System.out.println("informe O nome da escola");
		String nomeEscola = sc.nextLine();*/
		
		
		
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome(nome);
		aluno1.setIdade(idade);
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setCPF(cpf);
		aluno1.setRegistroGeral(registroGeral);
		
		for(int i = 0; i< 3; i++) {
			System.out.println("Informe o nome da disciplina "+(i+1));
			String disciplina = sc.nextLine();
			System.out.println("Informe a nota disciplina "+(i+1));
			double nota = sc.nextDouble();
			
			Disciplina disci = new Disciplina();
			disci.setDisciplina(disciplina);
			disci.setNota(nota);
			sc.nextLine();
			aluno1.getDisciplinas().add(disci);
			
		}
		/*aluno1.setDataMatricula(dataMatricula);
		aluno1.setNomeEscola(nomeEscola);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setNota1(nota1);
		aluno1.setNota2(nota2);
		aluno1.setNota3(nota3);
		aluno1.setNota4(nota4);
		aluno1.setSerieMatriculado(serie);*/
		
		
		
		System.out.println(aluno1);
		System.out.printf("Media do aluno é: "+aluno1.getMediaNota().toString().format("%.2f", aluno1.getMediaNota()));
		System.out.println(aluno1.getAlunoAprovado());
		
		
		
		sc.close();
		
		

	}

}
