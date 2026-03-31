package model;

public class ControleRemoto implements Controlador{
	
	//Atributos
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	//Metodo Construtor
	public ControleRemoto(){
		this.setVolume(50);
		this.setLigado(false);
		this.setTocando(false);
	}	
	
	//Setters e Getters
	private void setVolume(int volume) {
		this.volume = volume;
	}
	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	
	private int getVolume() {
		return this.volume;
	}
	private boolean isLigado() {
		return this.ligado;
	}
	private boolean isTocando() {
		return this.tocando;
	}
	
	//Metodos Abstratos
	@Override
	public void ligar() {
		this.setLigado(true);
	}

	@Override
	public void desligar() {
		this.setLigado(false);
	}

	@Override
	public void abrirMenu() {
		System.out.println("\n---------------------- MENU: ----------------------");
		System.out.println("Ligado?: " + this.isLigado());
		System.out.println("Está tocando?: " + this.isTocando());
		System.out.print("Volume: " + this.getVolume() + " ");
			for(int i = 0; i < this.getVolume(); i+=5) {
				System.out.print("I");
			}
		System.out.println("\n---------------------------------------------------");
	}

	@Override
	public void fecharMenu() {
		System.out.println("Fechando menu\n");
	}

	@Override
	public void maisVolume() {
		if(this.isLigado())
			this.setVolume(this.getVolume() + 5);
	}

	@Override
	public void menosVolume() {
		if(this.isLigado()) 
			this.setVolume(this.getVolume() - 5);
	}

	@Override
	public void ligarMudo() {
		if(this.isLigado() && this.getVolume() > 0)
			this.setVolume(0);
	}

	@Override
	public void desligarMudo() {
		if(this.isLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
	}

	@Override
	public void play() {
		if(this.isLigado() && !(this.isTocando()))
			this.setTocando(true);
	}

	@Override
	public void pause() {
		if(this.isLigado() && this.isTocando())
			this.setTocando(false);
	}
}