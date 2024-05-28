package singleton.solucao;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class AgendaSingletonLAZY {
	
	// Cria o atributo estático, por poder existir somente uma instância deste objeto.
	// Deve-se ser nulo.
	private static AgendaSingletonLAZY INSTANCE = null;

	private Map<String, Boolean> diasDisponiveis = new HashMap<>();

	private AgendaSingletonLAZY() {
		diasDisponiveis.put("Domingo", Boolean.TRUE);
		diasDisponiveis.put("Segunda", Boolean.TRUE);
		diasDisponiveis.put("Terça", Boolean.TRUE);
		diasDisponiveis.put("Quarta", Boolean.TRUE);
		diasDisponiveis.put("Quinta", Boolean.TRUE);
		diasDisponiveis.put("Sexta", Boolean.TRUE);
		diasDisponiveis.put("Sabado", Boolean.TRUE);
	}
	
	// Método de recuperação da instância.
	public static AgendaSingletonLAZY getInstance() {
		if(Objects.isNull(INSTANCE)) {
			INSTANCE = new AgendaSingletonLAZY();
			return INSTANCE;
		}
		return INSTANCE;
	}

	public Map<String, Boolean> getDias() {
		return diasDisponiveis;
	}

	public void ocupa(String dia) {
		diasDisponiveis.replace(dia, Boolean.FALSE);
	}

}
