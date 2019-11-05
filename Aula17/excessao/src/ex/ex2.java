package ex;

public class ex2 {
	public static void main(String args[]){
		String vetor[] = {"Exemplo","Teste"};
		for(int i=0;i<=2;i++){
			try{
				System.out.println(vetor[i]);
			} catch (Exception ex){ //Qualquer excessao cai aqui, se n houver so printa normal 
			System.out.println("Posicao inexistente!"+i);
			} /*catch (ArrayIndexOutOfBoundsException ex){
				System.out.println("Posicao inexistente!"+i);
			}*/
		}
	}
}
