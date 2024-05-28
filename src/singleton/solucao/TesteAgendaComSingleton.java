package singleton.solucao;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TesteAgendaComSingleton {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		/*
		 * EAGER AgendaSingletonEAGER agenda1 = AgendaSingletonEAGER.getInstance();
		 * AgendaSingletonEAGER agenda2 = AgendaSingletonEAGER.getInstance();
		 * System.out.println(agenda1); System.out.println(agenda2);
		 * 
		 * reservaDiaEAGER("Sexta"); reservaDiaEAGER("Quinta");
		 */

		// LAZY
		/*
		 * AgendaSingletonLAZY agenda1 = AgendaSingletonLAZY.getInstance();
		 * AgendaSingletonLAZY agenda2 = AgendaSingletonLAZY.getInstance();
		 * System.out.println(agenda1); System.out.println(agenda2);
		 */

		// reflection usando a classe lazy
		/*
		 * // Acessa o construtor da classe e declara ele como público
		 * Constructor<AgendaSingletonLAZY> construtorTravesso =
		 * AgendaSingletonLAZY.class.getDeclaredConstructor(); // Deixa o construtor
		 * acessível construtorTravesso.setAccessible(true); // Cria uma nova instance à
		 * partir do construtor agora público AgendaSingletonLAZY agendaTravessa =
		 * construtorTravesso.newInstance();
		 * 
		 * System.out.println("Agenda Travessa:" + agendaTravessa);
		 */

		// ENUM
		AgendaSingletonENUM agenda1 = AgendaSingletonENUM.getInstance();
		AgendaSingletonENUM agenda2 = AgendaSingletonENUM.getInstance();
		System.out.println(agenda1.hashCode());
		System.out.println(agenda2.hashCode());

		// Reflection usando o ENUM

		Constructor<AgendaSingletonENUM> construtorTravesso = AgendaSingletonENUM.class.getDeclaredConstructor();
		construtorTravesso.setAccessible(true);
		AgendaSingletonENUM agendaTravessa = construtorTravesso.newInstance();

		System.out.println("Agenda Travessa:" + agendaTravessa);

		reservaDiaENUM("Sexta");
		reservaDiaENUM("Quinta");

	}

	public static void reservaDiaEAGER(String dia) {
		AgendaSingletonEAGER agenda = AgendaSingletonEAGER.getInstance();
		agenda.ocupa(dia);
		System.out.println(agenda.getDias());
	}

	public static void reservaDiaLAZY(String dia) {
		AgendaSingletonLAZY agenda = AgendaSingletonLAZY.getInstance();
		agenda.ocupa(dia);
		System.out.println(agenda.getDias());
	}

	public static void reservaDiaENUM(String dia) {
		AgendaSingletonENUM agenda = AgendaSingletonENUM.getInstance();
		agenda.ocupa(dia);
		System.out.println(agenda.getDias());
	}

}
