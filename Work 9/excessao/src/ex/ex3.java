package ex;

public class ex3 {
	public static void main(String args[]){
		String vetor[] = {"Exemplo","Teste"};
		for(int i=0;i<=2;i++){
			try{
				throw new Exception("Erro");
			 }catch (Exception ex){ //Qualquer uma cai aqui
				 if (i == vetor.length) {
					 System.out.println("Exceçao em imprimir Vetor(String)!");
					 ex.getCause();
					 System.out.println(ex);
				 }
				 else
					 System.out.println(vetor[i]); 
			} 
		}
	}
}
