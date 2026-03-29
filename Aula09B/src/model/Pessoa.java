package model;

public class Pessoa {
	
	public Pessoa(String nome,  int idade, String sexo) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
	}

	//Atributos
	private String nome, sexo;
	private int idade;
	
	//Getters e Setters
	public String getNome() {
		return nome;
	}
	public String getSexo() {
		return sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//Atributos
	public void fazerAniversario() {
		this.setIdade(getIdade() + 1);
	}
	
}