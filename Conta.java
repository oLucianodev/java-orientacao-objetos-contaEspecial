package br.com.juninhotech.contaespecial.core;

public class Conta {
   protected String NomeTitular;
   protected String cpf;
   protected int numeroConta;
   protected double saldo;
   
   public Conta(String nomeTitular, String cpf, int numeroConta, double saldo) {
	super();
	NomeTitular = nomeTitular;
	this.cpf = cpf;
	this.numeroConta = numeroConta;
	this.saldo = saldo;
}
   public String getNomeTitular() {
	return NomeTitular;
   }
   public void setNomeTitular(String nomeTitular) {
	NomeTitular = nomeTitular;
   }
   public String getCpf() {
	return cpf;
   }
   public void setCpf(String cpf) {
	this.cpf = cpf;
   }
   public int getNumeroConta() {
	return numeroConta;
   }
   public void setNumeroConta(int numeroConta) {
	this.numeroConta = numeroConta;
   }
   public boolean debitar (double valor) {
	   if ( this.saldo >= valor ) {
		   this.saldo -= valor;
		   return true;
	   }
	   return false;
   }
   public String toString () {
	   return this.NomeTitular + "- CPF: " + this.cpf + " Numero da conta: " + this.numeroConta + " Saldo: R$" + this.saldo;
   }
   
}
