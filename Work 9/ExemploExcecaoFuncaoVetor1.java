import java.lang.*;

public class ExemploExcecaoFuncaoVetor1 {
	public static void main(String args[]) {
		String vetor[] = {"Exemplo", "Teste" };
		try {
			imprimirVetor(vetor);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exceção em imprimirVetor(String)!");
			e.printStackTrace();
		}
	}
	
	public static void imprimirVetor(String vet[]) throws ArrayIndexOutOfBoundsException {
		for (int i = 0; i <= vet.length; i++) {
			if (i == vet.length) {
				throw new ArrayIndexOutOfBoundsException();
			}
			System.out.println("vet[" + i + "] = " + vet[i]);
		}
	}
}

