
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaBancaria cliente1 = new ContaCorrente("Gelly", 2555, 417036, 50.0);
		ContaBancaria cliente2 = new ContaPoupanca("Marciel", 4587, 555555, 190.0);
		System.out.println("========== 1 ==========");
		cliente1.efetuarDeposito(500.0);
		cliente1.imprimeConta(cliente1);
		try{
			cliente1.saque(50.0);
		} catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		

		System.out.println("========== 2 ==========");
		cliente1.imprimeConta(cliente1);
		cliente2.imprimeConta(cliente2);
		
	}

}
