
public class Conta {
	private double saldo;// a palavra private encapsula a vari�vel saldo restringindo seu acesso apenas
							// por um m�todo
	int agencia;
	int numero;
	Cliente titular;

	public void deposita(double valor) { // isso � um m�todo ele � criado dentro da classe principal
		this.saldo += valor; // aqui � o que o m�todo faz this.saldo = this.saldo + valor;(outra forma de
								// escrever)

	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;// this.saldo = this.saldo - valor (outra forma de escrever)
			return true;
		} else {
			return false;
		}

	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}

	public double getSaldo() {
		return this.saldo;
	}

}
