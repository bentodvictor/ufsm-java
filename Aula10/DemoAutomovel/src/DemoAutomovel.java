
public class DemoAutomovel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutomovelBasico a1 = new AutomovelBasico("Up", "branco", Automovel.MOVIDOAGASOLINA); 
		AutomovelDeLuxo a2 = new AutomovelDeLuxo("Jetta", "preto", Automovel.MOVIDOAALCOOL);
		System.out.println(a1 + " " + a1.quantoCusta() + "\n" + a1.quantasPrestacoes());
		System.out.println(a2 + " " + a2.quantoCusta() + "\n" + a2.quantasPrestacoes());
	}

}
