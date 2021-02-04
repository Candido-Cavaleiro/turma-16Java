package Entidades;



public class L06Empresa {

	public static void main(String[] args) {
		
		Q01Pessoa pessoa1 = new Q01Pessoa("Jo�o","Rua massa","99999-9999");
		Q02Fornecedor fornecedor1 = new Q02Fornecedor("john","Rua legal","88888-8888");
		Q03Empregado empregado1 = new Q03Empregado("Marta","Rua bacana","77777-7777");
		Q04Administrador administrador1 = new Q04Administrador("Francisco","Rua joinha","66666-6666");
		Q05Operario operario1 = new Q05Operario("Josefina","Rua chuchu beleza","55555-5555");
		Q06Vendedor vendedor1 = new Q06Vendedor("Osvaldo","Rua belezura","44444-4444");
		
		fornecedor1.setValorCredito(50000);
		fornecedor1.setValorDivida(4000);
		
		empregado1.setCodigoSetor(1);
		empregado1.setSalarioBase(21000);
		empregado1.setImposto(30);
		
		administrador1.setAjudaDeCusto(10000);
		
		operario1.setValorProducao(50000);
		operario1.setComissao(50);
		
		
		
		vendedor1.setValorVendas(40000);
		vendedor1.setComissao(20);
		
		System.out.println(pessoa1.getNome()+" - "+pessoa1.getEndereco()+" - "+pessoa1.getTelefone());
		System.out.println();
		System.out.println(fornecedor1.getNome()+" - "+fornecedor1.getEndereco()+" - "+fornecedor1.getTelefone());
		System.out.println(fornecedor1.obterSaldo());
		System.out.println();
		System.out.println(empregado1.getNome()+" - "+empregado1.getEndereco()+" - "+empregado1.getTelefone());
		System.out.println(empregado1.calcularSalario());
		System.out.println();
		System.out.println(administrador1.getNome()+" - "+administrador1.getEndereco()+" - "+administrador1.getTelefone());
		System.out.println(administrador1.getAjudaDeCusto());
		System.out.println();
		System.out.println(operario1.getNome()+" - "+operario1.getEndereco()+" - "+operario1.getTelefone());
		System.out.println(operario1.salarioOperario());
		System.out.println();
		System.out.println(vendedor1.getNome()+" - "+vendedor1.getEndereco()+" - "+vendedor1.getTelefone());
		System.out.println(vendedor1.salarioVendedor());
		
	}
}