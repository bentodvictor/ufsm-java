package ex;
import java.lang.*;

public class forceex {
	public static void main(String args[]) {
		String vetor[] = {"Exemplo"};
		try {
			imprimirVetor(vetor);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
public static void imprimirVetor(String vet[]) throws MinhaExcecao {
	for (int i = 0; i <= vet.length; i++) {
		if (i == vet.length) {
			throw new MinhaExcecao("i == vet.length");
		}
		System.out.println("vet[" + i + "] = " + vet[i]);
		}
	}
}