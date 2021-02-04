package Entidades;

import java.util.Scanner;

public class EscolaIngles {

	public static void main(String[] args) {
		
		 

	Scanner leia = new Scanner(System.in);
		
		Pessoa Aluno = new Pessoa();	
		System.out.println("Informe seu nome completo ");
		Aluno.nome = leia.next();
		System.out.println("Informe ano de Nascimento [aaaa]: ");
		Aluno.anoNascimento = leia.nextInt();
		
			if(Aluno.anoNascimento<18) {
				
				System.out.println(" só podes fazer o curso teen");
			}
			
			
			
	if(Aluno.anoNascimento >18) {
		System.out.println(" podes fazer os cursos");
	
	}
	}
}
