package model;

public class ContaBancaria {
	
	public ContaBancaria(){
		this.setSaldo(0f);
		this.setStatus(false);
	}
	
	//Atributos
	public int numConta;
	protected String tipoConta;
	private String nomeTitular;
	private float saldo;
	private boolean status;
	
	//Métodos
	public void status() {
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo de conta: " + this.getTipoConta());
		System.out.println("Titular: " + this.getNomeTitular());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Aberta: " + this.isStatus());
	}
	
	public void abrirConta(String tipo) {
		if(tipo == "conta corrente" || tipo == "conta poupança") {	//Validação para somente conta corrente ou poupança
			this.setStatus(true);			
				if(tipo == "conta corrente") {	//Conta corrente ganha incentivo de R$50,00 reais, e, poupança de R$150,00
					this.setSaldo(50);
					this.setTipoConta("Conta Corrente");
				}
				else {
					this.setSaldo(150);
					this.setTipoConta("Conta Poupança");
				}
				System.out.println("Conta abrida com sucesso!! :)\n");
		}
		else {
			System.out.println("Erro: Formato inválido, favor definir como 'conta corrente' ou 'conta poupança'\n");
		}
	}
	public void fecharConta() {
		if(this.getSaldo() == 0) 
			this.setStatus(false);
		else 
			System.out.println("Não foi possível fechar a conta, pois contas com saldo: R$" + this.getSaldo() + " não podem ser fechadas\n");
	}
	
	public void depositar(float deposito) {
		if(this.isStatus())
			this.setSaldo(this.getSaldo() + deposito);
		else
			System.out.println("Não é possível depositar pois sua conta está fechada\n");
	}
	public void sacar(float saque) {
		if(this.isStatus() == true && this.getSaldo() > 0 && saque <= this.getSaldo())
			this.setSaldo(this.getSaldo() - saque);		
		//Invalidando saque
		else {							
			if(this.getSaldo() <= 0) 
				System.out.println("Você não possuí saldo para saque (Saldo: R$" + this.getSaldo() + ")\n");
			else if(saque > this.getSaldo())
				System.out.println("Não é possível fazer um saque maior que o saldo (Saldo: R$" + this.getSaldo() + ")\n");
			else
				System.out.println("Não é possível fazer o saque, pois sua conta consta como fechada\n");
		}
	}
	
	public void mensalidade() {
		if(this.getTipoConta() == "conta corrente")
			this.setSaldo(this.getSaldo() - 12);
		else
			this.setSaldo(this.getSaldo() - 20);
	}
	
	//Setters e Getters
	public void setNumConta(int num) {
		this.numConta = num;
	}
	public int getNumConta() {
		return this.numConta;
	}
	
	public void setTipoConta(String tipo) {
		this.tipoConta = tipo;
	}
	public String getTipoConta(){
		return this.tipoConta;
	}
	
	public void setNomeTitular(String nome) {
		this.nomeTitular = nome;
	}
	public String getNomeTitular() {
		return this.nomeTitular;
	}
	
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public float getSaldo() {
		return this.saldo;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	public boolean isStatus() {
		return this.status;
	}
	
}