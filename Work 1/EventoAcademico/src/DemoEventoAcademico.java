public class DemoEventoAcademico {

	public static void main(String[] args) {
		// Referencias para os objetos representando os eventos
		EventoAcademico SBESC2014;
		EventoAcademico RTSS2014;
		// Datas para criar os eventos
		Data data1 = new Data();
		Data data2 = new Data();
		// Inicio e fim do primeiro evento
		data1.inicializaData((byte)3, (byte)11, (short)2014);
		data2.inicializaData((byte)7, (byte)11, (short)2014);
		// Instancia primeiro evento academico
		SBESC2014 = new EventoAcademico("Simp—sio Brasileiro de Engenharia de Sistemas Computacionais",
				"Manaus", data1, data2, 500);
		// Inicio e fim do primeiro evento
		data1.inicializaData((byte)2, (byte)12, (short)2014);
		data2.inicializaData((byte)5, (byte)12, (short)2014);
		// Instancia segundo evento academico
		RTSS2014 = new EventoAcademico("Real-Time Systems Symposium",
				"Rome", data1, data2, 250);
		System.out.print(SBESC2014);
		System.out.print(RTSS2014);
	}

}
