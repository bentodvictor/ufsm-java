


public class ExemploExcecaoVetor1 {
	public static void main(String args[]) {
		String vetor[] = {"Exemplo", "Teste" };
		for (int i = 0; i  <= 3 ; i++) {

			try {
				System.out.println("ANTES DO VETOR");
				System.out.println(vetor[i]);
				System.out.println("DEPOIS DO VETOR");
				System.out.println(vetor[i]);

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Erro acessando vetor posicao " + i);
			} finally {
				System.out.println("Finally para vetor posicao " + i);
			}
		}
	}
}

