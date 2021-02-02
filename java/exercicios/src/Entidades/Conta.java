package Entidades;

import java.util.Scanner;

public class Conta {

	public static void main(String[] args) {
	
		  Scanner leia = new Scanner(System.in);
			
			ContaBancaria contaB = new ContaBancaria();
			System.out.println("Informe titular da conta ");
			contaB.titular = leia.next();
			 
			System.out.println("Informe numero da conta ");
			contaB.numeroConta = leia.nextInt();
			 
			
			System.out.println("Informe Agencia da conta ");
			contaB.agencia = leia.next();
			 
			
			System.out.printf(contaB.titular+"\t"+contaB.numeroConta+"\t"+contaB.agencia);
			//System.out.println(contaB.titular);
			
			
			
			
			
		
	}

}
