package model;

public interface Publicacao {
	
	public void abrir();
	public void fechar();
	public void folhear(int pgn);
	public void avançarPag();
	public void voltarPag();
}