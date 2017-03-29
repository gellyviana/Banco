
public class ContaBancaria {
	
	private String titular;
	private Integer numAgencia;
	private Integer numConta;
	private double saldo;
	
	public ContaBancaria(String titular, Integer numAgencia, Integer numConta, double saldo){
		this.titular = titular;
		this.numAgencia = numAgencia;
		this.numConta = numConta;
		this.saldo = saldo;
		
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public Integer getNumAgencia() {
		return numAgencia;
	}
	public void setNumAgencia(Integer numAgencia) {
		this.numAgencia = numAgencia;
	}
	public Integer getNumConta() {
		return numConta;
	}
	public void setNumConta(Integer numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double verificarSaldo() {
		return this.getSaldo();
	}
	public void efetuarDeposito(double valor){
		if(valor <= 0){
			System.out.println("Valor inválido");
		}
		else{
			this.saldo += valor;
			System.out.println("O valor depositado na conta: " + valor);
		}
	}
	public void saque(double valor){
		if(valor > this.getSaldo()){
			throw new IllegalArgumentException("Saldo negativo");
		}
		else{
			this.saldo -= valor;
		}

	}
	public void descontaNoSaldo(double valor){
		this.saldo -= valor;
	}
	public void imprimeConta(ContaBancaria conta){
		System.out.println("=======================");
		System.out.println("Titular: " + conta.getTitular());
		System.out.println("Saldo: " + conta.getSaldo());
		//System.out.println("================");
	}

}
