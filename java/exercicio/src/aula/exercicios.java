package aula;

import java.util.Scanner;

public class exercicios 
{
  public static void main(String[] args)
  {
	 
	Scanner leia = new Scanner(System.in);
			
		  int dias, meses, anos, idade, soma;
		  System.out.println("Digite os anos:");
		   anos = leia.nextInt();
		   
		   System.out.println(" Digite os meses:");
		   meses= leia.nextInt();
		   
		   System.out.println("Digite dias:");
		   dias= leia.nextInt();
		   
		   soma=(anos*365 + meses*30+dias);
		System.out.println("ln Sua idade em dias é de"+soma+"dias");
	 
  }
}
