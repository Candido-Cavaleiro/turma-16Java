package Entidades;

public class exercConst {

	public static void main(String[] args) {
		
	
		Construtor1 descricao = new Construtor1("Caneta");
		Construtor1 codigo = new Construtor1(1,"Caneta");
		Construtor1 valor = new Construtor1(0.5,1,"Caneta");
		
		System.out.println("NOME\tCODIGO\tVALOR");
		System.out.print(descricao.nome+"\t"+codigo.codigo+"\t"+valor.valor);
	}


	}


