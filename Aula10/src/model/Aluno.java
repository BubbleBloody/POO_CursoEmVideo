package model;

public class Aluno extends Pessoa{

	public Aluno() {
		super();
		this.setNome("Juscreuso");
		this.setIdade(17);
	}
	
	private int matr;
	private String curso;

	//Getters
	public String getCurso() {
		return curso;
	}
	public int getMatr() {
		return matr;
	}
	
	//Setters
	public void setCurso(String curso) {
		this.curso = curso;
	}

	public void setMatr(int matr) {
		this.matr = matr;
	}
	
	//Metodos
	public String cancelarMatr() {
		this.setMatr(0);
		
		return "Matricula de " + this.getNome() + " cancelada com sucesso";
	}

	public String toString() {
		return "Aluno:" + "\nNome: " + this.getNome() + "\nIdade: " + this.getIdade() + " anos" 
				+ "\nSexo: " + this.getSexo();
	}
	
}