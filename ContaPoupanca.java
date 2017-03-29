public class ContaPoupanca extends ContaBancaria{

	private double taxa;
	public ContaPoupanca(String titular, Integer numAgencia, Integer numConta, double deposito){
	
		super(titular, numAgencia, numConta, deposito);
		if(deposito < 100.0){
			throw new RuntimeException("Conta poupança não pode ser aberta");		
		}
		this.taxa = 1.89;
	}
	public double getTaxa(){
		return this.taxa;
	}
	public void setTaxa(double taxa){
		this.taxa = taxa;
	}
	public void calculaNovoSaldo(Integer tempo){
		double rendimento = getSaldo()*0.0189*tempo;
		efetuarDeposito(rendimento);
	}
}
