public class DemoRoboAbstrato {

	public static void main(String[] args) {
		RoboSimples quebraOsso = new RoboSimples("Quebra Osso", 20, 10, 90);
		System.out.println(quebraOsso);
		quebraOsso.move(10);
		System.out.println(quebraOsso);
		quebraOsso.mudaDirecao(180);
		System.out.println(quebraOsso);
		quebraOsso.move();
		System.out.println(quebraOsso);
		quebraOsso.move();
		System.out.println(quebraOsso);
		
		System.out.println("-----------------------");
		
		RoboABateria barbaridade = new RoboABateria("Che Barbaridade!", 0, 0, 90, 111);
		System.out.println(barbaridade);
		barbaridade.move(5);
		System.out.println(barbaridade);
		barbaridade.mudaDirecao(45);
		System.out.println(barbaridade);
		barbaridade.move(4);
		System.out.println(barbaridade);
		barbaridade.move();
		System.out.println(barbaridade);
		
		System.out.println("-----------------------");

		// N‹o Ž poss’vel instanciar uma classe abstrata
//		RoboAbstrato ra = new RoboAbstrato("Vai?", 0, 0, 90);
	}
}
