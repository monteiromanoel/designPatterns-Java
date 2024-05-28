package proxy;

import java.util.HashMap;
import java.util.Map;

import builder.Pessoa;

public class PessoaRepository {

	// Map para simular o banco de dados
	private Map<Long, Pessoa> banco = new HashMap<>();
	
	private static Long countId = 1L;
	
	public void save(Pessoa pessoa) { 
		banco.put(countId++, pessoa); 
	}
	
	public Pessoa findById(Long id) { 
		try {
			// Faz a thread aguardar 3 segundos para simular o tempo de resposta
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		// Retorna a pessoa com o id informado
		return banco.get(id); 
	}
}
