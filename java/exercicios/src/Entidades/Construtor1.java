package Entidades;

public class Construtor1 {

	public double valor;
	public int codigo;
	public String nome;
	
	public Construtor1(String nome) {
		this.nome = nome;
	}

	public Construtor1(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

	public Construtor1(double valor, int codigo, String nome) {
		this.valor = valor;
		this.codigo = codigo;
		this.nome = nome;
	}
	
	
}


