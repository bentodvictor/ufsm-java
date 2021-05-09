import java.lang.*;

public class ExemploExcecaoFuncaoVetor2 {
	public static void main(String args[]) {
		String vetor[] = {"Exemplo", "Teste" };
		try {
			imprimirVetor(vetor);
		} catch (MinhaExcecao e) {
//			e.printStackTrace();
		} finally {
			System.out.println("BLA");
		}
		System.out.println("SEM CATCH DEPOIS DE FINALLY");
	}
	
	public static void imprimirVetor(String vet[]) throws MinhaExcecao {
		for (int i = 0; i <= vet.length; i++) {
			if (i == vet.length) {
				throw new MinhaExcecao("(" + i + " == vet.length)");
			}
			System.out.println("vet[" + i + "] = " + vet[i]);
		}
	}
}

