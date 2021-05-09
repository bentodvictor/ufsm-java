public class RoboSimples {
	private String nomeDoRobo;
	private int posicaoXAtual, posicaoYAtual;
	private char direcaoAtual;

	public RoboSimples(String n, int px, int py, char d) {
		nomeDoRobo = n;
		posicaoXAtual = px;
		posicaoYAtual = py;
		direcaoAtual = d;
	}

	public RoboSimples(String n) {
		this(n, 0, 0, 'N');	//Chama construtor padrão
/*
  		nomeDoRobo = n;
		posicaoXAtual = 0;
		posicaoYAtual = 0;
		direcaoAtual = 'N';
*/
	}

	public RoboSimples() {
		this("", 0, 0, 'N');	//Chama construtor padrão
/*	
		nomeDoRobo = "";
		posicaoXAtual = 0;
		posicaoYAtual = 0;
		direcaoAtual = 'N';
*/
	}

	public void move() {
		if (direcaoAtual == 'N')
			posicaoYAtual++;
		if (direcaoAtual == 'S')
			posicaoYAtual--;
		if (direcaoAtual == 'L')
			posicaoXAtual++;
		if (direcaoAtual == 'O')
			posicaoXAtual--;
	}

	public void move(int passos) {
		if (direcaoAtual == 'N')
			posicaoYAtual += passos;
		if (direcaoAtual == 'S')
			posicaoYAtual -= passos;
		if (direcaoAtual == 'L')
			posicaoXAtual += passos;
		if (direcaoAtual == 'O')
			posicaoXAtual -= passos;
	}
	
	public void mudaDirecao(char novaDirecao) {
		direcaoAtual = novaDirecao;
	}
	
	public String toString() {
		String posicao;
		posicao = "Nome do Robô: " + nomeDoRobo + "\n";
		posicao += "Posição do Robô: (" + posicaoXAtual + "," + posicaoYAtual + ")\n";
		posicao += "Direção do Robô: " + direcaoAtual + "\n";
		return posicao;
	}
}
