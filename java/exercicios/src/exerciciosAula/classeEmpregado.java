package exerciciosAula;

public class classeEmpregado {

  private String nome;
  private int matricula;
  private int horas;
  double valorHora;
  
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getMatricula() {
	return matricula;
}
public void setMatricula(int matricula) {
	this.matricula = matricula;
}
public int getHoras() {
	return horas;
}
public void setHoras(int horas) {
	this.horas = horas;
}
public double getValorHora() {
	return valorHora;
}
public void setValorHora(double valorHora) {
	this.valorHora = valorHora;
}
public double salario() {
	
	return valorHora * horas;
	
}
}