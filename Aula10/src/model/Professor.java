package model;

public class Professor extends Pessoa{
	
	public Professor() {
		super();
	}
	
	//Atributos
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
	
	//Atributos
	public void receberAumento(float aumento) {
		aumento /= 100;
		
		this.setSalario((this.getSalario() * aumento) + this.getSalario());
	}
	
	public String toString() {
		return "Professor:" + "\nNome: " + this.getNome() + "\nIdade: " + this.getIdade() + " anos" 
				+ "\nSexo: " + this.getSexo() + "\n----------------------------------------------";
	}
	
}