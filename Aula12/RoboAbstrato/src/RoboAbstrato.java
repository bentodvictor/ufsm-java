
// Classes abstratas não podem ser instanciadas
public abstract class RoboAbstrato {

	// Campos não podem ser abstratos: ou é utilizado na classe (private), 
	// ou herdado (está pronto para ser usado pelas classes filhas)
	private String nomeRobo;
	private int posicaoXAtual, posicaoYAtual;
	private int direcaoAtual;	// em graus nesse momento
	
	// Construtores não podem ser abstratos: construtores inicializam informações 
	// específicas da classe. Como redefinir construtor para uma classe ancestral?
	RoboAbstrato(String n, int px, int py, int d) {
		nomeRobo = n;
		posicaoXAtual = px;
		posicaoYAtual = py;
		direcaoAtual = d;
	}
	
	public void move() {
		// Executa método abstrato!
		move(1);
	}
	
	// Método abstrato não tem corpo de execução
	public abstract void move(int passos);
	
	public void moveX(int passos) {
		posicaoXAtual += passos;
	}

	public void moveY(int passos) {
		posicaoYAtual += passos;
	}
	
	public void mudaDirecao(int novaDirecao) {
		direcaoAtual = novaDirecao;
	}
	
	public int qualDirecaoAtual() {
		return direcaoAtual;
	}
	
	public String toString() {
		String posicao;
		posicao = "Nome do Robô: " + nomeRobo + "\n";
		posicao += "Posição do Robô: (" + posicaoXAtual + "," + posicaoYAtual + ")\n";
		posicao += "Direção do Robô: " + direcaoAtual + "\n";
		return posicao;
	}
}
