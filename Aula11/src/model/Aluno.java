package model;

public abstract class Aluno extends Pessoa{

	//
	//Atributos
	//
	private int matricula;
	private String curso;
	
	//Getters
	public int getMatricula() {
		return matricula;
	}
	public String getCurso() {
		return curso;
	}
	
	//Setters
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	//
	//Métodos
	//
	public String pagarMensalidade() {
		return "Pagando mensalidade";
	}
	
}