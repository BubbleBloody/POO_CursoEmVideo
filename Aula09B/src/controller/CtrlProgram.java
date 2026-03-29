package controller;

import model.Livro;
import model.Pessoa;

public class CtrlProgram {

	public static void main(String[] args) {
		
		Pessoa[] pessoas = new Pessoa[2];
		Livro[] livros = new Livro[3];
		
		pessoas[0] = new Pessoa("Felipe", 25, "Masculino");
		pessoas[1] = new Pessoa("Maria Eduarda", 19, "Feminino");
		
		livros[0] = new Livro("O Universo Numa Casca de Noz", "Stephen Hawking"
				,  215, pessoas[0]);
		livros[1]= new Livro("Pálido Ponto Azul", "Carl Sagan", 336, pessoas[0]);
		livros[2] = new Livro("Armas, Germes e Aço", "Jared Diamond", 474, pessoas[1]);
		
		livros[2].abrir();
		System.out.println(livros[2].detalhes());
		livros[2].folhear(14);
		System.out.println(livros[2].detalhes());
	}

}