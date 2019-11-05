package exercicio;

/*
 * 5.2) Escreva, para a classe DataComFabrica (figura 5.11), um método seteDeSetembro que se comporte como uma fábrica de instâncias.
 */

public class DataComFabrica {

	private short dia, mes, ano;			// Atributos
	
	public DataComFabrica(short dia, short mes, short ano) {			// Construtor
		if ((dia >= 1 && dia <= 31) && (mes >= 1 && mes <= 12) && (ano > 0 && ano < 2018)){		// Condição para testar uma data valida
			if((mes == 2) && (dia >= 28)){			// Condição para o mes de fevereiro
				this.dia = 0;	
				this.mes = 0;
				this.ano = 0;
				System.out.print("Data invalida!   ->   ");
			}else{
				this.dia = dia;	
				this.mes = mes;
				this.ano = ano;
			}
		}else{
			this.dia = 0;	
			this.mes = 0;
			this.ano = 0;
		}
	}
	
	public static DataComFabrica seteDeSetembro(short ano){			// fabrica de instancias
		return new DataComFabrica((short)7, (short)1 , ano);
	}

	public String toString(){
		return (dia + "/" + mes + "/" + ano);
	}
	
	/* =======Metodo principal==========*/
	public static void main(String[] args) {		 
		
		// Contrutor
		DataComFabrica f1 = new DataComFabrica((short)29, (short)2, (short)1985);
		System.out.print(f1 + "\n");
		
		// Fabrica de instancias
		DataComFabrica f2 = DataComFabrica.seteDeSetembro((short)2017);
		System.out.print(f2);
		
		
	}

}
