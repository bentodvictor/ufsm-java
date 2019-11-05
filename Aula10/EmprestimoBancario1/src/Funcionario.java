
// Mecanismo de Herança (Funcionario herda todas as informações de Pessoa)
public class Funcionario extends Pessoa {
	private float salario;
	private Data admissao;
	
	Funcionario(String nome, int id, Data nasc, Data adm, float sal) {
		// Chama o construtor da classe pai
		super(nome, id, nasc);
		admissao = adm;
		salario = sal;
	}
	
	public String toString() {
		// Palavra-chave super novamente, acessando método da classe pai (herdada)
		return super.toString() + "Admissão: " + admissao + "Salário: " + salario + "\n";
	}
	
	// Palavra-chave final indica que esse método não pode ser sobreposto por outros métodos de mesma
	// assinatura em classes filhas (herdeiras)
	public final float qualSalario() {
		return salario;
	}
}
