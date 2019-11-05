
public class DemoObjetoGeometrico {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circulo c1 = new Circulo(new Ponto2D(0,0),100);
		Circulo c2 = new Circulo(new Ponto2D(10,8),2);
		Retangulo r1 = new Retangulo(new Ponto2D(-2,-2), new Ponto2D(2,2));
		Retangulo r2 = new Retangulo(new Ponto2D(-100,0), new Ponto2D(100,1));
		imprimirTodosOsDados(c1);
		imprimirTodosOsDados(c2);
		imprimirTodosOsDados(r1);
		imprimirTodosOsDados(r2);
	}
	
	public static void imprimirTodosOsDados(ObjetoGeometrico og) {
		System.out.println(og);
		System.out.println("Perimetro: " + og.calculaPerimetro());
		System.out.println("Area: " + og.calculaArea());
		if (og instanceof Circulo) System.out.println("Um circulo!");
		if (og instanceof Retangulo) System.out.println("Um retangulo!");
		if (og instanceof ObjetoGeometrico) System.out.println("Um objeto geometrico!");
		System.out.println();
	}

}
