package exerciciosAula;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println(" informe sua matricula:");
		int matricula = ler.nextInt();
		System.out.println("informe seu nome: ");
		String nome = ler.next();
		System.out.println("quantas horas de trabalho: ");
		int horas = ler.nextInt();
		System.out.println("qual é o valor  da hora trabalhada: ");
		double valorhora = ler.nextDouble();
		System.out.println("Você é terceiro [S/N]");
		char opcao = ler.next().toUpperCase().charAt(0);
		
		Object acrescimo;
		Terceiro info = new Terceiro(nome, matricula, acrescimo);
		 
		 if(opcao == 'S') {
			 
			 info.salario();
		 }
		 else if (opcao == 'N') {
		 Empregado infoEmpregado = new Empregado;
		 infoEmpregado.salario();
		 
		 System.out.println(" oi %s, sua matricula é %d", info.getNome(), info.getMatricula(), info.gethoras,);
		 }

	}

}
