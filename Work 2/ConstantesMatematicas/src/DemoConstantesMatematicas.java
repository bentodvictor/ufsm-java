
public class DemoConstantesMatematicas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstantesMatematicas c1 = new ConstantesMatematicas();
		ConstantesMatematicas c2 = new ConstantesMatematicas();
		System.out.println(c1.raizDe2 == c2.raizDe2);
		System.out.println(c1.raizDe3 == c2.raizDe2);
		System.out.println(c1.raizDe5 == ConstantesMatematicas.raizDe5);
		System.out.println(ConstantesMatematicas.raizDe6 == c2.raizDe6);
		double raizDe10 = ConstantesMatematicas.raizDe2 * ConstantesMatematicas.raizDe5;
		System.out.println("A raiz quadrada de 10 = " + raizDe10);
		
	}

}
