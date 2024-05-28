package builder.solucao;

import java.time.LocalDate;

import builder.Pessoa;

public class TestePessoaComBuilder {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa.PessoaBuilder()
				.nome("Manoel")
				.sobrenome("Monteiro")
				.email("manoel123@email.com")
				.documento("1234455667")
				.apelido("Manel")
				.dataNascimento(LocalDate.of(1996, 02, 28))
				.build();

		System.out.println(pessoa);
	}
}
