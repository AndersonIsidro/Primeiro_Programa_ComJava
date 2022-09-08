package Banco;

public class Conta {
	float saldo;
	String conta;
	//aqui vamos definir o que acontece assim que a pessoa cria uma conta
	
	public Conta(String conta) {
		saldo = 0;
		this.conta = conta;		
	}
	public void depositar(float deposito) {
		saldo += deposito;
	}
	public void sacar (float sacar) {
		if(sacar > saldo) {
			System.out.println("Você Não tem saldo suficiente!");
		}
		else {
			saldo -= sacar;
		}
	}
	public String toString () {
		return "Saldo atual:" + saldo;
	}

}
