
public class AutomovelBasico extends Automovel {
	private boolean abs, airbag, multimidia;
	
	AutomovelBasico(String m, String c, int comb,
					boolean a, boolean ag, boolean ma) {
		super(m, c, comb);
		abs = a;
		airbag = ag;
		multimidia = ma;
	}

	AutomovelBasico(String m, String c, int comb) {
		super(m, c, comb);
		abs = true;
		airbag = true;
		multimidia = true;
	}
	
	public float quantoCusta() {	// Sobreposição com o mesmo método pai
		float preco = super.quantoCusta();
		if (abs) preco += 2000; 
		if (airbag) preco += 2000;
		if (multimidia) preco += 2000;
		return preco;
	}

	public String toString() {		// Sobreposição com o mesmo método pai
		String imprimir = super.toString();
		if (abs) imprimir += "Com ABS!\n"; 
		if (airbag) imprimir += "Com Airbag!\n"; 
		if (multimidia) imprimir += "Com Central Multimídia!\n";
		return imprimir;
	}
}
