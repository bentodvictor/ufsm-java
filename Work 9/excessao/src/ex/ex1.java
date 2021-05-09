package ex;

public class ex1 {
	public static void main(String args[]){
		String vetor[] = {"Exemplo","Teste"};
		for(int i=0;i<=2;i++){
			try{
				System.out.println(vetor[i]);
			} catch (ArrayIndexOutOfBoundsException ex){
				System.out.println("Posicao inexistente! Vet["+i+"]");
				ex.printStackTrace();
			}
		}
	}
}
