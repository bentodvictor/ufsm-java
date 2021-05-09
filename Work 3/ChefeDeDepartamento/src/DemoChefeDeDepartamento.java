
public class DemoChefeDeDepartamento {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario theMan = new Funcionario("The Man", 12345, new Data(1, 2, 1990), 
				new Data(2, 1, 2010), 2000);
		ChefeDeDepartamento theBoss = new ChefeDeDepartamento("The Boss", 12345, new Data(1, 2, 1980), 
				new Data(2, 1, 2000), 4000,
				"Recursos Humanos", new Data(1, 2, 2005));
		System.out.println(theMan);
		System.out.println(theBoss);
	}

}
