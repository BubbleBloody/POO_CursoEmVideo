package model;

public class Professor extends Pessoa{
	//
	//Atributos
	//
	private String especialidade;
	private float salario;
	
	//Getters
	public String getEspecialidade() {
		return especialidade;
	}
	public float getSalario() {
		return salario;
	}
	
	//Setters
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	//
	//Métodos
	//
	public void recebeAumento(float aumento) {
		this.setSalario(this.getSalario() + aumento);
	}
	
}