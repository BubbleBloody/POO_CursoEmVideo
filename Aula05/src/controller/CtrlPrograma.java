package controller;

import java.util.Scanner;
import model.ContaBancaria;

public class CtrlPrograma {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		ContaBancaria c1 = new ContaBancaria();
		
		c1.abrirConta("conta corrente");
		c1.setNomeTitular("Felipe Kropf");
		c1.sacar(20);
		
	}
	
}