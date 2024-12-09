package projeto.main;

import projeto.classes.Aluno;

public class Principal {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		aluno1.setNome("jose");
		aluno1.setDataMatricula("09/12/2024");
		aluno1.setIdade(30);
		
		aluno1.setNota1(90);
		aluno1.setNota2(84.8);
		aluno1.setNota3(70.4);
		aluno1.setNota4(90.5);
		
		System.out.println(aluno1.getNome());
		System.out.println(aluno1.getDataMatricula());
		System.out.println(aluno1.getIdade());
		System.out.printf("Media do aluno é: "+aluno1.getMediaNota().toString().format("%.2f", aluno1.getMediaNota()));
		System.out.println(aluno1.getAlunoAprovado());
		
		

	}

}
