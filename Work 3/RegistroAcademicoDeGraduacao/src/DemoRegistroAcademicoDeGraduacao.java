
public class DemoRegistroAcademicoDeGraduacao {
	public static void main(String args[]) {
		RegistroAcademicoDeGraduacao aluno1, aluno2;
		Data data1 = new Data(1, 1, 1990);
		aluno1 = new RegistroAcademicoDeGraduacao("Michael Goodrich", data1, 20120090, (byte)2, 50);
		aluno2 = new RegistroAcademicoDeGraduacao("Michael Goodrich - correto!", data1, 20120091, (byte)2);
		System.out.println(aluno1);
		System.out.println(aluno2);
		// Por�m, cuidado! Os dados s�o referenciados!
		// Se habilitarmos o c�digo abaixo, o qu� acontece?
//		data1.setAno(1995);
//		System.out.println(aluno1);
//		System.out.println(aluno2);
		aluno1 = new RegistroAcademicoDeGraduacao("Michael Goodrich - A miss�o", new Data(2, 2, 1990), 20120090, (byte)2, 50);
		aluno2 = new RegistroAcademicoDeGraduacao("Michael Goodrich - A miss�o - correto!", new Data(2, 2, 1990), 20120091, (byte)2);
		System.out.println(aluno1);
		System.out.println(aluno2);
	}
}
