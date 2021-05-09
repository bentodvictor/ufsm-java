package exercicios;

/*
 * 5.8) Escreva a classe ConversaoDeUnidadesDeTempo com métodos estáticos para conversão aproximada das unidades de velocidade segundo a lista abaixo.

• 1 minuto = 60 segundos 
• 1 hora = 60 minutos
• 1 dia = 24 horas
• 1 semana = 7 dias
• 1 mês = 30 dias
• 1 ano = 365.25 dias
 */

public class ConversaoDeUnidadesDeTempo {

	private static double sec, min, hr, day;			// Atributos
	
	public static void minToSec(double min){			// Metodo que converte minutos -> segundos
		sec = (min * 60);
		System.out.println(sec);
	}
	
	public static void hourToMin(double hour){			// Metodo que converte horas -> minutos
		min = (hour * 60);
		System.out.println(min);
	}
	
	public static void dayToHour(double day){			// Metodo que converte dias -> horas
		hr = (day * 24);
		System.out.println(hr);
	}
	
	public static void weekToDay(double week){			// Metodo que converte semanas -> dias
		day = (week * 7);
		System.out.println(day);
	}
	
	public static void monthToDay(double month){			// Metodo que converte meses -> dias
		day = (month * 30);
		System.out.println(day);
	}
	
	public static void yearToDay(double year){			// Metodo que converte anos -> dias
		day = (float) (year * 365.25);
		System.out.println(day);
	}
	
	
	// Método principal
	public static void main(String[] args) {
		minToSec(1);
		hourToMin(1);
		dayToHour(1);
		weekToDay(1);
		monthToDay(1);
		yearToDay(1);

	}

}
