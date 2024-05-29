package proxy.solucao;

import java.time.LocalDate;

import builder.Pessoa;
import proxy.PessoaService;

public class TestePessoaComProxy {

	public static void main(String[] args) {
		PessoaRepositoryProxy pessoaRepositoryProxy = new PessoaRepositoryProxy();
		PessoaRepositoryProxy2 pessoaRepositoryProxy2 = new PessoaRepositoryProxy2();
		
		PessoaService pessoaService = new PessoaService(pessoaRepositoryProxy2);

		Pessoa pessoa = new Pessoa.PessoaBuilder()
				.sobrenome("Monteiro 2")
				.email("manoel123@email.com")
				.documento("1234455667")
				.apelido("Manel")
				.dataNascimento(LocalDate.of(1996, 02, 28))
				.build();
		pessoaService.save(pessoa);

		Pessoa pessoaRetornada = pessoaService.findById(1L);
		System.out.println(pessoaRetornada);
		
		Pessoa pessoaRetornadaCache = pessoaService.findById(1L);
		System.out.println(pessoaRetornadaCache);
	}
}
