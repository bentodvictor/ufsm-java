import java.io.*;

public class ExemploExcecaoArquivo1 {
	public static void main(String args[]) {
		for (int i = 0; i  < 2 ; i++) {
			try {
				FileReader r = new FileReader("Arquivo"+i+".txt");
			} catch (FileNotFoundException e) {
				System.out.println("Arquivo inexistente " + i);
			} finally {
				System.out.println("Codigo Finally!");
			}
		}
	}
}

