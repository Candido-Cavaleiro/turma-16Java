package Entidades;

import java.util.Scanner;

public class Avi�o {

	public static void main(String[] args) {
		
		
		   Scanner leia = new Scanner(System.in);
			
			Aviao Gt= new Aviao();
			System.out.println("Informe nome do fabricante");
			Gt.nomeFabricante =leia.next();
			
			System.out.println("Informe numero de Modelo");
			Gt.numeroModelo =leia.next();
			
			System.out.println("Informe numero de Assentos");
			Gt.numeroAssentos =leia.nextInt();
			
			//System.out.println(" Avi�o "  + Gt.nomeFabricante );
			//System.out.println(" Avi�o " + Gt.numeroModelo );
			//System.out.println(" Avi�o " + Gt.numeroAssentos );
			
			System.out.print(Gt.nomeFabricante+"\t"+Gt.numeroModelo+"\t"+Gt.numeroAssentos);
			



	}

}