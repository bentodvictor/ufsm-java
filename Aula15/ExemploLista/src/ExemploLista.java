
import java.util.Iterator;
import java.util.LinkedList;

public class ExemploLista {
	public static void main(String args[]) {
		// Cria 4 pessoas:
		PessoaY a = new PessoaY("D",1);
		PessoaX b = new PessoaX("C",2);
		PessoaX c = new PessoaX("B",3);
		PessoaY d = new PessoaY("A",4);
		
		// Cria lista (do tipo interface List) que implementa uma lista encadeada (LinkedList)
		// Essa lista é definida para lidar com elementos da classe PessoaX (assim como suas classes filhas)
		java.util.List<PessoaX> lista = new LinkedList<PessoaX>();
		
		// Utilizando método da coleção (add) para adicionar objetos do tipo PessoaX e PessoaY
		lista.add(a);
		lista.add(b);
		lista.add(c);
		lista.add(d);
		
		// Utiliza método size() para obter a quantidade de elementos da lista
		System.out.println("Tamanho de elementos na lista: " + lista.size());
		
		// Utiliza método contains() para verificar se o objeto a existe ou não
		if (lista.contains(a)) {
			System.out.println("Contém Elemento: " + a);
		}
		
		// Utiliza iterador para imprimir todos os elementos da lista
		for (Iterator<PessoaX> it = lista.iterator(); it.hasNext(); ) {
			PessoaX t = it.next();
			System.out.print("Lista: " + t);
		}
		
		// Utiliza método para remove() para remover elemento da lista 
		lista.remove(a);
		
		// Utiliza iterador para imprimir todos os elementos da lista
		System.out.println();
		for (Iterator<PessoaX> it = lista.iterator(); it.hasNext(); ) {
			PessoaX t = it.next();
			System.out.print("Lista: " + t);
		}
		// Utiliza método size() para obter a quantidade de elementos da lista
		System.out.println("Tamanho de elementos na lista: " + lista.size());		
	}
}

class PessoaX {
	private String nome;
	private int id;
	
	public PessoaX(String nome, int id) {
		this.nome = nome;
		this.id = id;
	}
	
	protected int getId() {
		return id;
	}
	
	protected String getNome() {
		return nome;
	}
	
	public String toString() {
		return "PessoaX (" + id + "): " + nome + "\n";
	}
}

class PessoaY extends PessoaX {
	
	public PessoaY(String nome, int id) {
		super(nome, id);
	}
	
	public String toString() {
		return "PessoaY (" + this.getId() + "): " + this.getNome() + "\n";
	}
}