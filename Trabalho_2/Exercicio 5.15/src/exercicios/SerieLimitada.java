package exercicios;
/*
 * 5.15) Escreva uma classe SerieLimitada, que encapsula um valor inteiro seqüencial como os usados em notas e séries de gravuras. 
 * Essa classe deve permitir que um programa crie um número limitado de instâncias dela, cada uma numerada com um valor seqüencial. 
 * O número total de instâncias é controlado pelo campo máximoDeInstâncias, declarado como static final, e o de instâncias já criadas é 
 * controlado pelo campo contador declarado como static. 
 * Escreva também uma aplicação que crie algumas instâncias da classe para demonstrar seu funcionamento. 
 */

public class SerieLimitada {
	// Atributos
	private static int seq = 0;					// Recebe o numero encapsulado
	private static int cont = 0;			// Contador de instancias
	private static final int maximoDeInstancias = 3;			// Limite para criar instancias
	
	public SerieLimitada(int numero){		// Recebe o numero encapsulado e chama o metodo para verificar o numero de instancias
		seq = numero;
		maximoDeInstancias(cont);
	}
	
	public static void maximoDeInstancias(int instancias){			// Metodo para verificar numero de instancias
		if (maximoDeInstancias == instancias){				// Se o numero maximo de instancias já foi atingido
			System.out.println("Numero maximo de instancias ja atingido");
		}else{			// Caso contrário instancia é criada e contador é incrementado
			cont++;		// o incremento acontece antes do print para nao ficar "instancia = 0"
			System.out.println("Instancia : " + cont + "\n" + "Numero : " + seq + "\n");
		}
	}
	
	public static SerieLimitada cria(int numero){			// Aplicação para criar instancias 
		return new SerieLimitada(numero);
	}
	
	// Metodo principal
	public static void main(String[] args) {
		SerieLimitada a = SerieLimitada.cria(13213);
		SerieLimitada b = SerieLimitada.cria(434141);
		SerieLimitada c = SerieLimitada.cria(7876876);
		SerieLimitada d = SerieLimitada.cria(321);

	}
}
