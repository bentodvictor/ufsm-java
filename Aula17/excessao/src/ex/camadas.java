/* 
 * Gerem um c�digo que exemplifique a gera��o de um erro
 * que ir� passar por tr�s camadas do software at� a exce��o
 * ser tratada
 *  
 *  Func A try-cat <- Func B throw<- Func C
 */
package ex;

public class camadas{
	public static void main(String args[]){
	int x=10;	
	try
	{
		b();
	}catch(Exception e)
	{
		System.out.println("Achou exce��o");
		e.printStackTrace();
		}
	finally { //executa de qualquer jeito
		System.out.println("Erro doido");
		}
	}
	
	public static void b() throws Exception{
		c();
	}

	public static void c() throws Exception{
		throw new Exception ("e");
	}
}