package aula;

import java.util.Scanner;

public class exercicos2 {
 

public static void main(String[] args)
{
	Scanner scan = new Scanner(System.in);
	
	double custo, distribuidor, imposto, result;
	
	System.out.print("Digite o valor da f�brica em R$");
	custo = scan.nextDouble();
	
	distribuidor = (custo*0.28);
	imposto = (custo*0.45);
	result = custo + distribuidor + imposto;

	System.out.printf("%nCusto ao consumidor � de R$%.2f", result);
}
}
