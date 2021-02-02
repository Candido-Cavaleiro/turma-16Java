package Entidades;

import java.util.Scanner;

public class Avião {

	public static void main(String[] args) {
		
		
		   Scanner leia = new Scanner(System.in);
			
			Aviao Gt= new Aviao();
			System.out.println("Informe nome do fabricante");
			Gt.nomeFabricante =leia.next();
			
			System.out.println("Informe numero de Modelo");
			Gt.numeroModelo =leia.next();
			
			System.out.println("Informe numero de Assentos");
			Gt.numeroAssentos =leia.nextInt();
			
			//System.out.println(" Avião "  + Gt.nomeFabricante );
			//System.out.println(" Avião " + Gt.numeroModelo );
			//System.out.println(" Avião " + Gt.numeroAssentos );
			
			System.out.print(Gt.nomeFabricante+"\t"+Gt.numeroModelo+"\t"+Gt.numeroAssentos);
			



	}

}