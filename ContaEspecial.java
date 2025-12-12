package br.com.juninhotech.contaespecial.core;

public class ContaEspecial extends Conta {
   private double limite;
   public ContaEspecial (String nomeTitular, String cpf, int numeroConta, double saldo, double limite) {
	   super(nomeTitular,cpf,numeroConta,saldo);
	   this.limite = limite;
	   }
   public String toString() {
	  return super.NomeTitular + "- CPF: " + super.cpf + " Numero da conta: " + super.numeroConta + " Saldo: R$" + super.saldo + " limite: " + this.limite;
   }
   public double getLimite() {
	return limite;
   }
   public void setLimite(double limite) {
	this.limite = limite;
   }
  public boolean debitar(double valor) {
	 if (super.saldo + this.limite >= valor) {
		 super.saldo -= valor;
		 return true;
		 }
	 return false;
  }
  
}
