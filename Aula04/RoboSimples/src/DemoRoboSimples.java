public class DemoRoboSimples {

	public static void main(String[] args) {
		// Criação dos robos utilizando diferentes construtores a partir da
		// sobrecarga de métodos
		RoboSimples quebraOsso = new RoboSimples("Quebra Osso", 20, 10, 'S');
		RoboSimples barbaridade = new RoboSimples("Che Barbaridade!");
		RoboSimples semNome = new RoboSimples();
		// Movimentação dos robos
		quebraOsso.move(10);
		barbaridade.mudaDirecao('L');
		barbaridade.move(5);
		semNome.move();
		// Apresenta a posição atual de cada robô
		System.out.print(quebraOsso);
		System.out.print(barbaridade);
		System.out.print(semNome);
	}
}
