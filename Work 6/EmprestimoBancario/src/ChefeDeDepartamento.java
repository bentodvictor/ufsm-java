
public class ChefeDeDepartamento extends Funcionario {
	private String departamento;
	private Data promocaoAChefe;
	
	public ChefeDeDepartamento(String nome, int id, Data nasc, 
			Data adm, float sal, String dep, Data prom) {
		// Chama construtor na classe pai (Funcionario)
		super(nome, id, nasc, adm, sal);
		departamento = dep;
		promocaoAChefe = prom;
	}

	public String toString() {
		// super e  uma referencia para o pai, executando o metodo toString de Funcionario nesse caso
		return super.toString() + "Departamento: " + departamento + " Data de Promocao: " + promocaoAChefe + "\n";
	}
	
	public String qualDepartamento() {
		return departamento;
	}
}
