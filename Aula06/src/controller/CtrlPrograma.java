package controller;

import model.ControleRemoto;

public class CtrlPrograma {

	public static void main(String[] args) {
		
		ControleRemoto c = new ControleRemoto();
		
		c.ligar();
		c.maisVolume();
		c.maisVolume();
		
		c.abrirMenu();
	}
}