package model;

public class Livro implements Publicacao{
	
	public Livro(String livro, String autor, int qtdPaginas, Pessoa leitor) {
		this.setLivro(livro);
		this.setAutor(autor);
		this.setQtdPaginas(qtdPaginas);
		this.setLeitor(leitor);
		
		//Não recebem parâmetros:
		this.setAberto(false);
	}
	
	//
	//Atriutos
	//
	private String livro, autor;
	private int qtdPaginas, pagAtual;
	private boolean aberto;
	private Pessoa leitor;	
	
	//
	//Métodos Especiais
	//
	
	//Getters:
	public String getLivro() {
		return livro;
	}
	public String getAutor() {
		return autor;
	}
	public int getQtdPaginas() {
		return qtdPaginas;
	}
	public int getPagAtual() {
		return pagAtual;
	}
	public boolean isAberto() {
		return aberto;
	}
	public Pessoa getLeitor() {
		return leitor;
	}
	
	//Setters:
	public void setLivro(String livro) {
		this.livro = livro;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public void setQtdPaginas(int qtdPaginas) {
		this.qtdPaginas = qtdPaginas;
	}
	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	
	//
	//Métodos
	//
	public String detalhes() {
		return "Livro \n[Livro = " + livro + " Autor = " + autor + 
				"\nqtdPaginas = " + qtdPaginas + " PagAtual = " + pagAtual
				+ " Aberto = " + aberto + "\nLeitor = " + leitor.getNome() + "]\n";
	}
	
	//Metodos implementados:
	@Override
	public void abrir() {
		if(!(this.isAberto()))
			this.setAberto(true);
	}
	@Override
	public void fechar() {
		if(this.isAberto())
			this.setAberto(false);
	}
	@Override
	public void folhear(int pgn) {
		if(this.isAberto() && pgn <= this.getQtdPaginas())
			this.setPagAtual(pgn);
		else
			this.setPagAtual(this.getPagAtual());
	}
	@Override
	public void avançarPag() {
		if(this.isAberto())
			this.setPagAtual(this.getPagAtual() + 1);
	}
	@Override
	public void voltarPag() {
		if(this.isAberto())
			this.setPagAtual(this.getPagAtual() - 1);
	}
	
}