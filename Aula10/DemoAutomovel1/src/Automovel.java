
public class Automovel {

	public static final int MOVIDOAGASOLINA = 1;
	public static final int MOVIDOAALCOOL = 2;
	public static final int MOVIDOADIESEL = 3;
	public static final int MOVIDOAGAS = 4;
	
	private static final int NUMEROMAXIMODEPRESTACOES = 24;
	
	public String modelo, cor;
	private int combustivel;
	
	Automovel(String modelo, String cor, int combustivel) {
		this.modelo = modelo;
		this.cor = cor;
		this.combustivel = combustivel;
	}
	
	public float quantoCusta() {
		float valor = 0;
		switch (combustivel) {		// por padrão, valores reais são considerados double 
			case MOVIDOAGASOLINA:
				valor = 100000.00f;		// f indica que a variável contém um valor float
				break;
			case MOVIDOAALCOOL: 
				valor = (float)90000.00; 	// ou uso de casting para float
				break;
			case MOVIDOADIESEL: 
				valor = 110000.00f;
				break;
			case MOVIDOAGAS: 
				valor = (float)120000.00;		
				break;
		}
		return valor;
	}
	
	public int quantasPrestacoes() {
		return NUMEROMAXIMODEPRESTACOES;
	}
	
	public String toString() {
		String imprimir = modelo + " - " + cor + "\n";
		switch (combustivel) {	 
			case MOVIDOAGASOLINA:
				imprimir += "Movido a gasolina!\n";
				break;
			case MOVIDOAALCOOL: 
				imprimir += "Movido a álcool!\n";
				break;
			case MOVIDOADIESEL: 
				imprimir += "Movido a diesel!\n";
				break;
			case MOVIDOAGAS: 
				imprimir += "Movido a gás!\n";
				break;
		}
		return imprimir;
	}
}
