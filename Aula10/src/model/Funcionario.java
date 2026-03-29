package model;

public class Funcionario extends Pessoa{
	
	//Atributos
	private String setor;
	private boolean trabalhando;
	
	//Getters
	public String getSetor() {
		return setor;
	}
	public boolean isTrabalhando() {
		return trabalhando;
	}
	
	//Setters
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}
	
	//
	//Métodos
	//
	public void mudarTrabalho() {
		this.setTrabalhando(!this.isTrabalhando());
	}
	
	public String toString() {
		return "Aluno:" + "\nNome: " + this.getNome() + " Idade: " + this.getIdade() + " anos" 
				+ "Sexo: " + this.getSexo();
	}
}