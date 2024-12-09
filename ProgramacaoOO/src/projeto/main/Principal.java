package projeto.main;

import projeto.classes.Aluno;

public class Principal {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		aluno1.setNome("jose");
		aluno1.setDataMatricula("09/12/2024");
		aluno1.setIdade(30);
		
		System.out.println(aluno1.getNome());
		System.out.println(aluno1.getDataMatricula());
		System.out.println(aluno1.getIdade());
		
		
		

	}

}
