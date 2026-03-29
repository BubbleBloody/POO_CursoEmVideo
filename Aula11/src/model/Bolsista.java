package model;

public final class Bolsista extends Aluno{
	//
	//Atributo
	//
	private float bolsa;
	
	//Getter
	public float getBolsa() {
		return bolsa;
	}
	//Setter
	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
	
	//
	//Metodos
	//
	@Override
	public String pagarMensalidade() {
		return "Pagando mensalidade com desconto";
	}
	
}