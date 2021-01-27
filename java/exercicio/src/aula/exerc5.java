package aula;

import java.util.Scanner;

public class exerc5
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		double n1,n2,n3, media;

		System.out.print("Digite a Primeira nota: ");
		n1 = scan.nextDouble();

		System.out.print("Digite a Segunda nota: ");
		n2 = scan.nextDouble();

		System.out.print("Digite a Terceira nota: "); 
		n3 = scan.nextDouble();

		media = (n1*0.2 + n2*0.3 + n3*0.5);
		
		System.out.println("\nO valor da sua média é: "+ media);
		
	}	
}
