package singleton.solucao;

import java.util.HashMap;
import java.util.Map;

public class AgendaSingletonEAGER {
	
	// Cria o atributo estático, por poder existir somente uma instância deste objeto.
	// Deve-se ter o NEW por ele ser final.
	private static final AgendaSingletonEAGER INSTANCE = new AgendaSingletonEAGER();

	private Map<String, Boolean> diasDisponiveis = new HashMap<>();

	private AgendaSingletonEAGER() {
		diasDisponiveis.put("Domingo", Boolean.TRUE);
		diasDisponiveis.put("Segunda", Boolean.TRUE);
		diasDisponiveis.put("Terça", Boolean.TRUE);
		diasDisponiveis.put("Quarta", Boolean.TRUE);
		diasDisponiveis.put("Quinta", Boolean.TRUE);
		diasDisponiveis.put("Sexta", Boolean.TRUE);
		diasDisponiveis.put("Sabado", Boolean.TRUE);
	}
	
	// Método de recuperação da instância.
	public static AgendaSingletonEAGER getInstance() {
		return INSTANCE;
	}

	public Map<String, Boolean> getDias() {
		return diasDisponiveis;
	}

	public void ocupa(String dia) {
		diasDisponiveis.replace(dia, Boolean.FALSE);
	}

}
