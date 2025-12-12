package br.com.juninhotech.contaespecial.interfacee;

import br.com.juninhotech.contaespecial.core.Conta;
import br.com.juninhotech.contaespecial.core.ContaEspecial;
public class Banco {
	public static void main(String[] args) {
		Conta c = new Conta ("Obede","90098766",6776,100);
		System.out.println(c);
		ContaEspecial e = new ContaEspecial ("Juninho","85558",8876,100,1000); 
		System.out.println(e);
		if (e.debitar(300)) {
			System.out.println("debitado com sucesso");
		}
		else {
			System.out.println("saldo insuficiente");
		}
		System.out.println(e);
	}

}
