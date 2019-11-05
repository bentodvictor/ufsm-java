class Data {
	private byte dia, mes;
	short ano;
	
	public Data(byte d, byte m, short a) {
		dia = d;
		mes = m;
		ano = a;
	}

	public void modificarData(byte d, byte m, short a) {
		dia = d;
		mes = m;
		ano = a;
	}

	public byte retornaDia() {
		return dia;
	}

	public byte retornaMes() {
		return mes;
	}

	public short retornaAno() {
		return ano;
	}
}
