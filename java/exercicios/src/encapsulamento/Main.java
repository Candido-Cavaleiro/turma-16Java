package encapsulamento;

public class Main {

	public static void main(String[] args) {
		Class1 camiseta = new Class1("Algodão","Manga longa","Alta","Florido","Nike","Verde");
		Class2 calca= new Class2("Jeans","Classica","Grande",true,"Adidas","Azul");

		
		camiseta.vestir();
		
		calca.setBolso("pequeno");
		System.out.println(calca.getBolso());
	}

 
}
