package proxy.problema;

import java.time.LocalDate;

import builder.Pessoa;
import proxy.PessoaRepository;
import proxy.PessoaService;

public class PessoaTest {

	public static void main(String[] args) {
		PessoaService pessoaService = new PessoaService(new PessoaRepository());
		
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
		
	}
}
