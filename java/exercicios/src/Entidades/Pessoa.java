package Entidades;

import java.sql.Date;

public class Pessoa {
	public String nome;
	public char genero;
	public Date dataNascimento;
	public int anoNascimento;
	public int cliente;
	public int Pessoa;
	
	public int idade()
	{
		return 2021 - anoNascimento; 
		
	}

}
