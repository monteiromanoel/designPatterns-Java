package proxy;

import builder.Pessoa;

public interface ProxyPessoa {

	// Métodos abstratos
	void save(Pessoa pessoa);
	
	Pessoa findById(Long id);
}
