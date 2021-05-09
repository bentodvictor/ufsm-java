
public class Pessoa {
	private String nome;
	private int identidade;
	private Data nascimento;
	
	public Pessoa(String n, int i, Data d) {
		nome = n;
		identidade = i;
		nascimento = d;
	}
	
	public String toString() {
		return "Nome: " + nome + " - ID: " + identidade + "Nasc.: " + nascimento + "\n";
	}
}
