
public class RegistroAcademicoDeGraduacao {
	private String nomeDoAluno;
	// Delegação ou Composição
	private Data dataDeNascimento;
	private int numeroDeMatricula;
	private byte codigoDoCurso;
	private double percentualDeCobranca;
	
	public static final byte SI = 1;
	public static final byte CC = 2;
	public static final byte EC = 3;
	public static final byte ES = 4;
	
	public RegistroAcademicoDeGraduacao(String n, Data d, int m, byte c, double p) {
		nomeDoAluno = n;
		// Associa valores ao objeto do tipo Data
		dataDeNascimento = d;
		numeroDeMatricula = m;
		codigoDoCurso = c;
		percentualDeCobranca = p;
	}
	
	public RegistroAcademicoDeGraduacao(String n, Data d, int m, byte c) {
		this(n, d, m, c, 100);
	}
	
	public double calculaMensalidade() {
		double mensalidade = 0;
		switch (codigoDoCurso) {
			case SI:
				mensalidade = 400;
				break;
			case CC:
				mensalidade = 450;
				break;
			case EC:
				mensalidade = 500;
				break;
			case ES:
				mensalidade = 450;
				break;
			default:
				return mensalidade;
		}
		return (mensalidade * 100 / percentualDeCobranca);
	}
	
	public String toString() {
		String imprimir = "Matrícula:  " + numeroDeMatricula + "\nNome: " + nomeDoAluno + "\n";
		imprimir += "Data de Nascimento: " + dataDeNascimento + "\n";
		imprimir += "Código do Curso: " + codigoDoCurso + "\n";
		imprimir += "Percentual de Cobrança: " + percentualDeCobranca + "\n";
		return imprimir;				
	}
}
