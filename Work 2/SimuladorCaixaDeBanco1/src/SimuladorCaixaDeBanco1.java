
public class SimuladorCaixaDeBanco1 {

	private int numeroDoCliente;
	private int numeroDoCaixa;
	
	SimuladorCaixaDeBanco1(int n) {
		numeroDoCaixa = n;
		numeroDoCliente = 0;
		System.out.println("Caixa " + numeroDoCaixa + " iniciou operação!");
	}
	
	public void iniciaAtendimento() {
		numeroDoCliente++;
		System.out.print("Cliente com a senha número " + numeroDoCliente + ", favor ");
		System.out.println("dirigir-se imediatamente ao caixa número " + numeroDoCaixa + "!");
	}
	
}
