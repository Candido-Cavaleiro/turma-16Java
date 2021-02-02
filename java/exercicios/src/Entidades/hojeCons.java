package Entidades;

public class hojeCons {

	public static void main(String[] args) {
		
		package exemplos;

		import entidades.ConstrutorItem1;

		public class Item1 {
			public static void main(String[] args) {
			
				ConstrutorItem1 descricao = new ConstrutorItem1("Caneta");
				ConstrutorItem1 codigo = new ConstrutorItem1(1,"Caneta");
				ConstrutorItem1 valor = new ConstrutorItem1(0.5,1,"Caneta");
				
				System.out.println("NOME\tCODIGO\tVALOR");
				System.out.print(descricao.nome+"\t"+codigo.codigo+"\t"+valor.valor);
			}
		}


	}
	

}
