
package aula;

import java.util.Scanner;

public class ProgramaNumero {

    public static void main(String[] args) {
        /* * Fa�a um programa que pegue um n�mero do teclado e calcule a 
         * soma de todos os n�meros  de 1 at� ele. Ex.: o usu�rio entra 7,
         * o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28
         * */

        Scanner ler = new Scanner(System.in);

        double numero = 0.0, soma = 0.0; 


        System.out.println("Entre com o valor do numero: ");
        numero  = ler.nextDouble();
        soma = numero;

        do {
            numero = numero +(soma -1);
            soma --;

        }while(soma>=1);

        System.out.printf("\nA soma de todos os numeros �: %.2f ", numero);

    }

}
	
	


