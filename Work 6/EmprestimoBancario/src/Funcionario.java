
// Mecanismo de Heranca (Funcionario herda todas as informacoes de Pessoa)
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
		// Palavra-chave super novamente, acessando metodo da classe pai (herdada)
		return super.toString() + "Admissao: " + admissao + "Salario: " + salario + "\n";
	}
	
	// Palavra-chave final indica que esse metodo nao pode ser sobreposto por outros metodos de mesma
	// assinatura em classes filhas (herdeiras)
	public final float qualSalario() {
		return salario;
	}
}
