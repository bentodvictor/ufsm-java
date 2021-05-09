
public class DemoCirculoEscalavel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CirculoEscalavel c1 = new CirculoEscalavel(new Ponto2D(0,0),100);
		imprimirTodosOsDados(c1);
		c1.Amplia(2);
		imprimirTodosOsDados(c1);
	}
	
	public static void imprimirTodosOsDados(ObjetoGeometrico og) {
		System.out.println(og);
		System.out.println("Perímetro: " + og.calculaPerimetro());
		System.out.println("Área: " + og.calculaArea());
		if (og instanceof CirculoEscalavel) System.out.println("Um círculo!");
		if (og instanceof Escalavel) System.out.println("Um objeto escalavel!");
		if (og instanceof ObjetoGeometrico) System.out.println("Um objeto geométrico!");
		System.out.println();
	}

}
