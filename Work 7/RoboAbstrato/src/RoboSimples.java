public class RoboSimples extends RoboAbstrato {
	
	public RoboSimples(String n, int px, int py, int d) {
		super(n, px, py, d);
	}

	// Implementação do método abstrato: obrigatória ao herdar uma classe abstrata
	public void move(int passos) {
		switch (qualDirecaoAtual()) {
			case 0: 	
				moveX(+passos); 
				break;
			case 90: 	
				moveY(+passos); 
				break;
			case 180: 	
				moveX(-passos); 
				break;
			case 270: 	
				moveY(-passos); 
				break;
		}
	}
}