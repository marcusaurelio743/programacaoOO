package projeto.main;

import java.util.Scanner;

import projeto.classes.Aluno;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o nome:");
		String nome = sc.nextLine();
		sc.nextLine();
		System.out.println("Informe a idade");
		Integer idade = sc.nextInt();
		sc.nextLine();
		System.out.println("informe a data de nascimento");
		String dataNascimento = sc.nextLine();
		System.out.println("informe O RG");
		String registroGeral = sc.nextLine();
		System.out.println("informe O cpf");
		String cpf = sc.nextLine();
		System.out.println("informe O nome da mãe");
		String nomeMae = sc.nextLine();
		System.out.println("informe O nome do pai");
		String nomePai = sc.nextLine();
		System.out.println("informe a data de Matricula");
		String dataMatricula = sc.nextLine();
		System.out.println("informe a serie");
		String serie = sc.nextLine();
		System.out.println("informe O nome da escola");
		String nomeEscola = sc.nextLine();
		
		sc.nextLine();
		System.out.println("informe a nota 1 ");
		double nota1 = sc.nextDouble();
		System.out.println("informe a nota 2 ");
		double nota2 = sc.nextDouble();
		System.out.println("informe a nota 3 ");
		double nota3 = sc.nextDouble();
		System.out.println("informe a nota 4 ");
		double nota4 = sc.nextDouble();
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome(nome);
		aluno1.setCPF(cpf);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setIdade(idade);
		aluno1.setNomeEscola(nomeEscola);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setNota1(nota1);
		aluno1.setNota2(nota2);
		aluno1.setNota3(nota3);
		aluno1.setNota4(nota4);
		aluno1.setRegistroGeral(registroGeral);
		aluno1.setSerieMatriculado(serie);
		
		
		
		System.out.println(aluno1.getNome());
		System.out.println(aluno1.getDataMatricula());
		System.out.println(aluno1.getIdade());
		System.out.printf("Media do aluno é: "+aluno1.getMediaNota().toString().format("%.2f", aluno1.getMediaNota()));
		System.out.println(aluno1.getAlunoAprovado());
		
		
		sc.close();
		
		

	}

}
