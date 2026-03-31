package model;

public class Lutador {
	
	public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
		
	}
	
	//Atributos
	private String nome, nacionalidade, categoria;
	private int idade, vitorias, derrotas, empates;
	private float altura, peso;

	//Getters
	public String getNome() {
		return this.nome;
	}
	public String getNacionalidade() {
		return this.nacionalidade;
	}
	public int getIdade() {
		return this.idade;
	}
	public float getAltura() {
		return this.altura;
	}
	public float getPeso() {
		return this.peso;
	}
	public String getCategoria() {
		return categoria;
	}
	public int getVitorias() {
		return vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	
	//Setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}
	
	private void setCategoria() {
		if(this.getPeso() < 52.2f) 
			this.categoria = "Inválido";
		else if(this.getPeso() <= 70.3f)
			this.categoria = "Leve";
		else if(this.getPeso() <= 83.9f)
			this.categoria = "Médio";
		else if(this.getPeso() <= 120.2f)
			this.categoria = "Pesado";
		else
			this.categoria = "Inválido";
	}
	
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	//Metodos
	public void apresentar() {
		System.out.println("-----------------------------------------------------------");
		System.out.println("CHEGOU A HORA!! Apresentamos o lutador " + this.getNome() + ".");
		System.out.println("\nOrigem: " + this.getNacionalidade());
		System.out.println(this.getIdade() + " anos");
		System.out.println(this.getAltura() + "m de altura");
		System.out.println("Pesando: " + this.getPeso() + "KG");
		System.out.println("\nV: " + this.getVitorias() + " | D: " + this.getDerrotas() + " | E: " + this.getEmpates());
		System.out.println("-----------------------------------------------------------");
	}
	
	public void status() {
		System.out.println(this.getNome() + " é um " + this.getCategoria());
		System.out.println("Vitórias: " + this.getVitorias() + "\nDerrotas: " + this.getDerrotas() + "\nEmpates: " + this.getEmpates());
	}
	
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}
	
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}
	
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}
	
}