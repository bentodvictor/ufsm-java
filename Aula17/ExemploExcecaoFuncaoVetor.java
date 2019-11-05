import java.lang.*;

public class ExemploExcecaoFuncaoVetor {
	public static void main(String args[]) {
		String vetor[] = {"Exemplo", "Teste" };
		try {
			System.out.println("ANTES DO THROW");
			throw new ArrayIndexOutOfBoundsException("Erro!");
//			System.out.println("DEPOIS DO THROW");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exceção em imprimirVetor(String)!");
			e.printStackTrace();
		}
	}
}

