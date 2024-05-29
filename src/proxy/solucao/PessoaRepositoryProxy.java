package proxy.solucao;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;

import builder.Pessoa;
import proxy.PessoaRepository;
import proxy.ProxyPessoa;

public class PessoaRepositoryProxy extends PessoaRepository implements ProxyPessoa {
	
	// Utilizando o Logger para monitorar as chamadas do método
	private static Logger log = Logger.getLogger(PessoaRepositoryProxy.class.getName());
	
	private Map<Long, Pessoa> cache = new HashMap<>();
	
	//Sobrescrevendo o método save da superclasse
	@Override
	public void save(Pessoa pessoa) {
		// Adicionando um log para o início da chamada
		log.info("Iniciando chamada do método save");
		super.save(pessoa);
		// Adicionando um log para o final da chamada
		log.info("Chamada do método save finalizada");
	}
	
	//Sobrescrevendo o método findById da superclasse
	@Override
	public Pessoa findById(Long id) {
		
		// Adicionando um log para o início da chamada
		log.info("Iniciando chamada do método findById");
		
		// Marcando o tempo inicial de execução
		long inicio = System.currentTimeMillis();
		
		// Instanciando o objeto pessoa para retorno em várias partes
		Pessoa pessoa = null;
		
		// Verificando se o dado existe no cache
		if(Objects.nonNull(cache.get(id))) {
			log.info("Pegando dado do cache");
			
			// retornando o dado do cache caso exista
			pessoa = cache.get(id);
		} else {
			log.info("Pegando de PessoaRepository");
			pessoa = super.findById(id);
			
			// Colocando o dado no cache caso ainda não exista
			cache.put(id, pessoa);
			log.info("Dado adicionado ao cache");
		}	
		
		// Log informando o final da chamada
		log.info("Chamada do método findById finalizada");
		
		// Calculando o tempo final de execução
		long fim = System.currentTimeMillis();
		
		// Mostrando todo o tempo de execução
		log.info("Tempo de execução: " + (fim - inicio));
		return pessoa;
	}

}
