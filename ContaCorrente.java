
public class ContaCorrente extends ContaBancaria {
	
	private double desconto;
	
	public ContaCorrente(String nome, Integer numAgencia, Integer numConta, double saldo){
		super(nome, numAgencia, numConta, saldo);
		if(saldo < 50.0){
			throw new RuntimeException("Não pode ser criado conta.");
		}
		this.desconto = 38.00;
		descontaNoSaldo(this.getDesconto());
		
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
}
