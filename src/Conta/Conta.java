package Conta;

public class Conta {
		// atributos 
		String nome;
		double saldo;
		double limite;
		
		// metodos de interação
		void sacarVolor(double valor) {
			this.saldo = this.saldo - valor;
		}
		
		void depositarVolor(double valor) {
			this.saldo = this.saldo + valor;
		}
}
