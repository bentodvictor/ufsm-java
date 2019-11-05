/* 
 * Gerem um código que exemplifique a geração de um erro
 * que irá passar por três camadas do software até a exceção
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
		System.out.println("Achou exceção");
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