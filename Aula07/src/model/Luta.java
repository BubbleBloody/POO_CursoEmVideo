package model;

import java.util.Random;

public class Luta {

	//Atributos
	private Lutador desafiante, desafiado;
	private int rounds;
	private boolean aprovada;
	
	//Getters e Setters	
	public Lutador getDesafiante() {
		return this.desafiante;
	}

	public Lutador getDesafiado() {
		return this.desafiado;
	}

	public int getRounds() {
		return this.rounds;
	}

	public boolean isAprovada() {
		return this.aprovada;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}

	//Metodos
	public void marcarLuta(Lutador l1, Lutador l2) {
		if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
			this.setAprovada(true);
			this.setDesafiante(l1);
			this.setDesafiado(l2);
			System.out.println("Luta marcada com sucesso!!");
		}	
		else {
			this.setAprovada(false);
			this.setDesafiante(null);
			this.setDesafiado(null);
			System.out.println("Luta não pode ser marcada");
		}
	}
	
	public void lutar() {
		if(this.isAprovada()) {
			desafiado.apresentar();
			desafiante.apresentar();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
			switch(vencedor) {
				case 0:	//Empate
					System.out.println("Luta empatou!");
					desafiante.empatarLuta();
					desafiado.empatarLuta();		
					break;
					
				case 1:	//Desafiante Vence Luta
					System.out.println(desafiante.getNome() + " venceu!!\n");
					desafiante.ganharLuta();
					desafiado.perderLuta();
					break;
					
				case 2:	//Desafiado Vence Luta
					System.out.println(desafiado.getNome() + " venceu!!\n");
					desafiante.perderLuta();
					desafiado.ganharLuta();
					break;
			}
			
			desafiado.status();
			desafiante.status();
			
		}
		else {
			System.out.println("A luta não pode acontecer");
		}
	}
}