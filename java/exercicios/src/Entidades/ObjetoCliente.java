package Entidades;

import java.util.Scanner;

public class ObjetoCliente {

	public static void main(String[] args) {
		
      Scanner leia = new Scanner(System.in);
		
		Cliente Vip = new Cliente();
		System.out.println("Informe seu nome ");
		Vip.nome =leia.next();
		
		System.out.println("Informe ano de Nascimento [aaaa]: ");
		Vip.anoNascimento = leia.nextInt();
		
		System.out.println("Informe genero: ");
		Vip.genero = leia.next().charAt(0);
		
		System.out.println(" Cliente "  + Vip.nome );	
		
		System.out.println("sua idade é: " + Vip.idade());
		
	}
	

}
