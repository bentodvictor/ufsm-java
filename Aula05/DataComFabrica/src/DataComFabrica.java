
public class DataComFabrica {

	private int dia, mes, ano;
	
	DataComFabrica(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public String toString() {
		return dia + "/" + mes + "/" + ano; 
	}
	
	// F‡brica de inst‰ncia da classe DataComFabrica, reproduzindo 
	// objetos relativos ao natal de determinado ano!
	public static DataComFabrica Natal(int ano) {
		return new DataComFabrica(25, 12, ano);
	}
}
