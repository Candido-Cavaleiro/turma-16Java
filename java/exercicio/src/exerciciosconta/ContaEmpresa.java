package exerciciosconta;

import java.util.Scanner;


public class ContaEmpresa {

	  public static void main(String[] args){
	        // Declarando as variáveis, Scanner 
	        String nome;
	        double inicial, Conta;
	        Scanner entrada = new Scanner(System.in);
	        Scanner numero = new Scanner(System.in);
	        int conta = 1 + numero.nextInt();
	    
	        //Obtendo os dados iniciais da Empresa
	        System.out.println("Cadastrando novo empresa.");
	        System.out.print("Entre com o nome: ");
	        nome = entrada.nextLine();
	        
	        System.out.print("Entre com o valor inicial depositado na conta: ");
	        inicial = entrada.nextDouble();
	        
	        //Criando a conta de um cliente
	        Conta = new Conta(nome, conta, inicial);
	        Conta.iniciar();
	  }
}
