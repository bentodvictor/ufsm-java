
public class DemoAutomovel1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutomovelBasico a1 = new AutomovelBasico("Up", "branco", Automovel.MOVIDOAGASOLINA); 
		AutomovelDeLuxo a2 = new AutomovelDeLuxo("Jetta", "preto", Automovel.MOVIDOAALCOOL);
//		System.out.println(a1 + " " + a1.quantoCusta() + "\n" + a1.quantasPrestacoes());
//		System.out.println(a2 + " " + a2.quantoCusta() + "\n" + a2.quantasPrestacoes());
		imprimir(a1);
		imprimir(a2);
	}

	// Polimorfismo de AutomovelBasico e AutomovelDeLuxo se passando como Automovel
	public static void imprimir(Automovel a) {
		System.out.println("Dados específicos do carro:\n");
		System.out.println(a);
		System.out.println("Custa: " + a.quantoCusta());
		System.out.println("Prestções: " + a.quantasPrestacoes());
	}
}
