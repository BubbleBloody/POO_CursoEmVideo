package model;

class Pessoa {
	
	public Pessoa(){
		this.setNome("João");
		this.setIdade(25);
		this.setSexo("Masculino");
	}
	
	private String nome, sexo;
	private int idade;
	
	//Getters
	public String getNome() {
		return nome;
	}
	public String getSexo() {
		return sexo;
	}
	public int getIdade() {
		return idade;
	}
	
	//Setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//Metodos
	public void fazerAniv() {
		this.setIdade(this.getIdade() + 1);
	}	
}