package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercaula{

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US); //define o tipo de padronização
		//area = base * altura / 2
		Scanner leia = new Scanner(System.in);//instaciar = criar
		double base, altura, area;
		
		System.out.println("Digite a base do triangulo: ");
		base = leia.nextDouble();
		System.out.println("Digite a altura do triangulo: ");
		altura = leia.nextDouble();
		
		area = ((base * altura) / 2 );
		
		System.out.printf("A area do triangulo informado é %.2f", area);

	}

}
