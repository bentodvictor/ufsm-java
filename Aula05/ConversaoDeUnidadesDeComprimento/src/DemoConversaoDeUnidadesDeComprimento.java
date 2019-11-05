
public class DemoConversaoDeUnidadesDeComprimento {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConversaoDeUnidadesDeComprimento conv = new ConversaoDeUnidadesDeComprimento();
		System.out.println("20 pés são " + 
				conv.pesParaCentimetros(20) + " em cm!");
		System.out.println("5 polegadas são " + 
				conv.polegadasParaCentimetros(5) + " em cm!");
		System.out.println("20 pés são " + 
				ConversaoDeUnidadesDeComprimento.pesParaCentimetros(20) + " em cm!");
		System.out.println("5 polegadas são " + 
				ConversaoDeUnidadesDeComprimento.polegadasParaCentimetros(5) + " em cm!");
	}

}
