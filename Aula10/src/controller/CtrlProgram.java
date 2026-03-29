package controller;

import model.Professor;
import model.Aluno;
import model.Funcionario;

public class CtrlProgram {

	public static void main(String[] args) {
		
		Professor pr = new Professor();
		Aluno a = new Aluno();
		Funcionario f = new Funcionario();
		
		System.out.println(pr.toString());
		System.out.println(a.toString());
	}

}
